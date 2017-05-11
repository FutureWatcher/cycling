package bike.cycling.model;

/**
 * 角色地址组件
 */

import com.sun.istack.internal.NotNull;

import javax.persistence.Embeddable;

/**
 * Created by DELL on 2017/4/25.
 */
@Embeddable
public class RoleAddress {

    @NotNull
    protected String province;//省

    @NotNull
    protected String city;//市

    @NotNull
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
