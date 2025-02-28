import java.util.stream.IntStream;

public class Main1 {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 100) // Создаем поток чисел от 1 до 100
                .filter(n -> n % 2 == 0) // Фильтруем только четные числа
                .forEach(System.out::println); // Выводим каждое четное число
    }
}
