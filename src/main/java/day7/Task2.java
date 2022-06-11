package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        Random random = new Random();
        int min = 90;
        int max = 100;
        int diff = max - min;
        int randomStamina = random.nextInt(diff) + min;

        Player player1 = new Player(randomStamina);
        System.out.println(player1.getStamina()); // вывожу значение выносливости для наглядности - проверить, что работает передача случайного значени.
        Player player2 = new Player(randomStamina);
        Player player3 = new Player(randomStamina);
        Player player4 = new Player(randomStamina);
        Player player5 = new Player(randomStamina);
        Player player6 = new Player(randomStamina);


        Player.info();

        for (int i = player1.getStamina(); i >= 0; i--) {
            player1.run();
            player1.getCountPlayers();
        }
        System.out.println("Один игрок бежал и устал. Игроков на поле: " + player1.getCountPlayers());
    }
}

