import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main7 {
    public static void main(String[] args) {
        List<Integer> numbers = IntStream.range(0, 100) // Создаем поток чисел от 0 до 99
                .boxed() // Преобразуем IntStream в Stream<Integer>
                .collect(Collectors.toList()); // Собираем в список

        numbers.stream()
                .limit(10) // Ограничиваем поток первыми 10 элементами
                .forEach(System.out::println); // Выводим каждое число
    }
}