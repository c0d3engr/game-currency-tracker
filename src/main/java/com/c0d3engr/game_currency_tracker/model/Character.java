package com.c0d3engr.game_currency_tracker.model;

import java.util.List;

public class Character implements Account {

    public void character()
    {
        List<String> character[] = new Arraylist<String>(List.of(char1, char2, char3));

        System.out.println("Character successfully added!");
    }

    @Override
    public void addAccount() {
        System.out.println("Account successfully added!");
    }
}
