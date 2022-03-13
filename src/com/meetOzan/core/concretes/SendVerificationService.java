package com.meetOzan.core.concretes;

import com.meetOzan.core.abstracts.SendverificationInter;

public class SendVerificationService implements SendverificationInter {
    @Override
    public void sendVerifacation() {
        System.out.println("Dogrulama Mail'i Gonderildi");
    }
}
