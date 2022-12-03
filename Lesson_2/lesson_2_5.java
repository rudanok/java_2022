// Замените символ “=” на слово “равно”.
// Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().

public class lesson_2_5 {
    public static void main(String[] args) {

        String userString = "5 + 5 = 10";
        System.out.println(replaceEquals(userString));
    }

    static String replaceEquals(String userString) {

        StringBuilder s = new StringBuilder(userString);
        int index = s.indexOf("=");

        return s.deleteCharAt(index).insert(index, "равно").toString();
    }
}
