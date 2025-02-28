import java.util.stream.IntStream;

public class Main9 {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 100) // Создаем поток чисел от 1 до 100
                .filter(n -> n % 3 == 0) // Фильтруем числа, делящиеся на 3
                .forEach(System.out::println); // Выводим каждое подходящее число
    }
}