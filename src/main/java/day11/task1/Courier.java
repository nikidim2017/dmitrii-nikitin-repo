package day11.task1;

import javax.swing.plaf.IconUIResource;

public class Courier implements Worker {

    private int salary;
    private boolean isPaid;
    private Warehouse warehouse;


    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
            }

    public int getSalary() {
        return salary;
    }

    public boolean getIsPaid() {
        return isPaid;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public String toString() {
        return "salary: " + salary + " if the bonus is paid: " + isPaid;
    }

    @Override
    public void doWork() {
        salary += 100;
        warehouse.countDeliveredOrders();
    }

    @Override
    public void bonus() {
        if (warehouse.getCountDeliveredOrders() < 10000) {
            System.out.println("Бонус пока не доступен");
        } else if (isPaid) {
            System.out.println("Бонус уже был выплачен");
        } else {
            salary += 50000;
            isPaid = true;
        }
    }
}

