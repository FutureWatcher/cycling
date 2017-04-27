package bike.cycling.dao.imp;

import bike.cycling.dao.service.CyclingDao;

import java.util.Date;

/**
 * Created by MrH on 2017/4/25.
 */
public class CyclingDaoImp extends GenericDaoImp {
    public CyclingDaoImp(){
        super(CyclingDao.class);
    }
    protected CyclingDaoImp(Class entityClass) {
        super(entityClass);
    }
}
