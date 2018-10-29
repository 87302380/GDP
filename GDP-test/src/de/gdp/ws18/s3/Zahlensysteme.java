package de.gdp.ws18.s3;

import java.util.Scanner;

public class Zahlensysteme {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Vom Zahlensystem:");
        int vom = scanner.nextInt();

        System.out.print("in das Zahlensystem:");
        int is = scanner.nextInt();

        System.out.print("Zahl:");

        int zahl = scanner.nextInt();
        int zahlout = zahl;
        int zahl10 = 0;
        int n = 1;

        while (zahl>0){
            zahl10 = zahl10 + n*(zahl%10);
            n = n*vom;
            zahl = zahl/10;
        }

        int zahl10out = zahl10;

        StringBuffer out = new StringBuffer();
        while (zahl10>0){
            out.append(zahl10%is);
            zahl10 = zahl10/is;
        }

        System.out.println("Im "+vom+"er-System ist die Zahl :"+zahlout);
        System.out.println("Im "+is+"er-System ist die Zahl :"+out.reverse().toString());
        System.out.println("Im 10er-System ist die Zahl :"+zahl10out);

        scanner.close();
    }
}
