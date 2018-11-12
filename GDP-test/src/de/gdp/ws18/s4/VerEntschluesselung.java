package de.gdp.ws18.s4;

import java.util.Scanner;
import java.util.stream.Stream;

public class VerEntschluesselung {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String eingabe = scanner.next();
        int n = scanner.nextInt();
        System.out.println(entschluesseln(eingabe,n));
    }

    public static String verschluesseln(String eingabe, int n)
    {
        String ausgeben = "";
        for (int i = 0;i<eingabe.length();i++){
            char buchstabe = (char)((int)eingabe.charAt(i)+n);
            if (Character.isLowerCase(eingabe.charAt(i))){
                if (buchstabe>'z'){
                    buchstabe = (char)((int)buchstabe - (int)('z'-'a'+1));
                }
            }else {
                if (buchstabe>'Z'){
                    buchstabe = (char)((int)buchstabe - (int)('z'-'a'+1));
                }
            }
            ausgeben = ausgeben + buchstabe ;
        }
        return ausgeben;
    }

    public static String entschluesseln(String eingabe, int n)
    {
        String ausgeben = "";
        for (int i = 0;i<eingabe.length();i++){
            char buchstabe = (char)((int)eingabe.charAt(i)-n);
            if (Character.isLowerCase(eingabe.charAt(i))){
                if (buchstabe<'a'){
                    buchstabe = (char)((int)buchstabe + (int)('z'-'a'+1));
                }
            }else {
                if (buchstabe<'A'){
                    buchstabe = (char)((int)buchstabe + (int)('z'-'a'+1));
                }
            }
            ausgeben = ausgeben + buchstabe ;
        }
        return ausgeben;
    }
}
