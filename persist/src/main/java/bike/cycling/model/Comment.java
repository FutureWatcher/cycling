package bike.cycling.model;
/**
 * 评论实体
 */

import com.sun.istack.internal.NotNull;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by DELL on 2017/4/26.
 */
@Embeddable
public class Comment {

    @ManyToOne
    @JoinColumn(nullable = false , name = "promulgator_id")
    protected  User promulgator;//评论者

    @NotNull
    @Column(nullable = false)
    protected String content;//内容

    @NotNull
    @Column(nullable = false)
    protected Date time;//时间

    @NotNull
    @Column(nullable= false)
    protected Long countNum; //点赞数

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


    public Long getCountNum() {
        return countNum;
    }

    public void setCountNum(Long countNum) {
        this.countNum = countNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Comment comment = (Comment) o;

        if (promulgator != null ? !promulgator.equals(comment.promulgator) : comment.promulgator != null) return false;
        if (content != null ? !content.equals(comment.content) : comment.content != null) return false;
        return time != null ? time.equals(comment.time) : comment.time == null;

    }

    @Override
    public int hashCode() {
        int result = promulgator != null ? promulgator.hashCode() : 0;
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (time != null ? time.hashCode() : 0);
        return result;
    }
}
