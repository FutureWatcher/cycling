package bike.cycling.dto;

import org.springframework.stereotype.Component;

/**
 * Created by MrH on 2017/5/3.
 */
@Component
public class UserMessage {
    private String senderLoginName;
    private String receiverLoginName;
    private int type;
    private String content;
    private String time;

    public UserMessage(String senderLoginName, String receiverLoginName, int type, String content, String time) {
        this.senderLoginName = senderLoginName;
        this.receiverLoginName = receiverLoginName;
        this.type = type;
        this.content = content;
        this.time = time;
    }

    public String getSenderLoginName() {
        return senderLoginName;
    }

    public void setSenderLoginName(String senderLoginName) {
        this.senderLoginName = senderLoginName;
    }

    public String getReceiverLoginName() {
        return receiverLoginName;
    }

    public void setReceiverLoginName(String receiverLoginName) {
        this.receiverLoginName = receiverLoginName;
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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
