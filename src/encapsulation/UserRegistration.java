package encapsulation;

public class UserRegistration {

    public String registerUser(String userLogin, String userPassword) {
        if (whetherUserExist(userLogin)) {

            return "User not registered - this user already exist";
        }
        if (whetherUsernameContainsIllegalCharacter(userLogin)) {

            return "User not registered - user login contains illegal characters";
        }

        if (whetherUserPasswordIsTooSimple(userPassword)) {
            return "User password is too simple";
        }
        return "User registered";
    }

    private boolean whetherUserExist(String userLogin) {
        return false;
    }

    private boolean whetherUsernameContainsIllegalCharacter(String userLogin) {
        return userLogin.contains("#") || userLogin.contains("$");
    }

    private boolean whetherUserPasswordIsTooSimple(String userPassword) {
        return userPassword.length() <= 8;
    }

    //when we want to register new user we neeed only this one public method we don't need to use other methods inside this one
    // hiding access to class members is encapsulation - we can hide from access methods and fields,
}

