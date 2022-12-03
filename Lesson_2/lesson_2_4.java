import java.util.Scanner;

// Дано два числа, например 3 и 56, необходимо составить следующие строки:
// 3 + 56 = 59
// 3 – 56 = -53
// 3 * 56 = 168 Используем метод StringBuilder.append().

public class lesson_2_4 {
    public static void main(String[] args) {

        System.out.printf("Введите первое число: ");
        Scanner userScanner = new Scanner(System.in);
        int number1 = userScanner.nextInt();
        System.out.printf("Введите второе число: ");
        int number2 = userScanner.nextInt();
        System.out.printf("Введите знак операции: ");
        String sign = userScanner.next();
        userScanner.close();

        // int number1 = 3;
        // int number2 = 56;
        // char sign = '*';

        System.out.println(compilerMathToStr(number1, number2, sign));

    }

    static String compilerMathToStr(int num1, int num2, String sign){
        StringBuilder mathTask = new StringBuilder();
        mathTask.append(num1).append(" ").append(sign).append(" ").append(num2).append(" = ");
        switch (sign) {
            case "+":
                mathTask.append(num1 + num2);
                break;
            case "-":
                mathTask.append(num1 - num2);
                break;
            case "*":
                mathTask.append(num1 * num2);
                break;
        }
        return mathTask.toString();
    }
}
