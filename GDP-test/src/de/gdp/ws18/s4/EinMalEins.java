package de.gdp.ws18.s4;

import java.util.Scanner;

public class EinMalEins {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        int n = scanner.nextInt();

        System.out.print("_x_:");
        for (int i = 1;i<=n;i++){
            System.out.print("__"+i+"|");
        }
        System.out.println();
        for (int i = 1;i<=n;i++){
            System.out.print("__"+i+":");
            for (int j = 1;j<=n;j++){
                System.out.print("__"+i*j+"|");
            }
            System.out.println();
        }
    }
}
