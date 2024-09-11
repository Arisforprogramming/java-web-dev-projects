package org.launchcode;
import java.util.Scanner;

public class HelloWorldClass {
    public static void main(String[] args){
        //take in process
        // Create a Scanner object to read input from the console
       Scanner input = new Scanner(System.in);
        // Prompt user for input
       System.out.println("Hello, what is your name:");

       //Print Out Process
        // Read the user's input as a string
       String name = input.nextLine();
       //print the input
        System.out.println("Hello "+ name);
    }
}
