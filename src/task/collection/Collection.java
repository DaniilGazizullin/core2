package task.collection;

import java.util.*;

public class Collection {

    public int findMaxElement(List<Integer> list) {
        return Collections.max(list);
    }

    public List<Integer> removeDuplicates(List<Integer> list) {
        Set<Integer> set = new HashSet<>(list);
        return new ArrayList<>(set);
    }

    public List<Integer> sortDescending(List<Integer> list) {
        List<Integer> sortedList = new ArrayList<>(list);
        Collections.sort(sortedList, Collections.reverseOrder());
        return sortedList;
    }

    public boolean containsElement(Set<Integer> set, int element) {
        Set<Integer> set1 = new HashSet<>(set);
        for (Integer elements : set1) {
            if (elements == element) {
                return true;
            }
        }
        return false;
    }

    public Set<Integer> findIntersection(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> result = new HashSet<>();
        for (Integer elements : set1) {
            if (set2.contains(elements)) {
                result.add(elements);
            }
        }
        return result;
    }

    public Set<Integer> removeCommonElements(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> result = new HashSet<>(set1);
        for (Integer elements : set2) {
            result.remove(elements);
        }
        return result;
    }

    public boolean containsKey(Map<String, Integer> map, String key) {
        if (map.containsKey(key)) {
            return true;
        }
        return false;
    }

    public List<Integer> getValuesByKey(Map<String, List<Integer>> map, String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        return null;
    }

    public void removeEntriesByValue(Map<String, Integer> map, int value) {
//9. Удалить все записи из карты, у которых значение равно определенному значению.
        if (map.containsValue(value)) {
            map.remove(value);
        }
    }

    public void addToQueue(Queue<Integer> queue, int element) {
        //10. Добавить элемент в очередь.
        queue.add(element);
    }

    public Integer pollFromQueue(Queue<Integer> queue) {
        // 11. Получить и удалить первый элемент из очереди.
        return queue.remove();
    }

    public boolean isQueueEmpty(Queue<Integer> queue) {

        return queue.isEmpty();
    }

    public static void printOrdersWithMaxAmount(List<Order> orders) {
        //Учет заказов:
        //    - Создайте класс Order с полями id, customer и totalAmount.
        //    - Создайте метод, который будет принимать список заказов и выводить заказы с наибольшей суммой.
        //    - Создайте метод, который будет принимать список заказов и возвращать общую сумму всех заказов.
        if (orders.isEmpty()) {
            System.out.println("Список заказов пуст");
            return;
        }
        int maxAmount = orders.get(0).getTotalAmount();
        for (Order order : orders) {
            if (order.getTotalAmount() > maxAmount) {
                maxAmount = order.getTotalAmount();
            }
        }
        System.out.println("Максимальная сумма заказа " + maxAmount);
        for (Order order : orders) {
            if (order.getTotalAmount() == maxAmount) {
                System.out.println(order);
            }
        }
    }


    public int getTotalAmountOfOrders(List<Order> orders) {
        if (orders.isEmpty()) {
            System.out.println("Список заказов пуст");
        }
        int amountOfOrders = 0;
        for (Order order : orders) {
            amountOfOrders += order.getTotalAmount();

        }
        return amountOfOrders;

    }

    public static void printIncompleteTasks(List<Task> tasks) {
        if (tasks.isEmpty()) {
            System.out.println("Задач нет");
        }
        System.out.println("Незавершённые задачи:");
        for(Task task:tasks){
            if (task.isCompleted()==false){
                System.out.println(task.getTitle());
            }
        }

    }

    public List<Task> getTasksByTitle(List<Task> tasks, String title) {
        List<Task> result=new ArrayList<>();
        for(Task task: tasks){
            if(task.getTitle()==title){
result.add(task);
            }
        }
        return result;
    }

    public static void printStudents(List<Student> students) {
        for(Student student: students){
            System.out.println(student);
        }
    }

    public List<Student> getStudentsOlderThan(List<Student> students, int age) {
        List<Student> result= new ArrayList<>();
        for (Student student: students){
            if(student.getAge()>age){
                 result.add(student);

            }
        }
        return result;
    }

    public static void printProductsWithZeroQuantity(List<Product> products) {
        for (Product product: products){
            if(product.getQuantity()==0){
                System.out.println(product);
            }
        }

    }

    public int getTotalQuantityOfProducts(List<Product> products) {
        int result=0;
        for (Product product: products){
            result=result+product.getQuantity();
        }
        return result;
    }

    public static void printStudentsWithWorstAttendance(List<AttendanceStudent> students) {
        int equal=100;
        for (AttendanceStudent attendanceStudent: students){
            if(Integer.parseInt(attendanceStudent.getAttendance())<equal){
                equal=Integer.parseInt(attendanceStudent.getAttendance());
            }
        }
        System.out.println("Наихудшая успеваемость: ");
        for  (AttendanceStudent attendanceStudent1 : students){
            if(equal==Integer.parseInt(attendanceStudent1.getAttendance())){
                System.out.println(attendanceStudent1);
            }
        }
    }

    public double getAverageAttendance(List<AttendanceStudent> students) {
        int sum=0;
        for (AttendanceStudent attendanceStudent: students){
            sum=sum+Integer.parseInt(attendanceStudent.getAttendance());
        }

        return sum/students.size();
    }
}