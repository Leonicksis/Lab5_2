package com.company;

public class Exept extends Exception{

    private final int index;
    public Exept(int ind) {
        super("Mobiles can't have two same chip, bro :C");
        this.index = ind;
    }
    public int getIndex() {
        return index;
    }

}