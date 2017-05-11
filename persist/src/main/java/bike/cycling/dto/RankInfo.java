package bike.cycling.dto;

import org.springframework.stereotype.Component;

/**
 * Created by MrH on 2017/5/2.
 */

public class RankInfo {
    private Long userId;
    private String nikeName;
    private Integer point;
    private Integer state;

    public RankInfo(Long userId, String nikeName, Integer point, Integer state) {
        this.userId = userId;
        this.nikeName = nikeName;
        this.point = point;
        this.state = state;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getNikeName() {
        return nikeName;
    }

    public void setNikeName(String nikeName) {
        this.nikeName = nikeName;
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}
