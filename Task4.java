
/*
 * Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
 * и возвращающий новый массив, каждый элемент которого равен частному элементов
 * двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо
 * как-то оповестить пользователя. Важно: При выполнении метода единственное
 * исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше
 */

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        try {
            int[] arr1 = {2, 4, 6, 8};
            int[] arr2 = {1, 3, 5, 7};
            int[] arr3 = {1, 3, 5, 7, 9};

            System.out.println("Ответ 1: " + Arrays.toString(arrayDifference(arr1, arr2)) + " (Нет исключений!)");
            System.out.println(Arrays.toString(arrayDifference(arr1, arr3)));
        } catch (RuntimeException ex) {
            System.out.println(ex);
        }
    }

    private static float[] arrayDifference(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            throw new RuntimeException("Размеры массивов не равны!");
        }
        float[] temp = new float[array1.length];
        for (int i = 0; i < array1.length; i++) {
            temp[i] = (float) array1[i] / array2[i];
        }
        return temp;
    }
}

