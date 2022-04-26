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
//intArr[4] = 10;//auserhalb der Gernze out of bounds
//nochwas
output("1.Element: " + intArr[0]);
output("2.Element: " + intArr[1]);
output("3.Element: " + intArr[2]);
output("letzeElement: " + intArr[3]);
output("letze Element: " + intArr[intArr.length-1]);
output("super der groschen ist gefallen");
String[]strArr  = {" ich "," bis"," Bernhard"};
output("1.Element" + strArr[0]);
output("2.Element" + strArr[1]);
output("3.Element" + strArr[2]);//3,4,5,6,7,//test2
//hallo? änderen

    }

    public static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

