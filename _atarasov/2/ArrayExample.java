/**
 * Пример работы с массивом, используя цикл for.
 * Выводит числа от 1 до 10 с их номером в массиве.
 */
public class ArrayExample {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        for (int i = 0; i < array.length; i++) {
            System.out.println("Элемент с номером " + i + " равен " + array[i]);
        }
    }
}
