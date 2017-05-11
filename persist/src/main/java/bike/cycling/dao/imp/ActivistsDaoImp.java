package bike.cycling.dao.imp;

import bike.cycling.dao.service.ActivistsDao;
import bike.cycling.model.Activists;
import org.springframework.stereotype.Repository;

/**
 * Created by MrH on 2017/4/25.
 */
@Repository
public class ActivistsDaoImp extends GenericDaoImp<Activists,Long> implements ActivistsDao {
    public ActivistsDaoImp() {
        super(Activists.class);
    }
}
