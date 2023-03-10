package org.example.dao.impl;

import org.example.User;
import org.example.dao.UserDao;
import org.springframework.stereotype.Repository;

import java.util.Set;
@Repository
public class UserDaoImpl implements UserDao {

    private Set<User> userSet;

    public UserDaoImpl(Set<User> userSet) {
        userSet.add(user1);
        userSet.add(user2);

        this.userSet = userSet;

    }

    User user1 = new User("Ivan");
    User user2 = new User("Pavel");


    @Override
    public String toString() {
        return "userSet: " + userSet;
    }

    @Override
    public String addUser(String userName) {
        if (userSet.contains(userName)) {
            throw new RuntimeException("Такой пользователь уже есть");
        }
        userSet.add(new User(userName));
        return userName;
    }

    @Override
    public String getUserByName(String userName) {
        if (!userSet.contains(new User(userName))) {
            return null;
        }
        return userName;

    }

    @Override
    public String findAllUsers() {
        return userSet.toString();
    }

}

