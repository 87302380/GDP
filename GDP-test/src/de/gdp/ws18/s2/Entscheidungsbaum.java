package de.gdp.ws18.s2;

import java.util.Scanner;

public class Entscheidungsbaum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("please input 4 wert for a,b,c,d");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        if (a>b&&a>c&a>d){
            System.out.println(a);
        }
        if (b>a&&b>c&b>d){
            System.out.println(b);
        }
        if (c>b&&c>a&c>d){
            System.out.println(c);
        }
        if (d>b&&d>c&d>a){
            System.out.println(d);
        }
    }
}
