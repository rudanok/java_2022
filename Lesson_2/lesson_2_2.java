public class lesson_2_2 {
    public static void main(String[] args) {
        
        String s1 = "done";
        String s2 = "enod";
        isReverseStrings(s1, s2);
        
    }

    // Процедура проверяет, являются ли две строки вращением друг друга
    static void isReverseStrings(String s1, String s2) {

        StringBuilder sTemp = new StringBuilder();
        for (int i = s1.length() - 1; i >= 0 ; i--) {
            sTemp.append(s1.charAt(i)) ;
        }

        if (s2.compareTo(sTemp.toString()) == 0) {
            System.out.println("Строки являются вращением друг друга.");
        }    
        else {
            System.out.println("Строки НЕ являются вращением друг друга.");
        }      
    }
}
