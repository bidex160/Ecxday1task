package com.company;

import java.util.Scanner;

public class Main {
      static Scanner scanner;
      static String value;
    public static void main(String[] args) {
	scanner = new Scanner(System.in);
	int x =1;


	 while (x!=0){
         System.out.println("Enter String Value to reverse");
         try {
         value = scanner.next();

     }catch (Exception e){
            scanner.next();
        }

         reversemethod(value);


	 }


    }

    private static void reversemethod(String value) {
        String reverse ="";


        int length = value.length()-1;

        int counter = length;
        while (counter >= 0){
            //System.out.println(value.charAt(counter));
            reverse += value.charAt(counter);
            counter--;
        }
        System.out.println("The Reverse of " + value + " " + "is"+ " " +reverse);

    }
}
