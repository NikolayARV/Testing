package org.example;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class UserTest {
    private static String login;
    private static String email;
    static User user;

    @BeforeAll
    private static void initFields() {
        login = "Maper";
        email = "nam@nab.cl";
    }

    @AfterAll
    private static void afterall() {
        System.out.println("Testing finish");
    }

    @Test
    void setUserWithParams() {
        User user1 = new User(login, email);
        Assertions.assertTrue(user1.getLogin().equals(login) && user1.getEmail().equals(email));

    }

    @Test
    void setUserWithoutParams() {
        User user2 = new User();
        Assertions.assertNotNull(user2);
    }

    @Test
    void loginShouldNotEqualEmail() {
        Assertions.assertNotEquals(user.getLogin(), user.getEmail());
    }

    @Test
    void getEmail() {
        Assertions.assertTrue(email.contains("@") && email.contains("."));
    }


}