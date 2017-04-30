package bike.cycling.model;

/**
 * 骑行圈实体
 */

import com.sun.istack.internal.NotNull;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by DELL on 2017/4/25.
 */
@Entity
public class Circle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    @ManyToMany
    protected Set<User> circlemate = new HashSet<>();//圈友

    @ManyToOne
    protected User circleBoss;

    @OneToMany
    protected Set<CircleMessage> messages = new HashSet<>();//消息

    @NotNull
    @Column(nullable = false)
    protected String portrait;//头像

    @OneToMany
    protected Set<Cycling> circleCylings = new HashSet<>();//骑行活动

    @NotNull
    protected String declaration;//骑行宣言

    public Long getId() {
        return id;
    }

    public User getCircleBoss() {
        return circleBoss;
    }

    public void setCircleBoss(User circleBoss) {
        this.circleBoss = circleBoss;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        return id != null ? id.equals(circle.id) : circle.id == null;

    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
