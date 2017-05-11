package bike.cycling.service;

import bike.cycling.dto.*;

import java.util.List;
import java.util.Set;

/**
 * Created by MrH on 2017/5/2.
 */
public interface UserService {

    /**
     * @param loginName 用户登录名
     * @param password 用户密码
     * @return
     */
    boolean login(String loginName , String password);
    boolean register(UserRegisterInfo userRegisterInfo);
    boolean joinRank(String loginName);
    RankInfo showMyRank(String loginName);
    List<RankInfo> showAllRank();
    boolean crateCircle();//待改
    boolean crateCycling();//待改
    boolean joinCircle(String name , int order);
    boolean joinCycling(String name , int order);
    boolean quitCycling(String name , int order);
    boolean quitCircle(String name , int order);
    boolean addFriend(String userLoginName);
    boolean deleteFriend(String userLoginName);
    List<FriendListInfo> getAllFriends(String loginName);
    boolean changeUserInfo();//待改
    boolean changePassword(String oldPassword , String newPassword ,String userLoginName);
    boolean changePassword(String newPassword ,String userLoginName);
    List<UserMessage> getOffLineMessage(String myLoginName , String friendLoginName);
    List<CircleMessage> getOffLineCircleMessage(String name , String order);
}
