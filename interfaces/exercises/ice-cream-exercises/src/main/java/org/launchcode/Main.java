package org.launchcode;

import java.util.ArrayList;
import java.util.Comparator;


public class Main {
    public static void main(String[] args) {
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        private ArrayList<Topping> menu.gettoppings;

        //To sort the flavors list. first create a new FlavorComparator object.
        //Comparator<Flavor> comparator = new FlavorComparator();
        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name' field.
        //call the sort method on flavors and pass the comparator
       //iterate through using for each loop
        System.out.println("Try our flavors!"+"\n");
        flavors.sort(new FlavorComparator());
             for (Flavor flavor : flavors){
                 System.out.println(flavor.getName());
             }
        System.out.println();


        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost' field.
        System.out.println("SEE HOW MUCH"+"\n");
        cones.sort(new ConeComparator());
        for (Cone cone : cones){
            System.out.println(cone.getName()+":$"+ cone.getCost());
        }
        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.

        //TODO :  BONUS
        System.out.println("ALLERGIES WATCHOUT"+"\n");
        flavors.sort(new FlavorComparator());
        for (Flavor flavor : flavors){
            System.out.println(flavor.getName()+":-Allergens List"+ flavor.getAllergens()+flavor.getAllergens().size());
        }
        for (Topping topping : toppings) {
            System.out.println("test toping : "+ topping.getName());
        }
    }
}