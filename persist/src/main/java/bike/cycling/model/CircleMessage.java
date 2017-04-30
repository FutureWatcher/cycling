package bike.cycling.model;

/**
 * 圈消息实体
 */

import com.sun.istack.internal.NotNull;

import javax.persistence.*;

/**
 * Created by DELL on 2017/4/25.
 */
@Entity
public class CircleMessage extends Messages{

    @ManyToOne
    protected Circle receiverCircle;//接收圈子

    public Circle getReceiverCircle() {
        return receiverCircle;
    }

    public void setReceiverCircle(Circle receiverCircle) {
        this.receiverCircle = receiverCircle;
    }

}
