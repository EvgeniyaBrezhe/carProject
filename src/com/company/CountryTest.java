package com.company;

public class CountryTest {

    public static void main(String[] args) {

        Country Armenia = new Country();
        Country Georgia = new Country();
        Country Azerbaijan = new Country();

        Armenia.name = "Armenia";
        Armenia.square = 29743;
        Armenia.maxSpeed = 110;

        Georgia.name = "Georgia";
        Georgia.square = 69700;
        Georgia.maxSpeed = 110;

        Azerbaijan.name = "Azerbaijan";
        Azerbaijan.square = 86600;
        Azerbaijan.maxSpeed = 110;

        System.out.println("First country info:");
        System.out.println("Country's name: " + Armenia.name);
        System.out.println("Country's square: " + Armenia.square + " m²");
        System.out.println("Max speed permitted: " + Armenia.maxSpeed + " km/h");

        System.out.println();
        System.out.println("Second country info:");
        System.out.println("Country's name: " + Georgia.name);
        System.out.println("Country's square: " + Georgia.square + " m²");
        System.out.println("Max speed permitted: " + Georgia.maxSpeed + " km/h");

        System.out.println();
        System.out.println("Third country info:");
        System.out.println("Country's name: " + Azerbaijan.name);
        System.out.println("Country's square: " + Azerbaijan.square + " m²");
        System.out.println("Max speed permitted: " + Azerbaijan.maxSpeed + " km/h");
    }
}
