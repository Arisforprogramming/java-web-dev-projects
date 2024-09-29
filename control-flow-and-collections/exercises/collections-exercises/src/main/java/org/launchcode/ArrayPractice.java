package org.launchcode;

public class ArrayPractice {
    public static void main(String[] args) {

        int[] numbersArray = {1, 1, 2, 3, 5, 8};
        System.out.println("Print All");
        for(int num : numbersArray){
                System.out.println(num);
            }

        System.out.println("ODD Value");
           for(int num : numbersArray) {
               if(num %2 !=0) {
                   System.out.println(num);
               }
         }
    }
}
