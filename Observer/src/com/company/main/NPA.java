package com.company.main;

import java.util.ArrayList;
import java.util.List;

public class NPA implements SubscriptionManager<Game>{

    private List<Observer<Game>> mSubs;

    public NPA() {
        this.mSubs = new ArrayList<>();
    }

    @Override
    public void subscribe(Observer<Game> observer) {
        mSubs.add(observer);
    }

    @Override
    public void unsubscribe(Observer<Game> observer) {
        mSubs.remove(observer);
    }

    @Override
    public void notify(Game data) {
        mSubs.forEach(gameObserver -> gameObserver.update(data));
    }
}
