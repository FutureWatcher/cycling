package bike.cycling.dto;

import org.springframework.stereotype.Component;

/**
 * Created by MrH on 2017/5/7.
 */

public class ResBoolean {
    boolean res;

    public ResBoolean() {
    }

    public ResBoolean(boolean res) {
        this.res = res;
    }

    public boolean isRes() {
        return res;
    }

    public void setRes(boolean res) {
        this.res = res;
    }
}
