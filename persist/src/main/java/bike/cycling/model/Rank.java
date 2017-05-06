package bike.cycling.model;

/**
 * 用户排名组件
 */

import com.sun.istack.internal.NotNull;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * Created by DELL on 2017/4/25.
 */
@Embeddable
public class Rank {

    @NotNull
    @Column(nullable = false)
    protected int point;//分数

    @NotNull
    @Column(nullable = false)
    protected int state;

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
