package com.dev.gofdesignpatterns.behavioral.chain_of_responsibility;

public class FinalApproval extends AbstractLoanHandler {

    @Override
    public void handleRequest(LoanRequest request) {
        System.out.println("Заявка одобрена! Сумма кредита: $" + request.getAmount());
    }

}

