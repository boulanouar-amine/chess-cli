package flyweight;

public class Main {

    public static void main(String[] args) {

        FlyWeightFactory flyWeightFactory = new FlyWeightFactory();
        User anonuser1 = flyWeightFactory.getUser();
        User anonuser2 = flyWeightFactory.getUser();


        User user1 = new LoggedInUser("default");
        User user2 = new LoggedInUser("user2");

        System.out.println(anonuser1);
        System.out.println(anonuser2);
        System.out.println(user1);
        System.out.println(user2);


    }
}
