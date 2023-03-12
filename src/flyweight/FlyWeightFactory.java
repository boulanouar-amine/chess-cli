package flyweight;

public class FlyWeightFactory {
    private static User user;

    public User getUser() {
        if (user == null) {
            user = new User();
        }return user;
    }
}
