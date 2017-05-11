package bike.cycling.model;

/**
 * 好友消息实体
 */

import com.sun.istack.internal.NotNull;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 * Created by DELL on 2017/4/25.
 */
@Entity
public class SingleMessages extends Messages {
    @ManyToOne
    @NotNull
    protected User receiver;//接收人

    public User getReceiver() {
        return receiver;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }
}
