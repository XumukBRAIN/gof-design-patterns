package com.dev.gofdesignpatterns.behavioral.strategy;

public class SortRunner {
    public static void main(String[] args) {
        int[] array = {5, 3, 8, 6, 2};

        Sorter sorter = new Sorter(new BubbleSort());
        sorter.sortArray(array);

        // Вывод отсортированного массива
        System.out.print("Отсортированный массив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }

        System.out.println();

        // Изменяем стратегию на сортировку выбором
        sorter.setStrategy(new SelectionSort());

        int[] anotherArray = {7, 2, 9, 4, 1};
        sorter.sortArray(anotherArray);

        // Вывод отсортированного массива
        System.out.print("Отсортированный массив: ");
        for (int num : anotherArray) {
            System.out.print(num + " ");
        }
    }
}
