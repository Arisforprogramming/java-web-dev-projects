package org.launchcode;

import java.util.Scanner;

public class NumOfMiles {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of miles driven: ");
        Double numOfMiles =  input.nextDouble();

        System.out.println("Enter number of gas have consumed in gallons : ");
        Double numOfGas = input.nextDouble();

        Double total = numOfMiles/numOfGas;
        System.out.println("mile per Gallon is "+ total +"mpg.");
    }
}
