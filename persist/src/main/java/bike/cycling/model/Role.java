package bike.cycling.model;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
/**
 * 角色抽象类
 */

/**
 * Created by DELL on 2017/4/25.
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    protected Long id;

    @NotNull
    @Column(nullable = false)
    protected String roleName;//登陆名

    @Column(nullable = false)
    protected String password;//密码

    @NotNull
    @Column(nullable = false)
    protected String picturesPath;//头像

    @NotNull
    @Column(nullable = false)
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

    public String getPicturesPaths() {
        return picturesPath;
    }

    public void setPicturesPaths(String picturesPath) {
        this.picturesPath = picturesPath;
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
