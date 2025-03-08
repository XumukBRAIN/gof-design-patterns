package com.dev.gofdesignpatterns.behavioral.strategy;

public class SelectionSort implements SortingStrategy {

    @Override
    public void sort(int[] array) {
        System.out.println("Сортировка выбором:");
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Меняем местами
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

}
