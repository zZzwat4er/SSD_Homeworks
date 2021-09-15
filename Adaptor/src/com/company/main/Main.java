package com.company.main;

public class Main {

    public static void main(String[] args) {
        IOS ios = () -> System.out.println("ios is charging");
        Android android = () -> System.out.println("android is charging");
        Charger charger = new Charger();
        charger.ChargeByUSB(android);
        charger.ChargeByLight(ios);
//        now 2 lines below dose not work
//        charger.ChargeByLight(android);
//        charger.ChargeByUSB(ios);

        USBToLight androidAdaptor = new USBToLight(android);
        LightToUSB iosAdaptor = new LightToUSB(ios);
        charger.ChargeByUSB(iosAdaptor);
        charger.ChargeByLight(androidAdaptor);
    }
}
