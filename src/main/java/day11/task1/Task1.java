package day11.task1;

public class Task1 {
    public static void main(String[] args) {

        Warehouse w1 = new Warehouse();
        Warehouse w2 = new Warehouse();
        Picker picker1 = new Picker(w1);
        Courier courier1 = new Courier(w1);
        Courier courier2 = new Courier(w1);

        Courier courier3 = new Courier(w2);
        Courier courier4 = new Courier(w2);


        businessProcess(picker1);
        System.out.println("Количество собранных заказов: " + w1.getCountPickedOrders());
        System.out.println("ЗП сборщика заказов 1: " + picker1.getSalary());

        businessProcess(courier1);
        System.out.println("Количество доставленных заказов курьера 1: " + w1.getCountDeliveredOrders());
        System.out.println("ЗП курьера 1: " + courier1.getSalary());

        System.out.println("---------------------------------------------------------");

        businessProcess(courier1);
        System.out.println("Количество доставленных заказов курьера 2: " + w1.getCountDeliveredOrders());
        System.out.println("ЗП курьера 1: " + courier1.getSalary());

            }


    static void businessProcess(Worker worker) {
        for (int i = 0; i < 10000; i++) {
            worker.doWork();
        }
        worker.bonus();
    }
}



