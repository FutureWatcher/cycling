package bike.cycling.dao.imp;

import bike.cycling.dao.service.GenericDAO;
import bike.cycling.dao.service.MessageDao;
import bike.cycling.model.Messages;

/**
 * Created by MrH on 2017/4/25.
 */
public abstract class MessageDaoImp<T extends Messages,Long> extends GenericDaoImp<T,Long> implements MessageDao {

    public MessageDaoImp(Class entityClass) {
        super(entityClass);
    }

}
