package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        String name1 = "Baggins";
        String name2 = "Dresden";
        String name3 = "Howl";
        String name4 = "Potter";
        String name5 = "Vimes";



        System.out.println("What is your name?");
        String name = sc.next();


        if (name.compareTo(name1) < 0) {
            System.out.println("Great, you are on the Red Dragons");

        } else if (name.compareTo(name2) < 0) {
            System.out.println("Okay then you are on the Dark Wizards.");
        } else if (name.compareTo(name3) < 0) {
            System.out.println("That means you are on the Moving Castles.");
        } else if (name.compareTo(name4) < 0) {
            System.out.println("Okay then you are on the Golden Snitches!");
        } else if (name.compareTo(name5) < 0) {
            System.out.println("Sounds good, you are on the Night Guards.");
        } else if (name.compareTo(name5) > 0) {
            System.out.println("Well then you are on the Black Holes.");

        }

    }
}
