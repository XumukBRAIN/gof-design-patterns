package com.dev.gofdesignpatterns.behavioral.interpretator;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Number implements Expression {

    private final int value;

    @Override
    public int interpret() {
        return value;
    }

}

