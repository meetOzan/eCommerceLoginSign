package com.meetOzan.core.concretes;
import com.meetOzan.jGoogleService.jGoogleService;
import com.meetOzan.core.abstracts.InputService;
import com.meetOzan.entities.concretes.User;

public class JGoogleServiceAdapter implements InputService {
    @Override
    public boolean isValid(User user) {
        jGoogleService googleUserValid = new jGoogleService();
        return googleUserValid.isValid();
    }
}
