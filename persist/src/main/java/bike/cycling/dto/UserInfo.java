package bike.cycling.dto;

import org.springframework.stereotype.Component;

/**
 * Created by MrH on 2017/5/3.
 */
@Component
public class UserInfo {
    private String loginName;
    private String nikeName;
    private String picturesPath;
    private String province;
    private String county;
    private String city;
    private String sex;
    private String myDescription;
    private String telephone;

    public UserInfo(String loginName, String nikeName, String picturesPath, String province, String county, String city, String sex, String myDescription, String telephone) {
        this.loginName = loginName;
        this.nikeName = nikeName;
        this.picturesPath = picturesPath;
        this.province = province;
        this.county = county;
        this.city = city;
        this.sex = sex;
        this.myDescription = myDescription;
        this.telephone = telephone;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getNikeName() {
        return nikeName;
    }

    public void setNikeName(String nikeName) {
        this.nikeName = nikeName;
    }

    public String getPicturesPath() {
        return picturesPath;
    }

    public void setPicturesPath(String picturesPath) {
        this.picturesPath = picturesPath;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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
