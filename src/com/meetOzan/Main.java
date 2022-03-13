package com.meetOzan;

import com.meetOzan.business.concretes.UserService;
import com.meetOzan.core.concretes.InputValidation;
import com.meetOzan.core.concretes.SendVerificationService;
import com.meetOzan.dataAccess.abstracts.SignDao;
import com.meetOzan.dataAccess.concretes.UserDao;
import com.meetOzan.entities.concretes.User;

public class Main {

    public static void main(String[] args) {
        User user1 = new User();
        user1.setFirstName("Mert Ozan");
        user1.setFirstName("Kahraman");
        user1.seteMail("mozankahraman69@gmail.com");
        user1.setPassword("1234567");

        User user2 = new User();
        user2.setFirstName("Elif");
        user2.setFirstName("Kahraman");
        user2.seteMail("elifkahraman@gmail.com");
        user2.setPassword("7654321");

        UserService userService = new UserService(new InputValidation(), new SendVerificationService(), new UserDao());
        userService.register(user1);
        System.out.println("\n");
        userService.register(user2);
        System.out.println("\n");
        userService.login("mozankahraman69@gmail.com", "1234567");
        System.out.printf("\n");
        userService.login("elifkahraman@gmail.com", "7654321");

    }
}