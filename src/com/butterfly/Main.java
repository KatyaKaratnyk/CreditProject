package com.butterfly;

public class Main {

    public static void main(String[] args) {
        Credit credit1 = new Credit(TypeCredit.REALTY, 20000, 24);
        System.out.println(credit1.calculateAllCredit(new PrivatBank()));
        System.out.println(credit1.findOptimalBank(new PrivatBank(), new CreditBank(), new OksiBank()));
        credit1.isActiveCredit();
        credit1.paymentInMonth(new CreditBank());
        CreditBank.open(credit1);
        credit1.isActiveCredit();
        CreditBank.close(credit1);
        credit1.isActiveCredit();
        Credit credit2 = new Credit(TypeCredit.TRAVEL, 6000, 6);
        System.out.println(credit2.findOptimalBank(new CreditBank(), new PrivatBank(), new OksiBank()));
        OksiBank.open(credit2);
        credit2.isActiveCredit();
        credit2.paymentInMonth(new OksiBank());
        credit2.increaseCredit(4000);
        credit2.paymentInMonth(new OksiBank());


    }
}
