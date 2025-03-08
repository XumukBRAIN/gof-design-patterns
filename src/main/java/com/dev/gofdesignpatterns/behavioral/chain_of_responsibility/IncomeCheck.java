package com.dev.gofdesignpatterns.behavioral.chain_of_responsibility;

public class IncomeCheck extends AbstractLoanHandler {

    private static final Integer MINIMAL_INCOME = 30000;

    @Override
    public void handleRequest(LoanRequest request) {
        if (request.getIncome() >= MINIMAL_INCOME) {
            System.out.println("Доход подтвержден!");
            if (nextHandler != null) {
                nextHandler.handleRequest(request);
            }
        } else {
            System.out.println("Недостаточный доход. Заявка отклонена.");
        }
    }

}

