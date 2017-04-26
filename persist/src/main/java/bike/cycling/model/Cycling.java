package bike.cycling.model;

/**
 * 骑行活动实体
 */

import java.util.Date;
import java.util.Set;

/**
 * Created by DELL on 2017/4/25.
 */
public class Cycling {
    protected User leader;//领头人/发起人
    protected Set<User> participator;//参与者
    protected String name;//活动
    protected Place origin;//起始地点
    protected Place destination;//目标地点
    protected Date date;//日期
    protected int state;//状态
    protected Set<TravelNotes> travelNotes;//动态

    public User getLeader() {
        return leader;
    }

    public void setLeader(User leader) {
        this.leader = leader;
    }

    public Set<User> getParticipator() {
        return participator;
    }

    public void setParticipator(Set<User> participator) {
        this.participator = participator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Place getOrigin() {
        return origin;
    }

    public void setOrigin(Place origin) {
        this.origin = origin;
    }

    public Place getDestination() {
        return destination;
    }

    public void setDestination(Place destination) {
        this.destination = destination;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public Set<TravelNotes> getTravelNotes() {
        return travelNotes;
    }

    public void setTravelNotes(Set<TravelNotes> travelNotes) {
        this.travelNotes = travelNotes;
    }
}
