package polymorphism;

public class Headphones {

    //in this class we need only name of headphones ang method to get the name

    private final String name; // here we create final field -> becsuse we create headphones ones, we wouldn't change its name

    public Headphones(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
