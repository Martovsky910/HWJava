package Sem4;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Task2Sem4 {
    public static void main(String[] args) {
        LinkedList<Integer> reslist = new LinkedList<>();
        RandomList(10, 50, reslist);
        System.out.println(reslist);


        enqueue(reslist, 0);
        System.out.println(reslist);

        System.out.println(dequeue(reslist));
        System.out.println(reslist);

        System.out.println(first(reslist));

        
    }

    public static void Operation(int oper, int value, LinkedList<Integer> reslist){
        switch(oper){
            case 1:
                enqueue(reslist);
                System.out.println(reslist);

            case 2:


        }
    }

    public static void enqueue(LinkedList<Integer> reslist) {
        System.out.println("Введите элемент, который надо добавить: ");
        Scanner sc = new Scanner(System.in);
        Object element = sc.nextInt();
        reslist.addLast(element);
    }

    public static int dequeue(LinkedList<Integer> reslist) {
        return reslist.removeFirst();
    }

    public static int first(LinkedList<Integer> reslist) {
        return reslist.getFirst();
    }

    public static void RandomList(int size, int uprange, LinkedList<Integer> reslist) {
        Random rand = new Random();
        for(int i = 0; i < size; i++){
            reslist.add(rand.nextInt(uprange));
        }
    }
}