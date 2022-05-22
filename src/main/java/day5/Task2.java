package day5;


public class Task2 {
    public static void main(String[] args) {

        Motorbike motorbike = new Motorbike("Yamaha", "Red", 2021);
        System.out.println("Модель, цвет и год производства: " + motorbike.getModel() + " " + motorbike.getColor() + " " + motorbike.getYearOfManufacture());
    }
}

        class Motorbike {
            private String model;
            private String color;
            private int yearOfManufacture;

            public Motorbike(String model, String color, int yearOfManufacture) {
                this.model = model;
                this.color = color;
                this.yearOfManufacture = yearOfManufacture;
            }

            public String getModel() {
                return model;
            }
            public String getColor() {
                return color;
            }
            public int getYearOfManufacture() {
                return yearOfManufacture;
            }
        }




