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

    public String cook(boolean saltIsAdded){
        if (saltIsAdded){
            return "Cooking with salt";
        }
        else {
            return "Cooking without salt";
        }
    }

    //we can return different type of values from method also

    public int returnTemperature(){
        return 100;
    }

    //we can't create the same method with the same set of arguments and the same name, even if we return another type of value
    // compilator woudn't know what we want to do - it only check argument, not their name

    void cookWithoutInformation(){
        return; // when we create void we can return nothing - return -> is not necessary */
    }





}
