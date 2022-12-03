public class lesson_2_3 {
    public static void main(String[] args) {

        StringBuilder userString = new StringBuilder("word");
        reversString(userString);

    }

    // Процедура переворачивает строку с помощью рекурсии.
    static StringBuilder reversString (StringBuilder sr) {

        System.out.print(sr.charAt(sr.length()-1));
        if (sr.length() == 1) {
            return sr;
        }
        return reversString(sr.deleteCharAt(sr.length()-1));
    }

}
