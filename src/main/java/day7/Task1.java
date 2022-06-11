package day7;

public class Task1 {
    public static void main(String[] args) {

        Airplane airplane1 = new Airplane("Airbus",2020, 50, 60);
        Airplane airplane2 = new Airplane("Boeing",2016, 45, 50);

        Airplane.compareAirplanes(airplane1, airplane2);
    }
}