package ru.mirea;

import java.util.Scanner;


public class App {
  private static final Scanner IN = new Scanner(System.in);

  public static void main(String[] args) {
    int length;

    do {
      System.out.print("Введите количество элементов: ");

      while (!IN.hasNextInt()) {
        System.out.println("Нужно ввести целое число!");
        System.out.print("Введите количество элементов: ");
        IN.next();
      }

      length = IN.nextInt();
    }
    while (length <= 0);

    System.out.println("length = " + length);
  }
}
