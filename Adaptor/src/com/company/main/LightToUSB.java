package com.company.main;

public class LightToUSB implements Android{

    IOS phone;

    public LightToUSB(IOS phone){
        this.phone = phone;
    }

    @Override
    public void chargeByUSB() {
        this.phone.chargeByLight();
    }
}
