public class lesson_2_1 {

    static final int no_of_chars = 256;

    // Функция находит наименьшее окно в исходной строке,
    // содержащей все символы шаблона (переменная pat).
    static String findSubString(String str, String pat) {

        int len1 = str.length();
        int len2 = pat.length();

        // Проверяем, что длина исходной строки больше длины шаблона.
        // Сообщаем, если меньше.
        if (len1 < len2) {
            System.out.println("Длина исходной строки меньше длины шаблона.");
            return "";
        }

        int hash_pat[] = new int[no_of_chars];
        int hash_str[] = new int[no_of_chars];

        // Сохраняем вхождение символов шаблона в массив hash_pat
        for (int i = 0; i < len2; i++)
            hash_pat[pat.charAt(i)]++;

        int start = 0, start_index = -1,
                min_len = Integer.MAX_VALUE;

        // Начинаем обход исходной строки, считая количество символов
        int count = 0;
        for (int j = 0; j < len1; j++) {

            // Считаем количество совпадения с символами строки шаблона
            hash_str[str.charAt(j)]++;

            // Если символ исходной строки совпадает с символом шаблона, то увеличиваем счетчик
            if (hash_str[str.charAt(j)] <= hash_pat[str.charAt(j)])
                count++;

            // Если все символы совпадают
            if (count == len2) {

                // Пытаемся уменьшить окно, удаляя лишние символы с начала строки
                while (hash_str[str.charAt(start)] > hash_pat[str.charAt(start)]
                        || hash_pat[str.charAt(start)] == 0) {

                    if (hash_str[str.charAt(start)] > hash_pat[str.charAt(start)])
                        hash_str[str.charAt(start)]--;
                    start++;
                }
                // Обновляем размер окна
                int len_window = j - start + 1;
                if (min_len > len_window) {
                    min_len = len_window;
                    start_index = start;
                }
            }
        }

        // Сообщаем, если окно не найдено
        if (start_index == -1) {
            System.out.println("Окна не существует.");
            return "";
        }

        // Возвращаем подстроку длиной min_len, начиная со start_index
        return str.substring(start_index,
                start_index + min_len);
    }

    public static void main(String[] args) {

        String str = "this is a test string";
        String pat = "tist";

        String minWindow = findSubString(str, pat);

        if (minWindow != "") {
            System.out.print("Наименьшее окно: " + minWindow);
        }
    }

    public static int getNoOfChars() {
        return no_of_chars;
    }
}