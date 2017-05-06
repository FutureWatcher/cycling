package bike.cycling.dao.imp;

import bike.cycling.dao.service.CyclingDao;
import bike.cycling.model.Cycling;
import org.springframework.stereotype.Repository;

import java.util.Date;

/**
 * Created by MrH on 2017/4/25.
 */
@Repository
public class CyclingDaoImp extends GenericDaoImp<Cycling,Long> implements CyclingDao {
    public CyclingDaoImp(){
        super(Cycling.class);
    }
}
