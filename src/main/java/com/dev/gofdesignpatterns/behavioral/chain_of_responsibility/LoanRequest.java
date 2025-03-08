package com.dev.gofdesignpatterns.behavioral.chain_of_responsibility;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class LoanRequest {

    private final double amount;
    private final int creditScore;
    private final double income;

}

