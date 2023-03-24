package Sem5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Sem5Task1 {
    public static void main(String[] args) {
        Map<String, List<String>> Phonebook = new HashMap<>();
        Phonebook.put("Lera", List.of("1111", "111222"));
        Phonebook.put("Andrei", List.of("555333", "2222555"));
        Phonebook.put("Ekaterina", List.of("3333", "3333111"));
        Phonebook.put("Dima", List.of("4444", "42222"));


        System.out.println(" 1 = Добавить номер\n 2 = Показать все контакты\n 3 - Выход");
        Scanner sc = new Scanner(System.in);
        while (true) {
            String cmd = sc.nextLine();
                switch (cmd) {
                    case "1":
                        add(Phonebook);
                        System.out.println(" 1 = Добавить номер\n 2 = Показать все контакты\n 3 - Выход");
                        break;
                    case "2":
                        ShowPB(Phonebook);
                        break;
                    case "3":
                        return;
            }
        }

    }

    public static void GetName(Map<String, List<String>> Phonebook) {
        System.out.println("Введите имя: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(Phonebook.get(name));
    }

    public static void ShowPB(Map<String, List<String>> Phonebook) {
        System.out.println(Phonebook);
        
    }

    public static Map<String, List<String>> add(Map<String, List<String>> Phonebook) {
        System.out.println("Введите имя: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        List<String> numbersList = new ArrayList<>();
        while (true) {
            System.out.println("Введите номер: ");
            String number = sc.nextLine();
            System.out.println("Когда введете номер, напишите команду: Ok");
            if (number.equals("Ok")) {
                break;
            } else {
                numbersList.add(number);
            }
        }
        Phonebook.put(name, numbersList);

        return Phonebook;
    }
}