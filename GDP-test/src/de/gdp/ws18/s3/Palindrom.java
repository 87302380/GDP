package de.gdp.ws18.s3;


import java.util.Scanner;

public class Palindrom {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();

        System.out.println();

        int n = 0;
        int m = text.length();
        boolean Palindrom = true;

        while (Palindrom&&n<=m) {
            if (text.charAt(n) != text.charAt(m-1)) {
                Palindrom = false;
            }
            n++;
            m--;
        }

        System.out.println("Palindrom = " + Palindrom);

        scanner.close();
    }
}
