package com.meetOzan.dataAccess.concretes;

import com.meetOzan.dataAccess.abstracts.SignDao;
import com.meetOzan.entities.concretes.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao implements SignDao {

    List<User> users = new ArrayList<>();


    @Override
    public void signUp(User user) {
        System.out.println(user.getFirstName() + " " + user.getLastName() + "Kayıt Oldu.");

    }

    @Override
    public boolean emailCheck(User user) {

        if (user.getFirstName().length() <= 2 && user.getLastName().length() <= 2) {
            System.out.println("2 karakter veya daha az karakterden isim oluşamaz!!");
            return false;
        }
        for (User u : users) {
            if (u.geteMail() == u.geteMail()) ;
            return false;
        }
        return true;
    }

    @Override
    public void signIn(User user) {
        System.out.println(user.geteMail() + "Mailli ile" + user.getFirstName() + "Sisteme giirs yapti");
    }

    @Override
    public boolean signInCheck(String email, String password) {
        for (User user : users) {
            if (user.geteMail() == email && user.getPassword() == password) {
                return true;
            }
        }

        return false;
    }



}
