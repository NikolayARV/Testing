package org.example.service.serviceImpl;

import org.example.dao.UserDao;
import org.example.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public boolean checkUserExist(String userName) {
        return userDao.getUserByName(userName)!=null;
    }
}
