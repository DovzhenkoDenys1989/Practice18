package com.company;

public class UserBank {
    private static MoneyTransactionUtil.Card cardNew1;
    private static MoneyTransactionUtil.Card cardNew2;

    public static void main(String[] args) {
        try {
            MoneyTransactionUtil.sendTo2(200, 100, 10000);
            System.out.println("Операция осуществлена успешно");
        } catch (AccountException e) {
            System.out.println("Ошибка с реквизитами банка. Возможно, номер карты отправителя и получателя совпадают.");
        } catch (MoneyValueExeption ex) {
            System.out.println("Ошибка с суммой отправки. Сумма должна быть больше 0. Сумма не должна превышать лимит в 100 000");
        }
    }
}

