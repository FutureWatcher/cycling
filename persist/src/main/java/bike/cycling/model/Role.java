package bike.cycling.model;

import java.util.Date;
import java.util.Set;
/**
 * 角色抽象类
 */

/**
 * Created by DELL on 2017/4/25.
 */
public class Role {
    protected String roleName;//登陆名
    protected String password;//密码
    protected Set<String> picturespathes;//头像
    protected Date lastOnlie;//最后在线时间
    protected Date joinDate;//创建时间

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<String> getPicturespathes() {
        return picturespathes;
    }

    public void setPicturespathes(Set<String> picturespathes) {
        this.picturespathes = picturespathes;
    }

    public Date getLastOnlie() {
        return lastOnlie;
    }

    public void setLastOnlie(Date lastOnlie) {
        this.lastOnlie = lastOnlie;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }
}
