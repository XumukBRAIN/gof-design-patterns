package com.dev.gofdesignpatterns.behavioral.chain_of_responsibility;

public class LoanRunner {

    public static void main(String[] args) {
        // Создаем цепочку обработчиков
        LoanHandler creditCheck = new CreditHistoryCheck();
        LoanHandler incomeCheck = new IncomeCheck();
        LoanHandler finalApproval = new FinalApproval();

        // Настраиваем цепочку: кредитная история → доход → финальное одобрение
        creditCheck.setNext(incomeCheck);
        incomeCheck.setNext(finalApproval);

        // Создаем запрос
        LoanRequest request = new LoanRequest(10000, 650, 35000);

        // Запускаем обработку
        creditCheck.handleRequest(request);
    }

}
