package bike.cycling.model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * Created by MrH on 2017/4/30.
 */

public class ModelTest {
    private EntityManager entityManager;

    @Test
    public void testModel()
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("bike_test");
        entityManager = emf.createEntityManager();
        entityManager.close();
    }


}
