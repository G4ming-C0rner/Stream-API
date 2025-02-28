import java.util.stream.IntStream;

public class Main4 {
    public static void main(String[] args) {
        IntStream.iterate(1, n -> n + 2) // Начинаем с 1 и увеличиваем на 2
                .takeWhile(n -> n <= 50) // Ограничиваем диапазон до 50
                .forEach(System.out::println); // Выводим каждое число
    }
}