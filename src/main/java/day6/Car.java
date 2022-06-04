package day6;

public class Car {
    private String model;
    private String color;
    private int year;

    void setModel(String model) {
        this.model = model;
    }

    String getModel() {
        return model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void info() {
        System.out.println("Это автомобиль");
    }

    public int yearDifference(int inputYear) {
        int year = 2020;
        int yearDifference = inputYear - year;
        if (yearDifference < 0) {
            yearDifference *= (-1);
        }
        return yearDifference;
    }
}
