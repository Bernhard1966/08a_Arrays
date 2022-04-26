package com.cc.java;

import java.util.Arrays;


public class App {
    
    public static void main(String[] args) {
     
        // Deklaration: int
        int[] intArr = new int [4];
        output("Arr: " + intArr);
        output("Array-Länge: " + intArr.length);
        output("1.Element: " + intArr[0]);

        intArr[0] = 1;  // Datenzuweisung (Überschreiben der Anfangswerte)
        intArr[1] = 2;
        intArr[2] = 3;
        intArr[3] = 4;
        intArr[4] = 10;  // Index ausserhalb der Grenze!!!

        output("1.Element: " + intArr[0]);
        output("2.Element: " + intArr[1]);
        output("Letztes Element: " + intArr[3]);
        output("Letztes Element: " + intArr[intArr.length-1]);
        output("Test: " + intArr[10]);
        
    }

    public static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

