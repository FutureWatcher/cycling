package bike.cycling.dao.imp;

import bike.cycling.dao.service.UserDao;

/**
 * Created by MrH on 2017/4/25.
 */
public class UserDaoImp extends RoleDaoImp implements UserDao {
    public UserDaoImp(Class entityClass) {
        super(entityClass);
    }
}
