public class Cat {

    private boolean tired = false;
    private boolean hungry = false;
    private double weight;

    // The biological family for all cat species
    private String family = "Felidae";
   // constructor that takes a single parameter
    public Cat(double aWeight) {

        weight = aWeight;
    }
    public Cat() {

        weight = 13;
    }

    /**** Getters and Setters ****/

    public boolean isTired() {

        return tired;
    }

    public void setTired(boolean aTired) {

        tired = aTired;
    }

    public boolean isHungry() {
        return hungry;
    }

    public void setHungry(boolean aHungry) {

        hungry = aHungry;
    }

    public double getWeight() {

        return weight;
    }

    public void setWeight(double aWeight) {

        weight = aWeight;
    }

    public String getFamily() {

        return family;
    }

    /**** Instance Methods ****/

    // A cat is rested and hungry after it sleeps
    public void sleep() {
        tired = false;
        hungry = true;
    }

    // Eating makes a cat not hungry
    public boolean eat() {

        // eating when not hungry makes a cat sleepy
        if (!hungry) {
            tired = true;
        }

        hungry = false;
        return false;
    }
   // public abstract String noise();
    public String noise() {

        return "Meeeeeeooooowww!";
    }




    }


}