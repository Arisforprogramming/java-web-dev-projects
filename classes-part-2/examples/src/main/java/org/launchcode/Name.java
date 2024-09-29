package org.launchcode;

public class Name {
    public static String getName(String myName ){
        if (myName.contains("a")){
            return "It has 'a'";
        } else if (myName.contains("R")) {
            return "It has 'R'";
        } else {
            return "Try input again";
        }
    }
}
