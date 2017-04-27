package bike.cycling.model;
/**
 * 评论实体
 */

import java.util.Date;

/**
 * Created by DELL on 2017/4/26.
 */
public class Comment {
    protected  User promulgator;//评论者
    protected String content;//内容
    protected Date time;//时间

    public User getPromulgator() {
        return promulgator;
    }

    public void setPromulgator(User promulgator) {
        this.promulgator = promulgator;
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
