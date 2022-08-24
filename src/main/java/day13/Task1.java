package day13;

public class Task1 {
    public static void main(String[] args) {

        User user_1 = new User("Alex");
        User user_2 = new User("Monika");
        User user_3 = new User("Charles");


        //user_1 to user_2
        user_1.sendMessage(user_2, "Hello, how are you?");
        user_1.sendMessage(user_2, "I'm warring about you");

        // user_2 to user-1
        user_2.sendMessage(user_1, "Thank you, I'm fine!");
        user_2.sendMessage(user_1, "I was sleeping");
        user_2.sendMessage(user_1, "What you will you be doing now?");

        // user_3 to user_1
        user_3.sendMessage(user_1, "Hi, Monika propose us to bicycle today, wouldn't you mind?");
        user_3.sendMessage(user_1, "I will rent the bike for me and Monika");
        user_3.sendMessage(user_1, "Do you also need a one for you or you have got your own?");

        // user_1 to user_3

        user_1.sendMessage(user_3, "Well, sounds interesting, let's think about");
        user_1.sendMessage(user_3, "No, thank you! I have got mine");
        user_1.sendMessage(user_3, "What time we are meeting at?");

        // user_3 to user_1

        user_3.sendMessage(user_1, "6 o'clock, and please do not be late");

        System.out.println("------------Выводим все созданные сообщения---------------");

        System.out.println(MessageDatabase.getMessages());

        System.out.println("-----------Выводим диалог--------------");

        // вызываем диалог

        MessageDatabase.showDialog(user_1, user_3);

        System.out.println("-----------Выводим информацию о дружбе-----------");
        user_1.subscribe(user_3);
        user_3.subscribe(user_1);
        System.out.println(user_1.isFriend(user_3));
    }
}

