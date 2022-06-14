package com.company;

public class CarTest {

    public static void main(String[] args) {

        Car firstCar = new Car();
        Car secondCar = new Car();
        Car thirdCar = new Car();

        firstCar.registrationNumber = "111";
        firstCar.color = "grey";
        firstCar.model = "peugeot";

        secondCar.registrationNumber = "222";
        secondCar.color = "black";
        secondCar.model = "mercedes";

        thirdCar.registrationNumber = "333";
        thirdCar.color = "white";
        thirdCar.model = "volvo";

        System.out.println("First car info:");
        System.out.println("Registration number: " + firstCar.registrationNumber);
        System.out.println("Color: " + firstCar.color);
        System.out.println("Model: " + firstCar.model);

        System.out.println();
        System.out.println("Second car info:");
        System.out.println("Registration number: " + secondCar.registrationNumber);
        System.out.println("Color: " + secondCar.color);
        System.out.println("Model: " + secondCar.model);

        System.out.println();
        System.out.println("Third car info:");
        System.out.println("Registration number: " + thirdCar.registrationNumber);
        System.out.println("Color: " + thirdCar.color);
        System.out.println("Model: " + thirdCar.model);
    }
}
