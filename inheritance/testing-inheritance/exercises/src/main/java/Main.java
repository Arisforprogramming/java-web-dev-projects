import java.awt.event.HierarchyBoundsAdapter;

public class Main {

    public static void main(String[] args) {
        HouseCat maw = new HouseCat("Cassy", 50);
        System.out.println("This cat name is " + maw.getName() + "and weight is " + maw.getWeight());
//        HouseCat spike = new HouseCat("Spike");
//        System.out.println(spike.getWeight()); // prints 13
//        System.out.println(maw.eat());
//        System.out.println(maw.isTired());
//        HouseCat spike = new HouseCat("Spike");
//        System.out.println(spike.getWeight()); // prints 13
//
        Cat plainCat = new Cat(8.6);
        HouseCat persian = new HouseCat("Padkeemao", 20);
        //call directly from the base class
        System.out.println(plainCat.noise());
        // called from the override
        System.out.println(persian.noise());

        Cat suki = new HouseCat("Suki", 8);
        System.out.println("\nCASTING");
        System.out.println(suki.noise());
//        System.out.println(((HouseCat) suki).isSatisfied());
        //HouseCat suki = new HouseCat("Suki", 12);
        CatOwner Annie = new CatOwner (suki);
        Annie.feedTheCat(false);
    }

}

