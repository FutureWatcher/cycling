package bike.cycling.model;

/**
 * 圈消息实体
 */

/**
 * Created by DELL on 2017/4/25.
 */
public class CircleMessage extends Messages{
    protected Circle receiverCircle;//接收圈子

    public Circle getReceiverCircle() {
        return receiverCircle;
    }

    public void setReceiverCircle(Circle receiverCircle) {
        this.receiverCircle = receiverCircle;
    }
}
