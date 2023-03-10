package org.example.dao;

public interface UserDao
{
    String addUser(String userName);

    String getUserByName(String userName);

    String findAllUsers();
}
