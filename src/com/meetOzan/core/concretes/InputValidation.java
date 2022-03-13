package com.meetOzan.core.concretes;

import com.meetOzan.core.abstracts.InputService;
import com.meetOzan.entities.concretes.User;

import java.util.regex.Pattern;

public class InputValidation implements InputService {

    public boolean isValidMail (String email) {

            String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." +
                    "[a-zA-Z0-9_+&*-]+)*@" +
                    "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                    "A-Z]{2,7}$";

            Pattern pat = Pattern.compile(emailRegex);
            if (email == null)
                return false;
            return pat.matcher(email).matches();
    }


    public boolean isValidPassword (String password){
        if (password == null || password.length() < 6) {
            return false;
        }
        return true;
    }

    public boolean isValidName(String name){

        if (name==null || name.length() < 2) {
            return false;
        }
        else return true;
    }

    public boolean isValidSurname(String surname){
        if (surname==null ||surname.length() < 2) {
            return false;
        }
        else return true;
    }

    @Override

    public boolean isValid(User user){

        if (!isValidMail(user.geteMail())){
            System.out.println("E-Mail Hatali tekrar deneyin");
            return false;
        }

        if (!isValidPassword(user.getPassword())){
            System.out.println("Sifreniz Yanlis Tekrar deneyin");
            return false;
        }

        if (!isValidName(user.getFirstName())){
            System.out.println("Isim 2 karakterden az olamaz");
            return false;
        }

        return true;
    }
}
