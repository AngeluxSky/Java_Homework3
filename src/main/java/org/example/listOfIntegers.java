package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class listOfIntegers {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(new Random(). nextInt(10));
        }
        System.out.println("Произвольный список целых чисел: " + numbers);

        numbers.removeIf(n -> n % 2 == 0); // Удаление четных чисел

        int min = Integer.MAX_VALUE; // Мин. значение
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        int max = Integer.MIN_VALUE; // Макс. значение
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        int sum = 0; // Среднее значение
        for (int num : numbers) {
            sum += num;
        }
        double average = (double) sum / numbers.size();
        System.out.println("После удаления четных чисел: " + numbers);
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее значение: " + average);
    }
}