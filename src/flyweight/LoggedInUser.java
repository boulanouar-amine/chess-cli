package flyweight;

public class LoggedInUser extends User {

    private String fullname;
    private String email;
    private String address;


    public LoggedInUser(String username) {
        super(username);

    }

}

