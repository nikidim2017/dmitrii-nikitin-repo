package day11.task1;

public class Warehouse {

    private int countPickedOrders;
    private int countDeliveredOrders;

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    @Override
    public String toString() {
        return "Picked orders: " + countPickedOrders + " Delivered orders: " + countDeliveredOrders;
    }

    public int countPickedOrders() {
        return countPickedOrders++;
    }

    public int countDeliveredOrders() {
        return countDeliveredOrders++;
    }
}
