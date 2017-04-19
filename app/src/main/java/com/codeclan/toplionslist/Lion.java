package com.codeclan.toplionslist;


public class Lion {

    private int playerPosition;
    private String name;
    private int year;

    public Lion(Integer playerPosition, String name, Integer year) {
        this.playerPosition = playerPosition;
        this.name = name;
        this.year = year;
    }

    public Integer getPlayerPosition() {
        return playerPosition;
    }

    public String getName() {

        return name;
    }

    public Integer getYear() {

        return year;
    }

}
