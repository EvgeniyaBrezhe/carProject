package com.company;

public class IdentityCardTest {

    public static void main(String[] args) {

        IdentityCard firstCard = new IdentityCard();
        IdentityCard secondCard = new IdentityCard();
        IdentityCard thirdCard = new IdentityCard();

        firstCard.number = "01";
        firstCard.firstName = "Shani";
        firstCard.lastName = "Buchanan";

        secondCard.number = "02";
        secondCard.firstName = "Rosie";
        secondCard.lastName = "Morrison";

        thirdCard.number = "03";
        thirdCard.firstName = "Inigo";
        thirdCard.lastName = "Koch";

        System.out.println("First card info:");
        System.out.println("Card number: " + firstCard.number);
        System.out.println("Holder's first name: " + firstCard.firstName);
        System.out.println("Holder's last name: " + firstCard.lastName);

        System.out.println();
        System.out.println("Second card info:");
        System.out.println("Card number: " + secondCard.number);
        System.out.println("Holder's first name: " + secondCard.firstName);
        System.out.println("Holder's last name: " + secondCard.lastName);

        System.out.println();
        System.out.println("Third card info:");
        System.out.println("Card number: " + thirdCard.number);
        System.out.println("Holder's first name: " + thirdCard.firstName);
        System.out.println("Holder's last name: " + thirdCard.lastName);
    }
}
