package bike.cycling.dao;

import org.junit.After;
import org.junit.Before;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * Created by MrH on 2017/4/30.
 */
public abstract class DaoTest {

    protected EntityManager entityManager;
    protected EntityTransaction transaction;


    public void init(){
        entityManager = Persistence.createEntityManagerFactory("bike_test").createEntityManager();
        transaction = entityManager.getTransaction();
    }


    public void discharge(){
        entityManager.close();
    }
}
