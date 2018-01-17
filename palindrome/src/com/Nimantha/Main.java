package com.Nimantha;
import java.util.Scanner;
/*

@author Nimantha Nadeeraka

*/
public class Main {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Please enter the palindrome to check :");
	      // This line print in the console

        String U_input = input.nextLine();
        // get user input that user entered
        String Vlidate_input = U_input.toLowerCase().replaceAll("[^a-z]","");
        // validate user input using regular expression
        String backward = new String();
        //backward the string
        for (int i = Vlidate_input.length()-1 ;i >= 0; i--)
        {
            backward+= Vlidate_input.charAt(i);
        }
        // validate_input.length()-1 means array is 0 base

        if(backward.equals(Vlidate_input))
        {
            System.out.println("\n");
            System.out.println("*****Match****");
            System.out.println("  It is a PALINDROME");
        }
        else
        {
            System.out.println("\n");
            System.out.println("*****NO Match FOUND****");
            System.out.println("  It is not a PALINDROME");
        }


    }
}
