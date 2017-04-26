package bike.cycling.model;

/**
 * 骑行圈实体
 */

import java.util.Set;

/**
 * Created by DELL on 2017/4/25.
 */
public class Circle {
    protected Set<User> circlemate;//圈友
    protected Set<CircleMessage> messages;//消息
    protected String portrait;//头像
    protected Set<Cycling> circleCylings;//骑行活动
    protected String declaration;//骑行宣言

    public Set<User> getCirclemate() {
        return circlemate;
    }

    public void setCirclemate(Set<User> circlemate) {
        this.circlemate = circlemate;
    }

    public Set<CircleMessage> getMessages() {
        return messages;
    }

    public void setMessages(Set<CircleMessage> messages) {
        this.messages = messages;
    }

    public String getPortrait() {
        return portrait;
    }

    public void setPortrait(String portrait) {
        this.portrait = portrait;
    }

    public Set<Cycling> getCircleCylings() {
        return circleCylings;
    }

    public void setCircleCylings(Set<Cycling> circleCylings) {
        this.circleCylings = circleCylings;
    }

    public String getDeclaration() {
        return declaration;
    }

    public void setDeclaration(String declaration) {
        this.declaration = declaration;
    }
}
