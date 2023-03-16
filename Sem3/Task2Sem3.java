package Sem3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Task2Sem3 {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random ran = new Random();

        for (int i = 0; i < 15; i++) {
            int x = ran.nextInt(15);
            list.add(x);
        }
        System.out.println(list.toString());

        for(int i = 0; i < list.size(); i++){
            if(list.get(i) % 2 == 0){
                list.remove(i);
                i--;
            }
        }
        System.out.println(list.toString());
    }

}