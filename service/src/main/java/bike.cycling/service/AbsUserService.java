package bike.cycling.service;

import bike.cycling.dto.*;

import java.util.List;

/**
 * Created by MrH on 2017/5/6.
 */
public abstract class AbsUserService implements UserService{
    @Override
    public boolean login(String loginName, String password) {
        return false;
    }

    @Override
    public boolean register(UserRegisterInfo userRegisterInfo) {
        return false;
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

    @Override
    public boolean crateCircle() {
        return false;
    }

    @Override
    public boolean crateCycling() {
        return false;
    }

    @Override
    public boolean joinCircle(String name, int order) {
        return false;
    }

    @Override
    public boolean joinCycling(String name, int order) {
        return false;
    }

    @Override
    public boolean quitCycling(String name, int order) {
        return false;
    }

    @Override
    public boolean quitCircle(String name, int order) {
        return false;
    }

    @Override
    public boolean addFriend(String userLoginName) {
        return false;
    }

    @Override
    public boolean deleteFriend(String userLoginName) {
        return false;
    }

    @Override
    public List<FriendListInfo> getAllFriends(String loginName) {
        return null;
    }

    @Override
    public boolean changeUserInfo() {
        return false;
    }

    @Override
    public boolean changePassword(String oldPassword, String newPassword, String userLoginName) {
        return false;
    }

    @Override
    public boolean changePassword(String newPassword, String userLoginName) {
        return false;
    }

    @Override
    public List<UserMessage> getOffLineMessage(String myLoginName, String friendLoginName) {
        return null;
    }

    @Override
    public List<CircleMessage> getOffLineCircleMessage(String name, String order) {
        return null;
    }
}
