import java.util.Arrays;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5); // Исходный массив
        int sum = numbers.stream()
                .reduce(0, (a, b) -> a + b); // Считаем сумму чисел
        System.out.println("Сумма: " + sum); // Выводим результат
    }
}