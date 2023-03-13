import java.util.logging.Logger;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;

public class Sem2Task1 {
    public static int[] GetArr(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int len = sc.nextInt();
        int arr[] = new int[len];
        System.out.println("Введите элементы массива через пробел: ");
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Введеный массив: "); // Не разобрался как объединить оба принта?
        System.out.println(Arrays.toString(arr)); // Чтоб в 1 строчку записать
        return arr;
    }
    public static int[] Sort(int arr[]) throws IOException {
        Logger log = Logger.getLogger(Sem2Task1.class.getName());
        FileHandler fh = new FileHandler("Task1_log.txt");
        SimpleFormatter sf = new SimpleFormatter();
        fh.setFormatter(sf);
        log.addHandler(fh);
        int temp;
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        log.info(Arrays.toString(arr));
        }
        return arr;

    }
    public static void main(String[] args) throws IOException {
        Sort(GetArr());
    }
}
