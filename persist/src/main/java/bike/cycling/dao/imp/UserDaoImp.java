package bike.cycling.dao.imp;

import bike.cycling.constant.RankState;
import bike.cycling.dao.service.UserDao;
import bike.cycling.dto.RankInfo;
import bike.cycling.model.Rank;
import bike.cycling.model.Role;
import bike.cycling.model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * Created by MrH on 2017/4/25.
 */
@Repository
public class UserDaoImp extends RoleDaoImp<User,Long> implements UserDao {
    public UserDaoImp() {
        super(User.class);
    }

    @Override
    public List<RankInfo> AllUserRank() {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<RankInfo> criteria =
                cb.createQuery(RankInfo.class);
        Root<User> u = criteria.from(User.class);
        criteria.select(
                cb.construct(
                        RankInfo.class,
                        u.get("id"), u.get("roleInfo").get("nikeName"), u.get("rank").get("point") , u.get("rank").get("state")
                )
        );
        criteria.where(cb.equal(u.get("rank").get("state") , RankState.JOINED));
        criteria.orderBy(cb.desc(u.get("rank").get("point")));
        criteria.distinct(true);
        return entityManager.createQuery(criteria).getResultList();
    }

    @Override
    public Long getUserIdByLoginName(String loginName) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Long> criteria =
                cb.createQuery(Long.class);
        Root<User> u = criteria.from(User.class);
        criteria.select(u.get("id")).where(cb.equal(u.get("roleName") ,loginName));
        return entityManager.createQuery(criteria).getSingleResult();
    }

    @Override
    public String getUserPassWordByLoginName(String loginName) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<String> criteria =
                cb.createQuery(String.class);
        Root<User> u = criteria.from(User.class);
        criteria.select(u.get("password")).where(cb.equal(u.get("roleName") ,loginName));
        return entityManager.createQuery(criteria).getSingleResult();
    }
}
