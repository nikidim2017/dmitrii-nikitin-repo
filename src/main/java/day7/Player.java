package day7;

public class Player {
    private int stamina;
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    private static int countPlayers = 0;
    private int maxPlayers = 6;


    public Player(int stamina) {
        this.stamina = stamina;
        countPlayers++;
        if (countPlayers > maxPlayers) {
            countPlayers--;
        }
    }

    public int getStamina() {
        return stamina;
    }

    public int getCountPlayers() {
        return countPlayers;
    }

    public int run() {
        stamina--;
        if (stamina == 0) {
            countPlayers--;
        }
        return countPlayers;
    }

    public static void info() {
        int freePlaces = 6 - countPlayers;
        if (countPlayers < 6) {
            System.out.println("Команды неполные. На поле еще есть " + freePlaces + " свободных мест");
        } else {
            System.out.println("На поле нет свободных мест");
        }
        System.out.println("Игроков на поле: " + countPlayers);
    }
}



