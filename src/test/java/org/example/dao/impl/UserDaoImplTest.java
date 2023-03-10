package org.example.dao.impl;

import org.example.User;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

class UserDaoImplTest {
private final UserDaoImpl out = new UserDaoImpl(new HashSet<>());

    @AfterAll
    private static void afterall() {
        System.out.println("Testing finish");
    }



    @Test
    void shouldReturnTrueIfUserExist() {
        User user = new User("Ivan");
        String result = out.getUserByName(user.getName());
        Assertions.assertTrue(result.contains(user.getName()));
    }
    @Test
    void shouldReturnTrueIfUserNotExist() {
        User user = new User("Pave");
        String result = out.getUserByName(user.getName());
        Assertions.assertNull(result);
    }
}