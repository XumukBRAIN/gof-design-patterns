package com.dev.gofdesignpatterns.behavioral.chain_of_responsibility;

public class CreditHistoryCheck extends AbstractLoanHandler {

    private static final Integer MINIMAL_CREDIT_SCORE = 600;

    @Override
    public void handleRequest(LoanRequest request) {
        if (request.getCreditScore() >= MINIMAL_CREDIT_SCORE) {
            System.out.println("Кредитная история одобрена!");
            if (nextHandler != null) {
                nextHandler.handleRequest(request);
            }
        } else {
            System.out.println("Кредитная история не прошла проверку. Заявка отклонена.");
        }
    }

}
