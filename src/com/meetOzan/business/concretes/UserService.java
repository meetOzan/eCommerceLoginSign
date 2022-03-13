package com.meetOzan.business.concretes;

import com.meetOzan.business.abstracts.UserServiceInterface;
import com.meetOzan.core.abstracts.SendverificationInter;
import com.meetOzan.core.concretes.InputValidation;
import com.meetOzan.core.concretes.SendVerificationService;
import com.meetOzan.dataAccess.abstracts.SignDao;
import com.meetOzan.entities.concretes.User;

public class UserService implements UserServiceInterface {

    InputValidation inputValidation;
    SendVerificationService sendVerificationService;
    SignDao signDao;


    public UserService(InputValidation inputValidation, SendVerificationService sendVerificationService, SignDao signDao) {
        this.inputValidation = inputValidation;
        this.sendVerificationService = sendVerificationService;
        this.signDao = signDao;
    }



    @Override
    public void register(User user) {

        if (!inputValidation.isValid(user)){
            System.out.println("Sisteme Kayit Basarisiz.");
        }
        else if (!signDao.emailCheck(user)){
            System.out.println("Bu E-mail baskasi tarafindan alinmistir\nAlinan E-mail: "+user.geteMail());
        }
        else {
            signDao.signUp(user);
            sendVerificationService.sendVerifacation();
        }
    }

    @Override
    public void login(String email,String password) {
        if (signDao.signInCheck(email,password)){
            System.out.println("Sifre veya E-Mail Yanlis!!");
        }
        else System.out.println("Sisteme Giris Yapildi");
    }
}
