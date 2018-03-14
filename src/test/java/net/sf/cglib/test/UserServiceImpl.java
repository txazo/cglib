package net.sf.cglib.test;

public class UserServiceImpl implements UserService {

    @Override
    public String getUserName(int userId) {
        return "user_" + userId;
    }

}
