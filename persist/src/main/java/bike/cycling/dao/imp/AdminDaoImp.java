package bike.cycling.dao.imp;

import bike.cycling.dao.service.AdminDao;
import bike.cycling.model.Admin;
import org.springframework.stereotype.Repository;

/**
 * Created by MrH on 2017/4/25.
 */
@Repository
public class AdminDaoImp extends RoleDaoImp<Admin,Long> implements AdminDao
{
    public AdminDaoImp() {
        super(Admin.class);
    }
}
