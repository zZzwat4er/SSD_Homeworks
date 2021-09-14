package com.company.main;

public class NPAFun implements Observer<Game>{
    @Override
    public void update(Game data) {
        System.out.println("I'm NPAFun and just got notify about game:\n" + data.toString());
        System.out.println("_____________________________________________________");
    }
}
