/*public class CatOwner {
    private Cat pet;
    public CatOwner(Cat pet){
        this.pet =pet;
    }
    public void feedTheCat(Boolean isFed) {
        // If the cat has already been fed, don't feed it again
        if (isFed) {
            System.out.println("The cat has already been fed.");
        } else {
            System.out.println("Feeding the cat...");
            // Code to feed the cat goes here
            isFed = true;
        }
    }
} */

public class CatOwner
{
    private Feedable pet;

    public CatOwner(Feedable pet) {
        this.pet = pet;
    }

    public  void feedTheCat() {

        // ...code to prepare the cat's meal...

        pet.eat();
    }
}
