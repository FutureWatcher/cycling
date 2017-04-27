package bike.cycling.model;

/**
 * 角色地址组件
 */

import javax.persistence.Embeddable;

/**
 * Created by DELL on 2017/4/25.
 */
@Embeddable
public class RoleAddress {

    protected String province;//省
    protected String city;//市
    protected String county;//县/区

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }
}
