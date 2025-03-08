package com.dev.gofdesignpatterns.behavioral.interpretator;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Subtract implements Expression {

    private final Expression left;
    private final Expression right;

    @Override
    public int interpret() {
        return left.interpret() - right.interpret();
    }

}
