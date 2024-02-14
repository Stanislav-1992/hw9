import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1,3");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        double middlePay = sum / arr.length;
        System.out.println("Сумма трат за месяц составила " + sum + " руб.");
        System.out.println("Средняя сумма трат за месяц составила " + middlePay + " руб.");


        System.out.println("Задача 2");
        int[] arrTwo = generateRandomArray();
        int maxPay = 100_000;
        int minPay = 200_000;
        for (final int payment : arrTwo) {
            if (payment > maxPay) {
                maxPay = payment;
            }
        }
        for (final int paymentTwo : arrTwo) {
            if (paymentTwo < minPay) {
                minPay = paymentTwo;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minPay + " руб. Максимальная сумма трат за день составила " + maxPay + " руб.");


        System.out.println("Задача 4");
        int[] arrThree = generateRandomArray();
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--)
            System.out.print(reverseFullName[i]);
    }
}