package bike.cycling.imp;

import bike.cycling.constant.RankState;
import bike.cycling.dao.imp.UserDaoImp;
import bike.cycling.dto.RankInfo;
import bike.cycling.dto.UserRegisterInfo;
import bike.cycling.model.*;
import bike.cycling.service.AbsUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by MrH on 2017/5/6.
 */
@Service
public class AccountService extends AbsUserService {

    private UserDaoImp userDaoImp;

    @Autowired
    public void setUserDaoImp(UserDaoImp userDaoImp) {
        this.userDaoImp = userDaoImp;
    }

    @Override
    public boolean login(String loginName, String password) {
        boolean isLoginSuccess = false;
        String selectPassword = userDaoImp.getUserPassWordByLoginName(loginName);
        if( selectPassword != null)
            if(password.equals(selectPassword))
                isLoginSuccess = true;
        return isLoginSuccess ;
    }

    @Override
    public boolean register(UserRegisterInfo userRegisterInfo) {
        User user = new User();
        Rank rank = new Rank();
        RoleAddress roleAddress = new RoleAddress();
        RoleInfo roleInfo = new RoleInfo();
        UserSetting userSetting = new UserSetting();
        user.setRoleName(userRegisterInfo.getLoginName());
        user.setPassword(userRegisterInfo.getPassword());
        user.setPicturesPath(userRegisterInfo.getImagePath());
        user.setJoinDate(new Date());
        rank.setPoint(RankState.STARTPOINT);
        rank.setState(RankState.NOTJOIN);
        roleInfo.setSex(userRegisterInfo.getSex());
        roleInfo.setNikeName(userRegisterInfo.getNikeName());
        roleInfo.setTelephone(userRegisterInfo.getTelephone());
        user.setRank(rank);
        user.setRoleAddress(roleAddress);
        user.setSetting(userSetting);
        user.setRoleInfo(roleInfo);
        userDaoImp.makePersistent(user);
        return true;
    }
    @Override
    public boolean joinRank(String loginName) {
        return false;
    }

    @Override
    public RankInfo showMyRank(String loginName) {
        return null;
    }

    @Override
    public List<RankInfo> showAllRank() {
        return null;
    }
}
