package org.launchcode;

public class HelloMethods {
    public static void main(String[] args) {
        String message =  Message.getMessage("th");
        System.out.println(message);
        String name = Name.getName("R");
        System.out.println(name);

        Message person = new Message();
        System.out.println(person.toString());
    }


    public String toString(){
        return name +
    }
}
