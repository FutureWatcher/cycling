package bike.cycling.model;

/**
 * 消息抽象类
 */

import java.util.Date;

/**
 * Created by DELL on 2017/4/25.
 */
public class Messages {
    protected User sender;//发送者
    protected int type;//类型
    protected String content;//内容
    protected Date time;//时间

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
