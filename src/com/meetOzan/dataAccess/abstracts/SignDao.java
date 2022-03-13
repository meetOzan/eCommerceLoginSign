package com.meetOzan.dataAccess.abstracts;

import com.meetOzan.entities.concretes.User;

public interface SignDao {
    void signUp(User user);
    boolean emailCheck (User user);
    void signIn (User user);
    boolean signInCheck(String email,String password);

}
