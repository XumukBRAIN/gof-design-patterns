package com.dev.gofdesignpatterns.behavioral.strategy;

import lombok.Setter;

@Setter
public class Sorter {

    private SortingStrategy strategy;

    public Sorter(SortingStrategy strategy) {
        this.strategy = strategy;
    }

    public void sortArray(int[] array) {
        strategy.sort(array);
    }

}

