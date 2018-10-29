package de.gdp.ws18.s3;

import java.util.Scanner;

public class Zahlenfolge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();

        int max = 0;
        int k = 1;
        while (x!=1){
            if (x%2 == 0){
                x = x/2;
            }else {
                x = x*3+1;
            }
            k++;
            if (max<x){
                max = x;
            }
            System.out.print(x+" ");
        }
        System.out.println();
        System.out.println("Maximaler Wert = "+max);
        System.out.println("Anzahl Elemente = "+k);

        scanner.close();
    }
}
