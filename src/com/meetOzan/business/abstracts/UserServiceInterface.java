package com.meetOzan.business.abstracts;

import com.meetOzan.entities.concretes.User;

public interface UserServiceInterface {
    void register(User user);
    void login(String email,String password);
}
