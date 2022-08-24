package day13;

import java.util.ArrayList;
import java.util.List;


public class User {

    private String name;
    private List<User> subscriptions;


    public User(String name) {
        this.name = name;
        this.subscriptions = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public void subscribe(User user) {
        this.getSubscriptions().add(user);       // подписывает пользователя на пользователя user
    }


    @Override
    public int hashCode() {
        return 0;
    }

    public boolean isSubscribed(User user) {
        if (getSubscriptions().contains(user)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFriend(User user) {
        if (user.isSubscribed(this)) {
            user.getSubscriptions().add(this);
            return true;
        } else {
            return false;
        }
    }


    public void sendMessage(User user, String text) {
        MessageDatabase.addNewMessage(this, user, text);
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}


