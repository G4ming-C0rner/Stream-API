import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main5 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5); // Исходный список
        Optional<Integer> firstEven = numbers.stream()
                .filter(n -> n % 2 == 0) // Фильтруем четные числа
                .findFirst(); // Находим первый подходящий элемент

        if (firstEven.isPresent()) {
            System.out.println("Первый четный элемент: " + firstEven.get()); // Выводим результат
        } else {
            System.out.println("Четных элементов нет."); // Если четных элементов нет
        }
    }
}