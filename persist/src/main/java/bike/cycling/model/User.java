package bike.cycling.model;
/**
 * 用户实体
 */

import com.sun.istack.internal.NotNull;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by DELL on 2017/4/25.
 */
@Entity
public class User extends Role {

    @ManyToMany
    protected Set<User> friends;//好友

    @ManyToMany
    protected Set<Circle> circles;//加入的骑行圈

    protected Rank rank;//排名

    @NotNull
    @Column(nullable = false)
    protected UserSetting setting;//设置

    @OneToMany
    protected Set<SingleMessages> messages = new HashSet<>();//聊天记录

    @ManyToMany
    protected Set<Cycling> attendedAct = new HashSet<>();//参加过的骑行

    @OneToMany
    protected Set<TravelNotes> travelNotes = new HashSet<>();//动态

    public Set<User> getFriends() {
        return friends;
    }

    public void setFriends(Set<User> friends) {
        this.friends = friends;
    }

    public Set<Circle> getCircles() {
        return circles;
    }

    public void setCircles(Set<Circle> circles) {
        this.circles = circles;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public UserSetting getSetting() {
        return setting;
    }

    public void setSetting(UserSetting setting) {
        this.setting = setting;
    }

    public Set<SingleMessages> getMessages() {
        return messages;
    }

    public void setMessages(Set<SingleMessages> messages) {
        this.messages = messages;
    }

    public Set<Cycling> getAttendedAct() {
        return attendedAct;
    }

    public void setAttendedAct(Set<Cycling> attendedAct) {
        this.attendedAct = attendedAct;
    }

    public Set<TravelNotes> getTravelNotes() {
        return travelNotes;
    }

    public void setTravelNotes(Set<TravelNotes> travelNotes) {
        this.travelNotes = travelNotes;
    }
}
