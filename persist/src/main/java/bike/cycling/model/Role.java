package bike.cycling.model;

import com.sun.istack.internal.NotNull;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import java.util.Set;
/**
 * 角色抽象类
 */

/**
 * Created by DELL on 2017/4/25.
 */
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    @NotNull
    @Column(nullable = false)
    protected String roleName;//登陆名

    @Column(nullable = false)
    protected String password;//密码


    protected Set<String> picturesPaths;//头像

    protected Date lastOnline;//最后在线时间

    @Column(nullable = false)
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

    public Set<String> getPicturesPaths() {
        return picturesPaths;
    }

    public void setPicturesPaths(Set<String> picturesPaths) {
        this.picturesPaths = picturesPaths;
    }

    public Date getLastOnline() {
        return lastOnline;
    }

    public void setLastOnline(Date lastOnline) {
        this.lastOnline = lastOnline;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    public Long getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Role role = (Role) o;

        if (id != null ? !id.equals(role.id) : role.id != null) return false;
        return roleName != null ? roleName.equals(role.roleName) : role.roleName == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (roleName != null ? roleName.hashCode() : 0);
        return result;
    }
}
