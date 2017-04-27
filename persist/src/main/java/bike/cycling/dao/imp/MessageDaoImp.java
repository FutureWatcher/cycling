package bike.cycling.dao.imp;

import bike.cycling.dao.service.GenericDAO;
import bike.cycling.dao.service.MessageDao;

/**
 * Created by MrH on 2017/4/25.
 */
public abstract class MessageDaoImp extends GenericDaoImp implements MessageDao {

    public MessageDaoImp(Class entityClass) {
        super(entityClass);
    }

}
