package de.gdp.ws18.s4;

import java.util.Random;
import java.util.Scanner;

public class WuerfelZaehler {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int ein = 0;

        for (int i = 0;i<n;i++){

            if (Math.ceil(Math.random()*6)==1){
                ein++;
            }
        }
        System.out.println(ein);
        System.out.println((double) ein/n);
        System.out.println(1/6.0);
    }
}
