public class Main {

    public static void main(String[] args) {
        Pot pot = new Pot(12, 10, "silver");
        pot.colour = "black";
//        pot.height = 11;  after changing some fields to final in a Pot class we can't change their value after creating object
        // impprtant! -> final value of the field or variable means that value we can assign only once

        String message = pot.cook();// in cook() method we only return String to show this message we should print it -> we can put result to variable
        System.out.println(message);

        String message2 = pot.cook(true);
        System.out.println(message2);

        int temperature = pot.returnTemperature();
        System.out.println(temperature);

        pot.cookWithoutInformation();
    }

}
