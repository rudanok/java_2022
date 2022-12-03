package Lesson_1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

// Первый семинар.
// 1. Выбросить случайное целое число в диапазоне от -1000 до 1000 и сохранить в i
// 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
// 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив file_m1
// 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
// 5. Сохранить оба массива в файлы с именами file_m1 и m2 соответственно.
// Пункты реализовать в методе main
// *Пункты реализовать в разных методах

public class lesson_1 {
    private static String n;

    public static void main(String[] args) throws IOException {
                                
        Random random = new Random();
      
        int i = random.nextInt(2001) - 1000;
		System.out.println("i = " + i);
        int nAbs = Math.abs(i); // Абсолютное значение числа
        n = Integer.toBinaryString(nAbs);// Число в двоичной системе
        System.out.println("Номер старшего значащего бита = " + n.length());

        File file_m1 = new File ("file_m1.xls"); 
        FileWriter fileWriter = new FileWriter(file_m1.getAbsoluteFile());
        StringBuilder stringBuilder1 = new StringBuilder(); 
        for (int j = i; j < Short.MAX_VALUE; j++) {
            if (j % n.length() == 0) {
                stringBuilder1.append(j + "  ");
                fileWriter.append(String.valueOf(j + " "));
                }
        }
        fileWriter.flush(); 

        File file_m2 = new File ("file_m2.xls"); 
        FileWriter fileWriter2 = new FileWriter(file_m2.getAbsoluteFile());
        StringBuilder stringBuilder2 = new StringBuilder();
        for (int j = Short.MIN_VALUE; j < i; j++) {
        if (j % n.length() != 0) {
            stringBuilder2.append(j + "  ");
            fileWriter2.append(String.valueOf(j + " "));
            }
        }
        fileWriter.flush(); 
    }
}