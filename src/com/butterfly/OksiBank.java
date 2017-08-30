package com.butterfly;

import java.util.ArrayList;

public class OksiBank extends Bank {
    private static ArrayList<Credit> myList = new ArrayList<>();
    public OksiBank() {
        setName("Oksi Bank");
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
            sum = credit.getSumCredit()*1.45;
        }
        if (credit.getTypeCredit() == TypeCredit.CASH) {
            sum = credit.getSumCredit()*1.29;
        }
        if (credit.getTypeCredit() == TypeCredit.REALTY) {
            sum = credit.getSumCredit()*1.28;
        }
        if (credit.getTypeCredit() == TypeCredit.TRAVEL) {
            sum = credit.getSumCredit()*1.37;
        }
        return sum;
    }
}
