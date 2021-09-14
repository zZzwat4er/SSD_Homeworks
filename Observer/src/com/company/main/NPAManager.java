package com.company.main;

import java.util.Scanner;

public class NPAManager {

    private final SubscriptionManager<Game> mNap;
    private final Scanner mScanner;

    public NPAManager(){
        mNap = new NPA();
        mScanner = new Scanner(System.in);
    }

    public void addGame(){
        GameBuilder gameBuilder = new MyGameBuilder();
        System.out.println("Enter Game title");
        String title = mScanner.nextLine();
        System.out.println("Enter Game developer");
        String developer = mScanner.nextLine();
        System.out.println("Enter Game publisher");
        String publisher = mScanner.nextLine();
        System.out.println("Enter Game price");
        String price = mScanner.nextLine();
        System.out.println("Enter Game description");
        String description = mScanner.nextLine();
        Game newGame = gameBuilder.title(title)
                .price(price)
                .description(description)
                .publisher(publisher)
                .developer(developer)
                .build();
        mNap.notify(newGame);
    }

    public void subscribeToNPA(Observer<Game> observer){
        mNap.subscribe(observer);
    }
}
