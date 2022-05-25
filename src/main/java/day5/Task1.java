package day5;

public class Task1 {

    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("Toyota");
        car.setColor("White");
        car.setYearOfManufacture(2022);
        System.out.println("Модель автомобиля: " + car.getModel());
        System.out.println("Цвет автомобиля: " + car.getColor());
        System.out.println("год выпуска: " + car.getYearOfManufacture());
    }
}

class Car {
    private String model;
    private String color;
    private int yearOfManufacture;

    public void setModel(String carModel) {
        model = carModel;
    }

    public String getModel() {
        return model;
    }

    public void setColor(String carColor) {
        color = carColor;
    }

    public String getColor() {
        return color;
    }

    public void setYearOfManufacture(int year) {
        yearOfManufacture = year;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }
}


