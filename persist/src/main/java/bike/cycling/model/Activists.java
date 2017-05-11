package bike.cycling.model;

/**
 * 官方活动实体
 */

import com.sun.istack.internal.NotNull;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by DELL on 2017/4/25.
 */
@Entity
public class Activists {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    @NotNull
    @Column(nullable = false)
    protected String title;//标题

    @NotNull
    @Column(nullable = false)
    protected String bannerPath;//标题图

    @ElementCollection
    @CollectionTable(name = "activitys_comment")
    @OrderBy("countNum DESC")
    protected Set<Comment> comments = new HashSet<>();//评论

    @NotNull
    @Column(nullable = false)
    protected String path;//地址

    @NotNull
    @Column(nullable = false)
    protected Date time;//时间

    @Version
    protected Long version;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBannerPath() {
        return bannerPath;
    }

    public void setBannerPath(String bannerPath) {
        this.bannerPath = bannerPath;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
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

    public Set<Comment> getComments() {
        return comments;
    }

    public void setComments(Set<Comment> comments) {
        this.comments = comments;
    }

    public Long getVersion() {
        return version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Activists activists = (Activists) o;

        return id != null ? id.equals(activists.id) : activists.id == null;

    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
