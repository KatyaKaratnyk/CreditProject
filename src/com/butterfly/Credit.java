package com.butterfly;

import java.util.ArrayList;

public class Credit {
    private double sumCredit;
    private int termCredit;
    private boolean isOpenCredit;
    private TypeCredit typeCredit;
    private String myBank;


    Credit(TypeCredit typeCredit, double sumCredit, int termCredit) {
        this.typeCredit = typeCredit;
        this.sumCredit = sumCredit;
        this.termCredit = termCredit;
    }

    public void setMyBank(String myBank) {
        this.myBank = myBank;
    }

    public String getMyBank() {
        return myBank;
    }

    public double getSumCredit() {
        return sumCredit;
    }

    public TypeCredit getTypeCredit() {
        return typeCredit;
    }

    public boolean isOpenCredit() {
        return isOpenCredit;
    }
    public void isActiveCredit() {
        if(this.isOpenCredit()==true) System.out.println("Your credit is Open");
        else System.out.println("Your credit is Close");
    }

    public void setOpenCredit(boolean openCredit) {
        this.isOpenCredit = openCredit;
    }

    public int getTermCredit() {
        return termCredit;
    }
    public double calculateAllCredit(Bank myBank) {
        return myBank.calculate(this);
    }
    public void paymentInMonth(Bank myBank) {
        System.out.println(String.format("You must pay: %.2f$ in month",this.calculateAllCredit(myBank)/this.getTermCredit()));
    }
    public void increaseCredit(double sum) {
        this.sumCredit = this.sumCredit+sum;
    }
    public String findOptimalBank(Bank...args) {
        String result = args[0].getName();
        double sum = args[0].calculate(this);
        if(args.length==0) System.out.println("You entered anyone bank");
        for(int i = 1; i<args.length; i++) {
            if(sum>args[i].calculate(this)) result = args[i].getName();
        }
        return result;
    }

    @Override
    public String toString() {
        return "name credit: "+this.getTypeCredit().toString()+", sum of credit: "+this.getSumCredit();
    }
}
