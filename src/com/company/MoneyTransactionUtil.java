package com.company;

import java.util.Scanner;

public class MoneyTransactionUtil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер карты отправителя: ");
        long cardPrivate = scanner.nextLong();
        System.out.println("Введите номер карты получателя: ");
        long cardMonobank = scanner.nextLong();
        System.out.println("Сумма перевода в гривнах: ");
        double sumTransfer = scanner.nextDouble();

        Card card1 = new Card(cardPrivate, 10000.00);
        Card card2 = new Card(cardMonobank, 0.00);

        sendTo(card1, card2, sumTransfer);

        //    System.out.println(card2);
    }

    static class Card {
        private long cardNumber;
        private double cardSum;

        public Card(long cardNumber, double cardSum) {
            this.cardNumber = cardNumber;
            this.cardSum = cardSum;
        }

        public long getCardNumber() {
            return cardNumber;
        }

        public void setCardNumber(long cardNumber) {
            this.cardNumber = cardNumber;
        }

        public double getCardSum() {
            return cardSum;
        }

        public void setCardSum(double cardSum) {
            this.cardSum = cardSum;
        }

        @Override
        public String toString() {
            return "Card{" +
                    "cardNumber=" + cardNumber +
                    ", cardSum=" + cardSum +
                    '}';
        }
    }

    public static void sendTo(Card cardNew1, Card cardNew2, double sum) throws RuntimeException {
        if (cardNew1.cardNumber == cardNew2.cardNumber) {
            throw new AccountException();
        }
        if (sum <= 0 || sum >= 100_000) {
            throw new MoneyValueExeption();
        }
        System.out.println("Сумма " + sum + ", со счета " + cardNew1.cardNumber + " успешно переведена на счет " + cardNew2.cardNumber);

        cardNew1.cardSum = cardNew1.cardSum - sum;
        cardNew2.cardSum = cardNew2.cardSum + sum;
    }

    public static void sendTo2(long cardNumber1, long cardNumber2, double sum) throws RuntimeException {
        if (cardNumber1 == cardNumber2) {
            throw new AccountException();
        }
        if (sum <= 0 || sum >= 100_000) {
            throw new MoneyValueExeption();
        }
    }

    private MoneyTransactionUtil() {
    }
}



