package com.butterfly;

import java.util.ArrayList;

public class CreditBank extends Bank{
    private static ArrayList<Credit> myList = new ArrayList<>();
    public CreditBank() {
        setName("Credit Bank");
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
            sum = credit.getSumCredit()*1.42;
        }
        if (credit.getTypeCredit() == TypeCredit.CASH) {
            sum = credit.getSumCredit()*1.37;
        }
        if (credit.getTypeCredit() == TypeCredit.REALTY) {
            sum = credit.getSumCredit()*1.12;
        }
        if (credit.getTypeCredit() == TypeCredit.TRAVEL) {
            sum = credit.getSumCredit()*1.49;
        }
        return sum;
    }
}
