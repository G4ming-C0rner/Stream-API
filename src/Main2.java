import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5); // Исходный массив
        List<Integer> multipliedNumbers = numbers.stream()
                .map(n -> n * 2) // Умножаем каждое число на 2
                .collect(Collectors.toList()); // Собираем в список
        System.out.println(multipliedNumbers); // Выводим результат
    }
}