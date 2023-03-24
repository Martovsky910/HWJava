package Sem5;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Sem5Task2 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        String[] arr = {
            "Иван Иванов",
            "Светлана Петрова",
            "Кристина Белова",
            "Анна Мусина",
            "Анна Крутова",
            "Иван Юрин",
            "Петр Лыков",
            "Павел Чернов",
            "Петр Чернышов",
            "Мария Федорова",
            "Марина Светлова",
            "Мария Савина",
            "Мария Рыкова",
            "Марина Лугова",
            "Анна Владимирова",
            "Иван Мечников",
            "Петр Петин",
            "Иван Ежов"
        };

        for (String item: arr) {
            String name = item.split(" ")[0];

            if (map.containsKey(name)) {
                map.replace(name, map.get(name) + 1);
            }
            else map.put(name, 1);
        }

        Map<String, Integer> sortMap = SortName(map);

        System.out.println("Список имен:\n" + map);
        System.out.println("Отсортированные имена: \n" + sortMap);
    }

    public static Map<String, Integer> SortName(Map<String, Integer> map) {
        Map<String, Integer> SortName = new LinkedHashMap<>();
        int value = 1;

        for (int item: map.values())
            if (item > value) value = item;

        for (int i = value; i > 0; i--) {
            for (var item: map.entrySet())
                if (map.get(item.getKey()) == i)
                    SortName.put(item.getKey(), item.getValue());
        }
        return SortName;
    }
}