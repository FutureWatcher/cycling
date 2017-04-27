package bike.cycling.dao.imp;

import bike.cycling.dao.service.AdminDao;

/**
 * Created by MrH on 2017/4/25.
 */
public class AdminDaoImp extends RoleDaoImp implements AdminDao
{
    public AdminDaoImp(Class entityClass) {
        super(entityClass);
    }
}
