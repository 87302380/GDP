package de.ostfalia.gdp.ws18.s2;

import com.sun.javafx.tools.packager.CreateJarParams;

import java.util.Scanner;

public class PasswortQualitaet {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String passwort = scanner.next();

        System.out.println();

        int punkt = 0;

        if (passwort.length()>=8)
            punkt++;

        int ziffern = 0;
        int buchstaben = 0;
        int grobuchstaben = 0;
        int kleinbuchstaben = 0;
        int sonderzeichen = 0;
        for (char c : passwort.toCharArray()){


            if (Character.isDigit(c)){
                ziffern++;
            }else if (Character.isLetter(c)){
                buchstaben++;
            }else {
                sonderzeichen++;
            }

            if (Character.isUpperCase(c))
                grobuchstaben++;

            if (Character.isLowerCase(c))
                kleinbuchstaben++;

        }
        if (ziffern>=2)
            punkt++;
        if (buchstaben>=2)
            punkt++;
        if (grobuchstaben>=1)
            punkt++;
        if (kleinbuchstaben>=1)
            punkt++;
        if (sonderzeichen>=1)
            punkt++;
        System.out.println("Bewertung in Punkten = " + punkt);
    }
}
