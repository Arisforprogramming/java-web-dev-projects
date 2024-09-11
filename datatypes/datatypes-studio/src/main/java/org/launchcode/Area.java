package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter a radius: ");

        Double inputRadius = input.nextDouble();
        //final Double PI = 3.14;
        //Double calculate =  PI * inputRadius * inputRadius;
        Double area = Circle.getArea(inputRadius);
        System.out.println(area);

        System.out.println("The area of a circle of radius " + inputRadius + " is " + area);
    }

}
