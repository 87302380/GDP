package de.ostfalia.gdp.ws18.s2;

import java.util.Locale;
import java.util.Scanner;

public class QuadratischeGleichung {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        double p = scanner.nextDouble();
        double q = scanner.nextDouble();

        System.out.println();

        if (p*p-4*q<0){
            System.out.println("Loesung = keine");
        }

        if (p*p-4*q==0){
            System.out.println("Eine Loesung ="+" "+((-p/2)+Math.sqrt((p*p/4.0)-q)));
        }

        if (p*p-4*q>0){
            System.out.println("Loesung 1 ="+" "+((-p/2)+Math.sqrt((p*p/4.0)-q)));
            System.out.println("Loesung 2 ="+" "+((-p/2)-Math.sqrt((p*p/4.0)-q)));
        }
     }
}
