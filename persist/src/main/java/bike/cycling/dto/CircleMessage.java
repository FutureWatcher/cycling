package bike.cycling.dto;

/**
 * Created by MrH on 2017/5/3.
 */
public class CircleMessage {
    private String senderLoginName;
    private String senderNikeName;
    private String imagePath;
    private String receiverName;
    private int order;
    private int type;
    private String content;
    private String time;

    public CircleMessage(String senderLoginName, String senderNikeName, String imagePath, String receiverName, int order, int type, String content, String time) {
        this.senderLoginName = senderLoginName;
        this.senderNikeName = senderNikeName;
        this.imagePath = imagePath;
        this.receiverName = receiverName;
        this.order = order;
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

    public String getSenderNikeName() {
        return senderNikeName;
    }

    public void setSenderNikeName(String senderNikeName) {
        this.senderNikeName = senderNikeName;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
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
