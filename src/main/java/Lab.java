
public class Lab {
    /**
     * This challenge represents a hardcoded login example:
     *
     *     Let's say we have two users, named "admin" and "user".
     *     "admin" has a password of "qwerty".
     *     "user" has a password of "password".
     *
     * The method should return true if the login should be permitted, and false if it should not. You will need to use
     * if/else statements.
     *
     * @param username a String that represents a username.
     * @param password a String that represents a password.
     * @return true if there is a successful login, and false otherwise.
     */
    public boolean login(String username, String password){
        String adminKey = "qwerty";
        String userKey = "password";
        switch (username) {
            //Rather than use if else statements I thought it would be far more efficient to use switch casing here.
            case "user":
                return password.compareTo(userKey) == 0;//compareTo can be used in boolean comparison testing against zero to check validity true/false. 
            case "admin":
                return password.compareTo(adminKey) == 0;
            default:
                return false;
        }

    }
}