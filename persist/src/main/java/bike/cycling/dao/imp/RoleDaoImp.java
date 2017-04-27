package bike.cycling.dao.imp;

import bike.cycling.dao.service.RoleDao;

/**
 * Created by MrH on 2017/4/25.
 */
public abstract class RoleDaoImp extends GenericDaoImp implements RoleDao {

    public RoleDaoImp(Class entityClass) {
        super(entityClass);
    }
}
