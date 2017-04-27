package bike.cycling.model;

/**
 * 消息抽象类
 */

import com.sun.istack.internal.NotNull;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by DELL on 2017/4/25.
 */
public class Messages {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    @NotNull
    @Column(nullable = false)
    protected User sender;//发送者

    @NotNull
    @Column(nullable = false)
    protected int type;//类型

    @NotNull
    @Column(nullable = false)
    protected String content;//内容

    @Temporal(TemporalType.TIMESTAMP)
    @NotNull
    @Column(nullable = false)
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

    public Long getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Messages messages = (Messages) o;

        return id != null ? id.equals(messages.id) : messages.id == null;

    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
