package com.cc.java;

public class App {
    
    public static void main(String[] args) {
     //   Import java.until.arrays;
     // Deklaration. int
      int[] intArr =  new int [4];
      output("1.Element " + intArr[0]);
      output("arr: " + intArr);
      output("array-Länge" + intArr.length);
      
intArr[0] = 1;

intArr[1] = 2;
intArr[2] = 3;
intArr[3] = 4;
output("1.Element: " + intArr[0]);
output("2.Element: " + intArr[1]);
output("3.Element: " + intArr[2]);
output("letzeElement: " + intArr[3]);
output("letze Element: " + intArr[intArr.length-1]);


    }

    public static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

