import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static <Set> void main(String[] args) {
        System.out.println("Задание №1");

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));

        for (int num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
        System.out.println("Задание №2");
        Collections.sort(nums);

        int prevNum = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num % 2 == 0 && num != prevNum) {
                System.out.println(num);
                prevNum = num;
            }
        }


        System.out.println("Задание №4");

        List<String> words = Arrays.asList("один", "два", "два", "три", "three", "три");
        Map<String, Integer> wordCounts = new HashMap<>();
        for (String word : words) {
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }
        System.out.println("Слово: Количество:");
        wordCounts.entrySet().forEach(entry -> System.out.printf("%s: %d%n", entry.getKey(), entry.getValue()));
    }
}