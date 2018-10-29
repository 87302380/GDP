package de.gdp.ws18.s3;

import java.util.Scanner;

public class Multiplikationsverfahren {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        StringBuffer s = new StringBuffer();
        while (a>0){
            s.append(a%2);
            a = a/2;
        }

        int n = 1;
        String a2 = s.toString();
        int result = 0;
        for (int i = 0;i<a2.length();i++){
            result = result + Integer.parseInt(String.valueOf(a2.charAt(i)))*n*b;
            n = n*2;
        }

        System.out.println(result);

        scanner.close();
    }
}
