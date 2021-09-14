package com.company.main;

import java.util.List;

public interface SubscriptionManager<T> {
    void subscribe(Observer<T> observer);
    void unsubscribe(Observer<T> observer);
    void notify(T data);
}
