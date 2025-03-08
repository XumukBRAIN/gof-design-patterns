package com.dev.gofdesignpatterns.behavioral.strategy;

public class BubbleSort implements SortingStrategy {

    @Override
    public void sort(int[] array) {
        System.out.println("Сортировка пузырьком:");
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // Меняем местами
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

}

