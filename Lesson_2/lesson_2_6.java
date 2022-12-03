// Замените символ “=” на слово “равно”.
// Используйте метод StringBuilder.replace().

public class lesson_2_6 {
    public static void main(String[] args) {

        String userString = "5 + 5 = 10";
        System.out.println(replaceEquals(userString));
    }

    static String replaceEquals(String userString) {

        StringBuilder task = new StringBuilder(userString);
        int index = task.indexOf("=");

        return task.replace(index, index + 1, "равно").toString();
    }
}