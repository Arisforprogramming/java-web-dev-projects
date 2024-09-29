package org.launchcode;

public class Fox {
    public static void main(String[] args) {
        String word = "I would not, could not, in a box." +
                      "I would not, could not with a fox." +
                      "I will not eat them in a house. I will not eat them with a mouse.";
        System.out.println(word);
        String delimeter = (" ");
        String[] myArray = word.split(delimeter);
        System.out.println("AFTER SPLIT");
        for (String newString : myArray) {
            System.out.println(newString);
            System.out.println(newString.toString(myArray));
        }


    }
}
