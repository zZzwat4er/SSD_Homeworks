package com.company.main;

public interface GameBuilder {
    GameBuilder title(String x);
    GameBuilder developer(String x);
    GameBuilder publisher(String x);
    GameBuilder price(String x);
    GameBuilder description(String x);
    Game build();
}
