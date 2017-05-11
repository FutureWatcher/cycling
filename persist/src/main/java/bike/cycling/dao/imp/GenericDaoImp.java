package bike.cycling.dao.imp;

import bike.cycling.dao.service.GenericDAO;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.LockModeType;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * Created by MrH on 2017/4/25.
 */
@Transactional
public abstract class GenericDaoImp<T,ID> implements GenericDAO<T,ID> {

    @PersistenceContext
    protected EntityManager entityManager;
    private Class entityClass;


    public GenericDaoImp(Class entityClass) {
        this.entityClass = entityClass;
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public T findById(ID id) {
        return (T) entityManager.find(entityClass,id);
    }

    @Override
    public T findById(ID id, LockModeType lockModeType) {
        return (T) entityManager.find(entityClass,id,lockModeType);
    }

    @Override
    public T findReferenceById(ID id) {
        return (T) entityManager.getReference(entityClass,id);
    }

    @Override
    public List<T> findAll() {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<T> criteriaQuery = cb.createQuery(entityClass);
        Root<T> i = criteriaQuery.from(entityClass);
        criteriaQuery.select(i);
        return entityManager.createQuery(criteriaQuery).getResultList();
    }

    @Override
    public Long getCount() {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Long> criteriaQuery = cb.createQuery(Long.class);
        criteriaQuery.select(entityManager.getCriteriaBuilder().count(criteriaQuery.from(entityClass)));
        return entityManager.createQuery(criteriaQuery).getSingleResult();
    }

    @Override
    public T makePersistent(T entity) {
        return entityManager.merge(entity);
    }

    @Override
    public void makeTransient(T entity) {
        entityManager.remove(entity);
    }

    @Override
    public void checkVersion(T entity, boolean forceUpdate) {
        entityManager.lock(
                entity,
                forceUpdate
                        ? LockModeType.OPTIMISTIC_FORCE_INCREMENT
                        : LockModeType.OPTIMISTIC
        );
    }
}
