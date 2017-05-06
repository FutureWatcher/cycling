package bike.cycling.model;

/**
 * 骑行活动实体
 */

import com.sun.istack.internal.NotNull;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by DELL on 2017/4/25.
 */
@Entity
public class Cycling {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @NotNull
    protected User leader;//领头人/发起人

    @ManyToMany(fetch = FetchType.LAZY)
    protected Set<User> participator = new HashSet<>();//参与者

    @NotNull
    @Column(nullable = false)
    protected String name;//活动

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    protected Date createTime;

    @Column(nullable = false)
    protected int order;


    @AttributeOverrides({
            @AttributeOverride(name = "placeName", column = @Column(name = "origin_placeName" , nullable = false)),
            @AttributeOverride(name = "longitude", column = @Column(name = "origin_longitude", nullable = false)),
            @AttributeOverride(name = "dimension", column = @Column(name = "origin_dimension" ,nullable = false))}
    )
    protected Place origin;//起始地点

    @AttributeOverrides({
            @AttributeOverride(name = "placeName", column = @Column(name = "destination_placeName" , nullable = false)),
            @AttributeOverride(name = "longitude", column = @Column(name = "destination_longitude" , nullable = false)),
            @AttributeOverride(name = "dimension", column = @Column(name = "destination_dimension" , nullable = false))}
    )
    protected Place destination;//目标地点

    @NotNull
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    protected Date date;//日期

    @NotNull
    @Column(nullable = false)
    protected int state;//状态

    @Version
    protected Long version;

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

    public Long getId() {
        return id;
    }

    public Long getVersion() {
        return version;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cycling cycling = (Cycling) o;

        if (id != null ? !id.equals(cycling.id) : cycling.id != null) return false;
        return leader != null ? leader.equals(cycling.leader) : cycling.leader == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (leader != null ? leader.hashCode() : 0);
        return result;
    }
}
