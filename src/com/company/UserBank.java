package com.company;

public class UserBank {
    private static MoneyTransactionUtil.Card cardNew1;
    private static MoneyTransactionUtil.Card cardNew2;

    public static void main(String[] args) {
        try {
            MoneyTransactionUtil.sendTo(cardNew1, cardNew2, 10000);
        } catch (RuntimeException e) {
            System.out.println("При обработке транзакции банка произошла ошибка");
        }
    }
}

