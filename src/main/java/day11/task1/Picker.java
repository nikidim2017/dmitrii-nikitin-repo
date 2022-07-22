package day11.task1;

public class Picker implements Worker {

    private int salary;
    private boolean isPaid;
    private Warehouse warehouse;

    public Picker(Warehouse warehouse) {
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
        return "salary: " + salary + " if the salary is paid: " + isPaid;
    }

    @Override
    public void doWork() {
        salary += 80;
        warehouse.countPickedOrders();
    }

    @Override
    public void bonus() {
        if (warehouse.getCountPickedOrders() < 10000) {
            System.out.println("Бонус пока не доступен");
        } else if (isPaid) {
            System.out.println("Бонус уже был выплачен");
        } else {
            salary += 70000;
            isPaid = true;
        }
    }
}

