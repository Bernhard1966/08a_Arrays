package com.cc.java;

import java.util.Arrays;


public class App {
    
    public static void main(String[] args) {
     
        // // 1. Array I
        // // Deklaration: int
        // int[] intArr = new int [4];
        // output("Arr: " + intArr);
        // output("Array-Länge: " + intArr.length);
        // output("1.Element: " + intArr[0]);

        // intArr[0] = 1;  // Datenzuweisung (Überschreiben der Anfangswerte)
        // intArr[1] = 2;
        // intArr[2] = 3;
        // intArr[3] = 4;
        // intArr[4] = 10;  // Index ausserhalb der Grenze!!!

        // output("1.Element: " + intArr[0]);
        // output("2.Element: " + intArr[1]);
        // output("Letztes Element: " + intArr[3]);
        // output("Letztes Element: " + intArr[intArr.length-1]);
        // output("Test: " + intArr[10]);

        // 2. Array II
         String[] strArr = {"Ich","bin","Atanas","der","Coole"};
         
        //  output("1.Element: " + strArr[0]);
        //  output("2.Element: " + strArr[1]);
        //  output("3.Element: " + strArr[2]);  // 3,4,5,6,7, ....

        for (int i = 0; i < strArr.length; i++) 
        {
            output(strArr[i]); 
            // output("Element "+ Integer.toString(i + 1) + ": " + strArr[i]);        
        }

        
        
    }

    public static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

