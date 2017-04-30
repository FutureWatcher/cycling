package bike.cycling.model;

/**
 * 用户排名组件
 */

import com.sun.istack.internal.NotNull;

import javax.persistence.Embeddable;

/**
 * Created by DELL on 2017/4/25.
 */
@Embeddable
public class Rank {
    @NotNull
    protected String name;//排名段位
    @NotNull
    protected int point;//分数

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
}
