package de.gdp.ws18.s5;

import java.util.Scanner;

public class speziell {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int zahl = scanner.nextInt();
        System.out.println(istSpeziell(zahl));
    }

    public static int quersumme(int zahl)
    {
        int quer = 0;
        while (zahl!=0){
            quer = zahl%10 + quer;
            zahl = zahl/10;
        }

        return quer;
    }

    public static boolean istSpeziell(int m)
    {
        return (m%quersumme(m)==0);
    }
}
