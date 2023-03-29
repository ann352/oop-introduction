package accessOfElements;

public class Main {

    //modificator private - method is visible only in the class where is defined

    public static void main(String[] args) {

        UserRegistration userRegistration = new UserRegistration();
        String result = userRegistration.registerUser("aania120", "topSecret");
        System.out.println(result);

        User david = new User(18, "David");
        david.setAge(17);

        if (david.isAdult(17)) {
            System.out.println("David can buy alkohol");
            ;
        } else {
            System.out.println("David can't buy alkohol");
        }
    }
}
