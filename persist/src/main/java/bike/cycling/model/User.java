package bike.cycling.model;
/**
 * 用户实体
 */

import java.util.Set;

/**
 * Created by DELL on 2017/4/25.
 */
public class User extends Role {
    protected Set<User> friends;//好友
    protected Set<Circle> circles;//加入的骑行圈
    protected Set<TravelNotes> dailyRecord;//动态
    protected Rank rank;//排名
    protected UserSetting setting;//设置
    protected Set<SingleMessages> messages;//聊天记录
    protected Set<Cycling> attendedAct;//参加过的骑行
    protected Set<TravelNotes> travelNotes;//动态

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

    public Set<TravelNotes> getDailyRecord() {
        return dailyRecord;
    }

    public void setDailyRecord(Set<TravelNotes> dailyRecord) {
        this.dailyRecord = dailyRecord;
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
