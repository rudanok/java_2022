import java.util.*;

public class lesson_6 {
    public static void main(String[] args) {
        // 1. Реализовать множество (set) с помощью TreeMap.
        Set<Integer> tset = new TreeSet<>();

        // 2. Создать метод add, добавляющий элемент в ваше множество.
        System.out.println();
        System.out.println("Создание метода add, добавляющего элементы в множество:");
        tset.addAll(createList(5));
        System.out.println(tset);

        // 3. Объявить и инициализировать компаратор с обратной (от большего к меньшему)
        // логикой сортировки чисел.
        // 4. Объявить и инициализировать TreeSet использующий ваш компаратор.
        // 5. Добавить несколько эллементов в сет и вывести в консоль.
        System.out.println();
        System.out.println("Объявление и инициализация компаратора с обратной (от большего к меньшеиу) логикой сортировки чисел:");
        Set<Integer> tset1 = new TreeSet<>(new Comparator<Integer>() {
            public int compare(Integer i1, Integer i2) {
                return i2.compareTo(i1);
            }
        });
        tset1.addAll(createList(5));
        System.out.println(tset1);
    }

    // Метод добавляет случайные элементы в множество.
    private static List<Integer> createList(int sizeList) {
        List<Integer> randomList = new ArrayList<>();
        while (randomList.size() < sizeList) {
            randomList.add((int) (Math.random() * 100));
        }
        return randomList;
    }
}