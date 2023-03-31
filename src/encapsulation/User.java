package encapsulation;

public class User {

    int age;
    String name;

    //when we have no access specified, default is package private - all classes from the same package as User class can use fields
    // when we add to the field public modyficator then we can use it from every class even from other package - but isn't good idea
    // recommended solution is to put by fields private modificator and crate public getters and setters when are needed,

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    //getters and setters are methods, we should name them in specific way - getters should contain 'get' word, setters - 'set'
    // in setter we can check some conditions

    //we can delete getter with age from this class, when important for us id fact if given person is an adult
    // then we can create here only proper metod, creating getter with public modificator here is not needed
    // encapsulation in this class is implemented in a proper way, we gave access only to needed elements of class,

    public boolean isAdult(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }


    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            throw new RuntimeException("Age has to be bigger then 0");
        }
    }

    // if we don't have a setter in class and access to the field is public then wrong value of age can be set
    // generally we shouldn't create getter and setter to every field, when we think that given field shouldn't be changed
    // we can initialize this field in constructor and setter/getter shouldn't be created

    public void setName(String name) {
        this.name = name;
    }
}
