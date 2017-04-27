package bike.cycling.model;

/**
 * 好友消息实体
 */

/**
 * Created by DELL on 2017/4/25.
 */
public class SingleMessages extends Messages {
    protected User receiver;//接收人

    public User getReceiver() {
        return receiver;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }
}
