package bike.cycling.dao.imp;

import bike.cycling.dao.service.CircleMessageDao;
import bike.cycling.model.CircleMessage;
import org.springframework.stereotype.Repository;

/**
 * Created by MrH on 2017/4/25.
 */
@Repository
public class CircleMessageDaoImp extends GenericDaoImp<CircleMessage,Long> implements CircleMessageDao {
    public CircleMessageDaoImp() {
        super(CircleMessage.class);
    }
}
