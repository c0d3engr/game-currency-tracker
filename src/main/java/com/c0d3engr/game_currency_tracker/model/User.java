package com.c0d3engr.game_currency_tracker.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public abstract class User {

    @Autowired
    Account account;

    public void addUser()
    {
        System.out.println("User succcessfully added!");
    }

    public abstract void addAccount();
}
