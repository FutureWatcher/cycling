package bike.cycling.model;

/**
 * 动态实体
 */

import java.util.List;
import java.util.Set;

/**
 * Created by DELL on 2017/4/26.
 */
public class TravelNotes {
    protected String title;//标题
    protected List<String> titleImages;// 展示图
    protected User belongUser;//发布者
    protected Cycling belongCycling;//属于骑行活动
    protected Set<Comment> comments;//评论
    protected String content;//内容

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getTitleImages() {
        return titleImages;
    }

    public void setTitleImages(List<String> titleImages) {
        this.titleImages = titleImages;
    }

    public User getBelongUser() {
        return belongUser;
    }

    public void setBelongUser(User belongUser) {
        this.belongUser = belongUser;
    }

    public Cycling getBelongCycling() {
        return belongCycling;
    }

    public void setBelongCycling(Cycling belongCycling) {
        this.belongCycling = belongCycling;
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
}
