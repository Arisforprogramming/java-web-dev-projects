package org.launchcode;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter length of the rectangle: ");
        int inputNumLength  =  input.nextInt();
       // System.out.println("The length  of rectangle is " + inputNumLength);

        //Scanner input = new Scanner(System.in);
        System.out.println("Please enter width of the rectangle: ");
        int inputWidth =  input.nextInt();
        //System.out.println("The width of rectangle is " + inputWidth );

        int widthLength =  inputNumLength * inputWidth;
        System.out.println("The area of the rectangle is " + widthLength);

    }
}


