package bike.cycling.dao.imp;

import bike.cycling.dao.service.CircleDao;
import bike.cycling.model.Circle;
import org.springframework.stereotype.Repository;

/**
 * Created by MrH on 2017/4/25.
 */
@Repository
public class CircleDaoImp extends GenericDaoImp<Circle,Long> implements CircleDao {

    public CircleDaoImp() {
        super(Circle.class);
    }
}
