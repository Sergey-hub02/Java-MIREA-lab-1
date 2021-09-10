package ru.mirea;

import java.util.Random;
import java.util.Scanner;


public class App {
  private static final Random ENG = new Random();
  private static final Scanner IN = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.print("Введите количество элементов: ");
    int length = IN.nextInt();

    System.out.print("Введите наименьший элемент массива: ");
    int min = IN.nextInt();

    System.out.print("Введите наибольший элемент массива: ");
    int max = IN.nextInt();

    int[] array = new int[length];

    fillArray(array, min, max);

    System.out.println();
    System.out.println("Массив: " + arrayToString(array));
    
    System.out.println();
    System.out.println("Сумма с использованием цикла for: " + sumFor(array));
    System.out.println("Сумма с использованием цикла while: " + sumWhile(array));
    System.out.println("Сумма с использованием цикла do-while: " + sumDoWhile(array));
  }

  /**
   * Суммирует элементы массива с помощью цикла for
   * @param array       массив, элементы которого будут суммироваться
   * @return            сумма элементов массива
   */
  private static int sumFor(int[] array) {
    int sum = 0;

    for (int i = 0; i < array.length; ++i) {
      sum += array[i];
    }

    return sum;
  }

  /**
   * Суммирует элементы массива с помощью цикла while
   * @param array       массив, элементы которого будут суммироваться
   * @return            сумма элементов массива
   */
  private static int sumWhile(int[] array) {
    int i = 0;
    int sum = 0;

    while (i < array.length) {
      sum += array[i++];
    }

    return sum;
  }

  /**
   * Суммирует элементы массива с помощью цикла do-while
   * @param array       массив, элементы которого будут суммироваться
   * @return            сумма элементов массива
   */
   private static int sumDoWhile(int[] array) {
     int i = 0;
     int sum = 0;

     do {
       sum += array[i++];
     }
     while (i < array.length);

     return sum;
   }

  /**
   * Возвращает строковое представление массива из целых чисел
   * @param array         массив из целых чисел
   * @return              строка вида [эл1, эл2, ..., элN]
   */
  private static String arrayToString(int[] array) {
    StringBuilder strArray = new StringBuilder("[");

    strArray.append(array[0]);
    for (int i = 1; i < array.length; ++i) {
      strArray.append(", " + array[i]);
    }
    strArray.append("]");

    return strArray.toString();
  }

  /**
   * Наполняет массив случайными числами в заданном диапазоне чисел
   * @param array         заполняемый массив
   * @param min           наименьшее генерируемое значение
   * @param max           наибольшее генерируемое значение
   */
  private static void fillArray(int[] array, int min, int max) {
    for (int i = 0; i < array.length; ++i) {
      array[i] = ENG.nextInt(max - min) + min;
    }
  }
}
