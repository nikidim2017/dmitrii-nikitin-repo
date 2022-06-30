package day8;

public class Task1 {
    public static void main(String[] args) {


        long startTime = System.currentTimeMillis();

        String str = "";
        for (int i = 0; i < 20001; i++) {
            str = str + " " + i;
        }
        System.out.println(str);

        long stopTime = System.currentTimeMillis();

        System.out.println("Длительность работы, в мс.: " + (stopTime - startTime));

        System.out.println();
        System.out.println();

        startTime = System.currentTimeMillis();

        StringBuilder string = new StringBuilder("");

        for (int i = 0; i < 20001; i++) {
            string.append("").append(" ").append(i);
        }
        System.out.println(string);

        stopTime = System.currentTimeMillis();

        System.out.println("Длительность работы, в мс.: " + (stopTime - startTime));
    }
}

