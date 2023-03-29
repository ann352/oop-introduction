package initialInfromatin;

public class Pot {

    int diameter;  //to avoid changing this fields after creating new object, here we shoudl add 'final' - but then we can't create object with no-args construktor
    int height;
    String colour;

    public Pot() {
    }

    public Pot(int diameter, int height, String colour) {
        this.diameter = diameter;
        this.height = height;
        this.colour = colour;
    }

    //    public Pot(int diameter, int height){};  //if we want to have no-arg constructor in class too , we should declare int explicitly,
    //    we can declare some constant values ​​in the no-argument constructor, but it is not recommended and may confuse another person,
    //    a given class can have many constructors -> constructor overloading

    public Pot(int diameter, int height) {
        this.diameter = diameter;
        this.height = height;
    }

    public String cook() {
        return "Meal is cooking";
    }

    // method - we can put in here arguments, make some calculation, return some value or obkect (or not -void)
    // return is the last line in method, we can overloading like constructors
    // then they have the same name but e.g. different arguments

    public String cook(boolean saltIsAdded) {
        if (saltIsAdded) {
            return "Cooking with salt";
        } else {
            return "Cooking without salt";
        }
    }

    //we can return different type of values from method also

    public int returnTemperature() {
        return 100;
    }

    //we can't create the same method with the same set of arguments and the same name, even if we return another type of value
    // compilator woudn't know what we want to do - it only check argument, not their name

    public void cookWithoutInformation() {
        //we can use other methods in chosen method
        turnOnCooking();
        cookFor30minuts();
        turnOfCooking();
        // return; -> when we create void we can return nothing - return -> is not necessary */
        // but this can end instruction, e.g. when we have if-else instruction in method, and for true argument we want do nothing
        // methods used in this public method can be private -> because they're visible and used only in this class, not in Main class
    }

    private void turnOnCooking() {
        System.out.println("Cooking is starting");
    }

    private void cookFor30minuts() {
        System.out.println("Meal is cooking for 30 minuts");
    }

    private void turnOfCooking() {
        System.out.println("Cooking is ending");
    }

    //generally we should use single rsponsibility rule -> bigger piece of code should be refactor to smaller pieces
}
