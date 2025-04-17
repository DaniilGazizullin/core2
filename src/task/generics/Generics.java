package task.generics;

import java.util.*;

public class Generics {

    public static <T> T getFirstElement(List<T> list) {
        // Реализуйте метод getFirstElement, который принимает список обобщенного типа T и возвращает первый элемент этого списка.
        // Если список пуст или равен null, метод должен выбрасывать исключение IllegalArgumentException с соответствующим сообщением.
        if (list.isEmpty() || list == null) {
            throw new IllegalArgumentException("Список не может быть пуст или равен null");
        }
        return list.getFirst();
    }

    public static <T> T getLastElement(List<T> list) {
        if (list.isEmpty() || list == null) {
            throw new IllegalArgumentException("Список не может быть пуст или равен null");
        }
        return list.getLast();
    }

    public static <T> List<T> mergeLists(List<T> list1, List<T> list2) {
        if (list1.isEmpty()||list1==null||list2.isEmpty()||list2==null){
            throw new IllegalArgumentException("Список не может быть пуст или равен null");
        }
        List<T> merged=new ArrayList<>();
        merged.addAll(list1);
        merged.addAll(list2);
        return merged;
    }

    public static <T> List<T> getUniqueElements(List<T> list) {
        if (list.isEmpty()||list==null){
            throw new IllegalArgumentException("Список не может быть пуст или равен null");}
        Set<T> unique=new LinkedHashSet<>(list);
        return new ArrayList<>(unique);
    }
}
