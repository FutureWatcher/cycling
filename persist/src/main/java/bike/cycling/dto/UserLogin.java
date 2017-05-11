package bike.cycling.dto;

import com.sun.org.apache.xml.internal.serializer.SerializerBase;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * Created by MrH on 2017/5/7.
 */
public class UserLogin implements Serializable {
    private String loginName;
    private String password;

    public UserLogin() {
    }

    public UserLogin(String loginName, String password) {
        this.loginName = loginName;
        this.password = password;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
