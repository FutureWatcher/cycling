package bike.cycling.model;

/**
 * 管理员实体
 */

/**
 * Created by DELL on 2017/4/25.
 */
public class Admin extends Role{
    protected int authority;//权限

    public int getAuthority() {
        return authority;
    }

    public void setAuthority(int authority) {
        this.authority = authority;
    }
}
