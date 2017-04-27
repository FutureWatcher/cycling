package bike.cycling.dao.service;

import com.sun.xml.internal.bind.v2.model.core.ID;

import javax.persistence.LockModeType;
import java.util.List;

/**
 * Created by MrH on 2017/4/25.
 */
public interface GenericDAO<T,ID> {

    T findById(ID id);

    T findById(ID id, LockModeType lockModeType);

    T findReferenceById(ID id);

    List<T> findAll();

    Long getCount();

    T makePersistent(T entity);

    void makeTransient(T entity);

    void checkVersion(T entity, boolean forceUpdate);
}
