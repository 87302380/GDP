package de.gdp.ws18.s3;

import java.util.Scanner;

public class Potenz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int b = scanner.nextInt();
        int y = scanner.nextInt();

        int k = 1;

        boolean Potenz = false;
        if (b !=1 ){
            while (k<y){
                k = k*b;
                if (k==y){
                    Potenz = true;
                }
            }
        }else {
            Potenz = false;
        }

        if (y == 1){
            Potenz = true;
        }

        System.out.println(Potenz);

        scanner.close();
    }
}
