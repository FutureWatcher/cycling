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
@Entity
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    @NotNull
    @ManyToOne
    protected  User promulgator;//评论者

    @NotNull
    @Column(nullable = false)
    protected String content;//内容

    @NotNull
    @Column(nullable = false)
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

    public Long getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Comment comment = (Comment) o;

        return id != null ? id.equals(comment.id) : comment.id == null;

    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
