package com.dev.gofdesignpatterns.behavioral.chain_of_responsibility;

public interface LoanHandler {

    void setNext(LoanHandler nextHandler);

    void handleRequest(LoanRequest request);

}
