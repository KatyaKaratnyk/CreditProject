package com.butterfly;

import java.util.ArrayList;

public class PrivatBank extends Bank {
    private static ArrayList<Credit> myList = new ArrayList<>();

    public PrivatBank() {
        setName("Private Bank");
        setCanIncrease(true);
    }

    public ArrayList<Credit> getMyList() {
        return myList;
    }

    public static void open(Credit credit) {
        myList.add(credit);
        credit.setOpenCredit(true);
    }

    public static void close(Credit credit) {
        myList.remove(credit);
        credit.setOpenCredit(false);
    }

    public double calculate(Credit credit) {
        double sum=0;
        if (credit.getTypeCredit() == TypeCredit.AUTO) {
            sum = credit.getSumCredit()*1.3;
        }
        if (credit.getTypeCredit() == TypeCredit.CASH) {
            sum = credit.getSumCredit()*1.5;
        }
        if (credit.getTypeCredit() == TypeCredit.REALTY) {
            sum = credit.getSumCredit()*1.2;
        }
        if (credit.getTypeCredit() == TypeCredit.TRAVEL) {
            sum = credit.getSumCredit()*1.4;
        }
        return sum;
    }
}
