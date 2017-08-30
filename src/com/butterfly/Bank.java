package com.butterfly;


import java.util.ArrayList;

public abstract class Bank {
    private String name;
    private boolean canIncrease;


    public String getName() {
        return name;
    }

    public boolean isCanIncrease() {
        return canIncrease;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCanIncrease(boolean canIncrease) {
        this.canIncrease = canIncrease;
    }

    public abstract double calculate(Credit credit);

}
