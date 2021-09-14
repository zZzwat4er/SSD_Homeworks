package com.company.main;

public class Main {

    public static void main(String[] args) {
        NPAManager manager = new NPAManager();
        NPAFun fun = new NPAFun();
        Observer<Game> unknownFun = new Observer<Game>() {
            @Override
            public void update(Game data) {
                System.out.println("UnknownFun got notify");
                System.out.println("_____________________________________________________");
            }
        };

        manager.subscribeToNPA(fun);
        manager.addGame();
        manager.subscribeToNPA(unknownFun);
        manager.addGame();
    }
}
