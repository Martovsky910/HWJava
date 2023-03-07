import java.util.ArrayList;
import java.util.List;
public class Task2 {

    public static void main(String[] args) {
        int num = 1000;

        List<Integer> primes = new ArrayList<>();

        for (int i = 2; i <= num; i++) {
            boolean PrimeNumber = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    PrimeNumber = false;
                    break;
                }
            }
            if (PrimeNumber) {
                primes.add(i);
            }
        }
        System.out.println("Простые числа: " + primes);
    }
}