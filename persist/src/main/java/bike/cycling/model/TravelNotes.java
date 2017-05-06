package bike.cycling.model;

/**
 * 动态实体
 */

import com.sun.istack.internal.NotNull;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by DELL on 2017/4/26.
 */
@Entity
public class TravelNotes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    @NotNull
    @Column(nullable = false)
    protected String title;//标题

    @ManyToOne(fetch = FetchType.LAZY)
    @NotNull
    protected User belongUser;//发布者

    @ElementCollection
    @CollectionTable(name = "travel_comment")
    @OrderBy("countNum DESC")
    protected Set<Comment> comments = new HashSet<>();//评论

    @Column(nullable = false)
    @NotNull
    protected String content;//内容

    @NotNull
    protected String contentImg;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    protected Date time;

    @Column(nullable = false)
    protected int order;

    @Version
    protected Long version;

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public User getBelongUser() {
        return belongUser;
    }

    public void setBelongUser(User belongUser) {
        this.belongUser = belongUser;
    }

    public Set<Comment> getComments() {
        return comments;
    }

    public void setComments(Set<Comment> comments) {
        this.comments = comments;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContentImg() {
        return contentImg;
    }

    public void setContentImg(String contentImg) {
        this.contentImg = contentImg;
    }

    public Long getVersion() {
        return version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TravelNotes that = (TravelNotes) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        return title != null ? title.equals(that.title) : that.title == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        return result;
    }
}
