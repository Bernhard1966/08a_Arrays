package com.cc.java;

import java.util.Arrays;
//Alle arrays möglichkeiten

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
        //  String[] strArr = {"Ich","bin","Atanas","der","Coole"};
         
        //  output("1.Element: " + strArr[0]);
        //  output("2.Element: " + strArr[1]);
        //  output("3.Element: " + strArr[2]);  // 3,4,5,6,7, ....

        // Iteration mit For-Schleife / Loop
        // for (int i = 0; i < strArr.length; i++) 
        // {
        //     output(strArr[i]); 
        //     // output("Element "+ Integer.toString(i + 1) + ": " + strArr[i]);        
        // }

        // 3. Mehrdimensionale Arrays
		// String [][] strMdArr = new String [2][2];
		// String [][] strMdArr = {{"Max","Mustermann"},{"Maxine","Musterfrau"}};
        // output(strMdArr[0][0]);
		// output(strMdArr[1][1]);

        // nested loops
		// for (int i = 0; i < strMdArr.length; i++) {
		// 	for (int j = 0; j < strMdArr.length; j++) {
		// 		output("Indizes i/j: " + "i:" +  i + " j:"+ j + " " + strMdArr[i][j]);
		// 	}
		// }

        // Deklaration | Chars
		char [] letters = {'d','c','a','A','b'};
	
		output("");
		output("---- vor Sortierung: ");
		for (int i = 0; i < letters.length; i++) {
			output(letters[i]);	
		}

		// Sortierfkt. --> sortiertes Array
		Arrays.sort(letters);  // Statische Klasse | Methode

		output("");
		output("---- nach Sortierung: ");
		for (int i = 0; i < letters.length; i++) {
			output(letters[i]);	
		}

		// ... danach Suche (1)
        output("");
		output("---- Suche: erfolgreich ----");
		int searchIndex = Arrays.binarySearch(letters,'a');
		output(" searchIndex: " + searchIndex);
	
        // ... danach Suche (2)
		output("---- Suche: erfolglos ----");
		searchIndex = Arrays.binarySearch(letters,'e');
		output(" searchIndex: " + searchIndex);  // -(length+1)
		// .... isInArray()
		
        //.. Array füllen
		output("---- fill() ----");
		Arrays.fill(letters, '0');
		for (int i = 0; i < letters.length; i++) {
			output((letters[i]));
		}

    }

    public static void output(String outputStr) {
        System.out.println(outputStr);
    }

    // überladene Methode
    private static void output(char outChar) {
        System.out.print(outChar);
    }


}

