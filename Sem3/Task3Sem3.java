import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Task3Sem3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random ran = new Random();

        for (int i = 0; i < 15; i++) {
            int x = ran.nextInt(15);
            list.add(x);
        }
        System.out.println(list.toString());
        System.out.println(max(list));
        System.out.println(min(list));
        System.out.println(Avg(list));
    }

    public static int max(ArrayList<Integer> list) {
        int maxValue = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > maxValue) {
                maxValue = list.get(i);
            }
        }
        return maxValue;
    }

    public static int min(ArrayList<Integer> list) {
        int minValue = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < minValue) {
                minValue = list.get(i);
            }
        }
        return minValue;
    }

    public static double Avg(ArrayList<Integer> list) {
        double avg = 0;

        for (Integer value: list) {
            avg += value.doubleValue();
        }

        avg /= list.size();

        return avg;
    }
}