// Написать приложение для ввода ФИО, возраст и пол пользователей.
// Данные хранить в разных списках. Сортировать пользователей по возрасту.
// Не вывести в порядке возрастания возрастов а именно сортировать!)

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class lesson_4 {
    public static void main(String[] args) {

        ArrayList<String> firstNames  = new ArrayList<>();
        ArrayList<String> lastNames   = new ArrayList<>();
        ArrayList<String> patronymics = new ArrayList<>();
        ArrayList<Integer> list_age   = new ArrayList<>();
        ArrayList<String> list_sex    = new ArrayList<>();
        List<Integer> linkedList      = new LinkedList<>();

        boolean flag = true;
        while (flag) {
            Scanner scannerName = new Scanner(System.in);
            Scanner scannerAge = new Scanner(System.in);
            Scanner scannerSex = new Scanner(System.in);
            Scanner scannerEnter = new Scanner(System.in);

            System.out.println("Введите ФИО: ");
            String name = scannerName.nextLine();

            String[] NameList = name.split(" ");
            if (NameList.length == 3) {
                lastNames.add(NameList[0]);
                firstNames.add(NameList[1]);
                patronymics.add(NameList[2]);
            } else if (NameList.length == 2) {
                lastNames.add(NameList[0]);
                firstNames.add(NameList[1]);
                patronymics.add("");
            } else {
                lastNames.add(NameList[0]);
                firstNames.add("");
                patronymics.add("");
            }

            System.out.println("Введите возраст: ");
            Integer age = scannerAge.nextInt();
            list_age.add(age);

            System.out.println("Введите пол: ");
            String gender = scannerSex.nextLine();
            if (gender.contains("М")) {
                list_sex.add("муж.");
            }
            else  {
                list_sex.add("жен.");
            }

            linkedList.add(list_age.size() - 1); 
            System.out.println("Продолжить ввод? Y/N");
            String yn = scannerEnter.nextLine();
            if (yn.toUpperCase().equals("N")) {
                flag = false;
            }

            // scannerName.close();
            // scannerAge.close();
            // scannerSex.close();
            // scannerEnter.close();

        }

        // сортировка по возрасту
        int n = list_age.size() - 1;
        while (n > -1) {
            int max_age = list_age.get(linkedList.get(n));
            int index = n;
            for (int i = 0; i < n; i++) {
                if (max_age < list_age.get(linkedList.get(i))) {
                    max_age = list_age.get(linkedList.get(i));
                    index = i;
                }
            }
            int tmp = linkedList.get(n);
            linkedList.set(n, linkedList.get(index));
            linkedList.set(index, tmp);

            n--;
        }
        linkedList.forEach(i ->
            System.out.println(firstNames.get(i)
                + lastNames.get(i) + " "
                + patronymics.get(i) + " "
                + list_age.get(i) + " "
                + list_sex.get(i)));

    }
}
