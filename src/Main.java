import java.util.*;

public class Main {

    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        System.out.println();
        task4();
        System.out.println();
    }

    public static void task1() {
        System.out.println("Задача №1:");
        System.out.println("Вывод нечетных чисел в консоль: ");

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (Integer num : nums) {
            if (num % 2 == 1) {
                System.out.print(num + "; ");

            }
        }
    }

    public static void task2() {
        System.out.println("Задача №2:");
        System.out.println("Вывод четных чисел без повторений в консоль: ");

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 55, 50, 60, 5, 6, 7));
        Set<Integer> set = new HashSet<>(nums);
        for (Integer num : set) {
            if (num % 2 == 0) {
                System.out.print(num + "; ");

            }
        }
    }

    public static void task3() {
        System.out.println("Задача №3:");
        System.out.println("Вывод в консоль все уникальные слова из списка слов: ");

        List<String> nums = new ArrayList<>(Arrays.asList("дуб", "ясень", "дуб", "береза"));
        Set<String> set = new HashSet<>(nums);

        System.out.print(set + "; ");

    }

    public static void task4() {
        System.out.println("Задача №4:");
        System.out.println("Вывод в консоль количества дублей уникальных слов: ");

        List<String> texts = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        Map<String, Integer> map = new HashMap<>();
        for (String text : texts) {
            if (map.containsKey(text)) {
                Integer count = map.get(text) + 1;
                map.put(text, count);
            } else {
                map.put(text, 1);
            }
        }

        System.out.println(map.values());
    }

}







