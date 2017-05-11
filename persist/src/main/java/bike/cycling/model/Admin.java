package bike.cycling.model;

/**
 * 管理员实体
 */

import com.sun.istack.internal.NotNull;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by DELL on 2017/4/25.
 */
@Entity
public class Admin extends Role{
    @NotNull
    @Column(nullable = false)
    protected int authority;//权限

    public int getAuthority() {
        return authority;
    }

    public void setAuthority(int authority) {
        this.authority = authority;
    }
}
