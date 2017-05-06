package bike.cycling.dao.imp;

import bike.cycling.model.SingleMessages;
import org.springframework.stereotype.Repository;

/**
 * Created by MrH on 2017/4/25.
 */
@Repository
public class SingleMessageDaoImp extends MessageDaoImp<SingleMessages,Long> {
    public SingleMessageDaoImp() {
        super(SingleMessages.class);
    }
}
