package bike.cycling.dao.imp;

import bike.cycling.dao.service.RoleDao;
import bike.cycling.model.Role;

/**
 * Created by MrH on 2017/4/25.
 */
public abstract class RoleDaoImp<T extends Role,ID> extends GenericDaoImp<T,ID> implements RoleDao {

    public RoleDaoImp(Class entityClass) {
        super(entityClass);
    }
}
