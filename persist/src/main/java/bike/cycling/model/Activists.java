package bike.cycling.model;

/**
 * 官方活动实体
 */

import java.util.Date;

/**
 * Created by DELL on 2017/4/25.
 */
public class Activists {
    protected String title;//标题
    protected String bannerPath;//标题图
    protected Comment comments;//评论
    protected String path;//地址
    protected Date time;//时间

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

    public Comment getComments() {
        return comments;
    }

    public void setComments(Comment comments) {
        this.comments = comments;
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
}
