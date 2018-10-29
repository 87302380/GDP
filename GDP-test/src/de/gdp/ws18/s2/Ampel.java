package de.gdp.ws18.s2;

import java.util.Scanner;

public class Ampel {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int status = scanner.nextInt();

        switch (status){
            case 100:
                System.out.println("Du musst anhalten / warten!");
                break;
            case 010:
                System.out.println("Bremsen! Gleich wird es rot.");
                break;
            case 001:
                System.out.println("Du darfst fahren!");
                break;
            case  110:
                System.out.println("Aufgepasst! Gleich geht es weiter.");
                break;
            default:
                System.out.println("falsh");
        }

    }
}
