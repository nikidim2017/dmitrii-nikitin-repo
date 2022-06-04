package day6;

public class Task1 {
    public static void main(String[] args) {

        Car car = new Car();
        car.setModel("Toyota");
        car.setColor("Red");
        car.setYear(2021);
        car.info();
        System.out.println(car.yearDifference(1980));


        Motorbike motorbike = new Motorbike("Yamaha", "White", 2011);

        motorbike.info();
        System.out.println(car.yearDifference(2022));


    }
}
