package flyweight;

import javax.swing.*;
import java.awt.*;

public class User {

    private String username = "default";
    private Image image;


    public User(String username) {

        this.username = username;
        this.image = new ImageIcon("src/FlyWeight/img/" + username + ".jpg").getImage();
    }

    public User() {

        this("default");
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", image=" + image +
                '}';
    }
}
