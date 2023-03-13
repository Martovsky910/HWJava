import java.util.Scanner;

public class Task2_2 {
    public static void main(String[] args){
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num = iScanner.nextInt();
        System.out.print("Введите знак: +, -, , /: ");
        String oper = iScanner.next();
        System.out.print("Введите второе число: ");
        int num2 = iScanner.nextInt();
        int result = 0;

        switch(oper){

            case "+":
                result = num + num2;
                break;

            case "-":
                result = num - num2;
                break;

            case "":
                result = num * num2;
                break;
            case "/":
                result = num / num2;
                break;
        }
        System.out.print("Результат: ");
        System.out.printf("%d %s %d = %d", num, oper, num2, result);
    }
}