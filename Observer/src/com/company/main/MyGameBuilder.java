package com.company.main;

public class MyGameBuilder implements GameBuilder{

    private String mTitle = "";
    private String mDeveloper = "";
    private String mPublisher = "";
    private String mPrice = "60$";
    private String mDescription = "";

    @Override
    public GameBuilder title(String title) {
        this.mTitle = title;
        return this;
    }

    @Override
    public GameBuilder developer(String developer) {
        this.mDeveloper = developer;
        return this;
    }

    @Override
    public GameBuilder publisher(String publisher) {
        this.mPublisher = publisher;
        return this;
    }

    @Override
    public GameBuilder price(String price) {
        this.mPrice = price;
        return this;
    }

    @Override
    public GameBuilder description(String description) {
        this.mDescription = description;
        return this;
    }

    @Override
    public Game build() {
        return new Game(mTitle, mDeveloper, mPublisher, mPrice, mDescription);
    }
}
