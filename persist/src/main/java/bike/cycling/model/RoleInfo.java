package bike.cycling.model;
/**
 * 角色信息组件
 */

/**
 * Created by DELL on 2017/4/25.
 */
public class RoleInfo {
    protected String nikename;//匿名
    protected String realname;//真实姓名
    protected String sex;//性别
    protected String mydescription;//自述
    protected String telephone;//电话

    public String getNikename() {
        return nikename;
    }

    public void setNikename(String nikename) {
        this.nikename = nikename;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getMydescription() {
        return mydescription;
    }

    public void setMydescription(String mydescription) {
        this.mydescription = mydescription;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
