import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> inputList = arrInit();
        if (inputList != null) {
            Map<Integer, Long> result = countElements(inputList);
            System.out.println("Результат: " + result);
        }
    }

    private static Map<Integer, Long> countElements(List<Integer> list) {
        return list.stream()
                .collect(Collectors.groupingBy(
                        e -> e,
                        Collectors.counting()
                ));
    }

    private static List<Integer> arrInit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Java");
        System.out.println("Введите значения через пробел:");
        try {
            return Arrays.stream(scanner.nextLine().split(" "))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
        } catch (NumberFormatException e) {
            System.out.println("Ошибка ввода! Проверьте корректность чисел");
            return null;
        }
    }
}