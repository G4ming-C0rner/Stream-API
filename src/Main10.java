import java.util.stream.IntStream;

public class Main10 {
    public static void main(String[] args) {
        IntStream.rangeClosed(0, 100) // Создаем поток чисел от 0 до 100 включительно
                .filter(n -> n % 2 != 0) // Фильтруем нечетные числа
                .forEach(System.out::println); // Выводим каждое нечетное число
    }
}