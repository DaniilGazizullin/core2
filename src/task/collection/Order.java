package task.collection;

public class Order {
    //Учет заказов:
//    - Создайте класс Order с полями id, customer и totalAmount.
//    - Создайте метод, который будет принимать список заказов и выводить заказы с наибольшей суммой.
//    - Создайте метод, который будет принимать список заказов и возвращать общую сумму всех заказов.
    int id;
    String customer;
    int totalAmount;

    public Order(int id, String customer, int totalAmount) {
        this.id = id;
        this.customer = customer;
        this.totalAmount = totalAmount;
    }


    public int getTotalAmount() {
        return totalAmount;
    }

    @Override
    public String toString() {
        return "Order {" +
                "id заказа=" + id +
                ", покупатель='" + customer + '\'' +
                ", Общая сумма=" + totalAmount +
                '}';
    }


}

