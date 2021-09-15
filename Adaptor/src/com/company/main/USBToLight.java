package com.company.main;

public class USBToLight implements IOS{

    Android phone;

    public USBToLight(Android phone){
        this.phone = phone;
    }

    @Override
    public void chargeByLight() {
        this.phone.chargeByUSB();
    }
}
