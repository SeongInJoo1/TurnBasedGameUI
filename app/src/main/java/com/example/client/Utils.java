package com.example.client;

import datapackage.*;
public class Utils {

    public String setInfo(Info i, Data d){

        int HP = i.getHP() - d.getAttack();

        String res = "HP: " + Integer.toString(HP);

        return res;

    }
}
