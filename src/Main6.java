import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main6 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(9, 3, 5, 1, 7); // Исходный массив
        List<Integer> sortedNumbers = numbers.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Отсортированный массив: " + sortedNumbers);
    }
}