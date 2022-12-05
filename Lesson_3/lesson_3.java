
import java.util.*;

public class lesson_3 {

    public static void main(String[] args) {

        // Задание 1. Создать новый список, добавить несколько строк и вывести коллекцию на экран.
        System.out.println("1. Создаём первый список:");
        ArrayList<String> list1 = createList();
        System.out.println(list1);
        System.out.println();

        // Задание 2 будет ниже 

        // Задание 3. Вставить элемент в список в первой позиции.
        System.out.println("3. Вставляем элемент в первой позиции:");
        System.out.println(addItem(list1, "Коля", 0));
        System.out.println();

        // Задание 4. Извлечь элемент (по указанному индексу) из заданного списка. 
        System.out.println("4. Получаем элемент с индексом 2:");
        System.out.println(getItem(list1, 2));
        System.out.println();

        // Задание 5. Обновить определенный элемент списка по заданному индексу.
        System.out.println("5. Изменяем элемент с индексом 0:");
        System.out.println(setItem(list1, 0, "Саша"));
        System.out.println();

        // Задание 6. Удалить третий элемент из списка.
        System.out.println("6. Удалаяем третий элемент из списка:");
        System.out.println(removeItem(list1, 2));
        System.out.println();
        
        // Задание 7. Поиск элемента в списке по строке. 
        System.out.println("7. Существует элемент со значением Петя?");
        System.out.println(searchItem(list1, "Петя"));
        System.out.println();

        // Задание 8. Создать новый список и добавить в него несколько элементов первого списка.
        System.out.println("8. Создаём второй список и добавляем в него несколько элементов первого списка:");
        ArrayList<String> list2 = createList2(list1);
        System.out.println(list2);
        System.out.println();

        //Задание 9. Удалить из первого списка все элементы, отсутствующие во втором списке.
        System.out.println("9. Удаляем из первого списка все элементы, которых нет во втором:");
        System.out.println(list1);
        System.out.println(retainItems(list1, list2));
        System.out.println();

        // Задание 10. Сортировка списка.
        System.out.println("10. Сортируем второй список:");
        System.out.println(sortList(list2));
        System.out.println();

        // Задание 2. Итерация всех элементов списка и добавления к каждому символа '!'.
        System.out.println("2. Ко всем строкам второго списка добавляем восклицательный знак:");
        System.out.println(addSymbol(list2, "!"));
        System.out.println();
    }

    // Процедура создаёт новый список строк и добавляет несколько элементов (строк).
    public static ArrayList<String> createList() {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Вася");
        list1.add("Петя");
        list1.add("Ваня");
        return list1;
    }

    // Процедура добавляет символ к каждому элементу списка строк.
    public static ArrayList<String> addSymbol(ArrayList<String> list, String symbol) {
        ListIterator<String> list1 = list.listIterator();
        while (list1.hasNext()){
            list1.set(list1.next().concat(symbol));
        }
        return list;
    }
    // Процедура вставляет в список элемент (строку) в нужной позиции.
    public static ArrayList<String> addItem(ArrayList<String> list, String word, Integer position) {
        list.add(position, word);
        return list;
    }
    // Процедура извлекает из списка элемент (строку) по указанному индексу.
    public static String getItem(ArrayList<String> list, Integer index) {
       return list.get(index);
    }

    // Процедура изменяет значение определённого элемента списка по заданному индексу.
    public static ArrayList<String> setItem(ArrayList<String> list, Integer index, String word) {
        list.set(index, word);
        return list;
    }

    // Процедура удаляет элемент списка по заданному индексу
    public static ArrayList<String> removeItem(ArrayList<String> list, int index) {
        list.remove(index);
        return list;
    }

    // Процедура определяет, существует ли элемент в списке.
    public static boolean searchItem(ArrayList<String> list, String item) {
        if (list.contains(item))
            return true;
        else
            return false;
    }

    // Процедура создаёт новый список и добавляет в него некоторые элементы первого списка.
    public static ArrayList<String> createList2(ArrayList<String> list) {
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Маша");
        list2.add("Лена");
        list2.add(list.get(0));
        list2.add(list.get(2));
        return list2;
    }

    // Процедура удаляет из первого списка все элементы отсутствующие во втором списке.
    public static ArrayList<String> retainItems(ArrayList<String> list1, ArrayList<String> list2) {
        list1.retainAll(list2);
        return list1;
    }

   // Процедура сортирует список.
    public static ArrayList<String> sortList(ArrayList<String> list) {
        Collections.sort(list);
        return list;
    }

}