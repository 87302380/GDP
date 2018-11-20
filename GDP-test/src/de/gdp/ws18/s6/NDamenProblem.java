package de.gdp.ws18.s6;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class NDamenProblem {
    public static void main(String[] args) {
        boolean[][] feld = {{false,false,false,false,false,true,false,false}
                            ,{false,false,false,true,false,false,false,false}
                            ,{false,false,false,false,false,false,true,false}
                            ,{true,false,false,false,false,false,false,false}
                            ,{false,false,false,false,false,false,false,true}
                            ,{false,true,false,false,false,false,false,false}
                            ,{false,false,false,false,true,false,false,false}
                            ,{false,false,true,false,false,false,false,false}};
        System.out.println(istLoesung(feld));

    }

    public static boolean istLoesung(boolean[][] feld){
        boolean Loesung = true;

        int n = feld[0].length;
        for (int i = 0;i<n;i++){
            boolean damen = false;
            for (int j = 0;j<n;j++){
                if (feld[i][j]){
                    if (damen==false){
                        damen = true;
                    }else {
                        Loesung = false;
                    }
                }
            }
        }

        for (int i = 0;i<n;i++){
            boolean damen = false;
            for (int j = 0;j<n;j++){
                if (feld[j][i]){
                    if (damen==false){
                        damen = true;
                    }else {
                        Loesung = false;
                    }
                }
            }
        }


        Loesung = xiexian(feld);

        return Loesung;
    }
    public static boolean xiexian(boolean[][] feld){
        int n = feld[0].length;

        Set<Double> xielv1 = new HashSet<>();
        Set<Double> xielv2 = new HashSet<>();

        for (int i = 0;i<n;i++){
            for (int j = 0;j<n;j++){
                if (feld[i][j]){
                    double zxielv = (double)(i+1)/(double)(j+1);
                    double fxielv = (double)(n-(i+1))/(double)(j+1);
                    xielv1.add(zxielv);
                    xielv2.add(fxielv);
                }
            }
        }
        if (xielv1.size()==n&&xielv2.size()==n){
            return true;
        }else {
            return false;
        }
    }
}

