package bike.cycling.model;
/**
 * 角色信息组件
 */

import com.sun.istack.internal.NotNull;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * Created by DELL on 2017/4/25.
 */
@Embeddable
public class RoleInfo {
    @NotNull
    @Column(nullable = false)
    protected String nikeName;//匿名

    @NotNull
    protected String realName;//真实姓名

    @Column(nullable = false)
    protected String sex;//性别

    @NotNull
    protected String myDescription;//自述

    @NotNull
    protected String telephone;//电话


    public String getNikeName() {
        return nikeName;
    }

    public void setNikeName(String nikeName) {
        this.nikeName = nikeName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getMyDescription() {
        return myDescription;
    }

    public void setMyDescription(String myDescription) {
        this.myDescription = myDescription;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
