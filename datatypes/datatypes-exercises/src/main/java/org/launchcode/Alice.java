package org.launchcode;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

       String word = ("Alice was beginning to get very tired of sitting \n" +
                "by her sister on the bank, and of having nothing to do:\n" +
                "Alice was beginning to get very tired of sitting by her sister on the bank,\n" +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading,\n" +
                "but it had no pictures or conversations in it, ‘and what is the use of a book,’ thought Alice ‘without\n" +
                "pictures or conversation?’once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it,\n" +
                "‘and what is the use of a book,’ thought Alice ‘without pictures or conversation?’");

        System.out.println("Enter word you are looking for : ");
        String searchWord =  input.nextLine();

        boolean containWord = word.contains(searchWord);
        //System.out.println(containWord);

        String result = Boolean.toString(containWord).toLowerCase();
        System.out.println(result);

        Integer index = word.indexOf(searchWord);
        Integer length = searchWord.length();
        System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");
        String modifiedSentence = word.replace(searchWord, "Arissara");
        System.out.println(modifiedSentence);
    }

}
