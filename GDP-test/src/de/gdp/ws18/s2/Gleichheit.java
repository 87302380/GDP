package de.gdp.ws18.s2;

import java.util.Locale;
import java.util.Scanner;

public class Gleichheit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        int n = scanner.nextInt();

        boolean gleich = true;


        if ((int)x == (int)y){
            String xs = String.valueOf(x).replaceAll("\\d+\\.", "");
            String ys = String.valueOf(y).replaceAll("\\d+\\.", "");

            for (int i = 0;i<n&&i<xs.length()&&i<ys.length();i++){
                if (xs.toCharArray()[i] != ys.toCharArray()[i]){
                    gleich = false;
                }
            }
        }else {
            gleich = false;
        }

        System.out.println();
        if (gleich){
            System.out.println("Gleichheit = true");
        }else {
            System.out.println("Gleichheit = false");
        }




    }
}
