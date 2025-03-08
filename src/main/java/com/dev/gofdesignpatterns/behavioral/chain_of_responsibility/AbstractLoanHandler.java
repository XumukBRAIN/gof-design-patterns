package com.dev.gofdesignpatterns.behavioral.chain_of_responsibility;

public abstract class AbstractLoanHandler implements LoanHandler {

    protected LoanHandler nextHandler;

    @Override
    public void setNext(LoanHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

}
