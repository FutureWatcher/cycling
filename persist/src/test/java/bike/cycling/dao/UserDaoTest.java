package bike.cycling.dao;

import bike.cycling.constant.RankState;
import bike.cycling.dao.imp.UserDaoImp;
import bike.cycling.dao.service.UserDao;
import bike.cycling.dto.RankInfo;
import bike.cycling.model.*;
import bike.cycling.util.RandomUtil;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

/**
 * Created by MrH on 2017/5/2.
 */
public class UserDaoTest extends DaoTest {

    private List<RankInfo> rankInfos;
    private UserDaoImp userDao;
    private List<User> testUsers;
    private List<RoleInfo> roleInfos;
    private List<RoleAddress> roleAddresses;
    private List<UserSetting> userSettings;
    private List<Rank> ranks;

    private int count = 10;
    private int joinedCount = 10;

    @Before
    public void writeData(){
        init();
        initData();
        userDao = new UserDaoImp();
        userDao.setEntityManager(entityManager);
        transaction.begin();
        persistent();
    }

    public void initData(){
        testUsers = new ArrayList<>();
        roleInfos = new ArrayList<>();
        roleAddresses = new ArrayList<>();
        userSettings = new ArrayList<>();
        ranks = new ArrayList<>();

        count = RandomUtil.formMinToMax(5,20);
        joinedCount = 0;
        for(int i = 0 ; i< count ; i++){
            initRank();
            initAddress();
            initInfo();
            initUserSetting();
            initUser(i);
        }
    }

    public void persistent(){
        for(User user : testUsers){
            userDao.makePersistent(user);
        }
    }

    public void initUser(int position){
        User user = new User();
        user.setRoleName(UUID.randomUUID().toString());
        user.setPassword(UUID.randomUUID().toString());
        user.setRank(ranks.get(position));
        user.setRoleAddress(roleAddresses.get(position));
        user.setRoleInfo(roleInfos.get(position));
        user.setSetting(userSettings.get(position));
        user.setJoinDate(new Date());
        user.setPicturesPath(UUID.randomUUID().toString());
        testUsers.add(user);
    }

    public void initInfo(){
        RoleInfo roleInfo = new RoleInfo();
        roleInfo.setNikeName(UUID.randomUUID().toString());
        roleInfo.setSex("");
        roleInfos.add(roleInfo);
    }

    public void initAddress(){
        RoleAddress roleAddress = new RoleAddress();
        roleAddresses.add(roleAddress);
    }

    public void initUserSetting(){
        UserSetting userSetting = new UserSetting();
        userSettings.add(userSetting);
    }


    public void initRank(){
        Rank rank = new Rank();
        rank.setPoint(1600);
        if(RandomUtil.formMinToMax(1,2)==1) {
            rank.setState(RankState.JOINED);
            joinedCount++;
        }else rank.setState(RankState.NOTJOIN);
        ranks.add(rank);
    }




    @Test
    public void findUserWithRankTest(){
        rankInfos = userDao.AllUserRank();
        System.out.println(count);
        System.out.println(joinedCount);
        assertEquals(joinedCount,rankInfos.size());
        for(RankInfo rankInfo : rankInfos){
            assertNotNull(rankInfo.getNikeName());
            assertNotNull(rankInfo.getPoint());
            assertNotNull(rankInfo.getPoint());
        }
    }

}
