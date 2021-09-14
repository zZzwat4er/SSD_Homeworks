package com.company.main;

public class Game {

    private String mTitle;
    private String mDeveloper;
    private String mPublisher;
    private String mPrice;
    private String mDescription;

    public Game(String mTitle, String mDeveloper, String mPublisher, String mPrice, String mDescription) {
        this.mTitle = mTitle;
        this.mDeveloper = mDeveloper;
        this.mPublisher = mPublisher;
        this.mPrice = mPrice;
        this.mDescription = mDescription;
    }

    @Override
    public String toString() {
        return "Game{" +
                "mTitle='" + mTitle + '\'' +
                ", mDeveloper='" + mDeveloper + '\'' +
                ", mPublisher='" + mPublisher + '\'' +
                ", mPrice='" + mPrice + '\'' +
                ", mDescription='" + mDescription + '\'' +
                '}';
    }
}
