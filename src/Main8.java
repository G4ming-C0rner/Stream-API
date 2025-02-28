import java.util.stream.IntStream;

public class Main8 {
    public static void main(String[] args) {
        IntStream.range(0, 100) // Создаем поток чисел от 0 до 99
                .skip(11) // Пропускаем первые 11 элементов (0–10)
                .filter(n -> (n - 11) % 10 == 0) // Выбираем каждое 10-е число, начиная с 11
                .forEach(System.out::println); // Выводим результат
    }
}