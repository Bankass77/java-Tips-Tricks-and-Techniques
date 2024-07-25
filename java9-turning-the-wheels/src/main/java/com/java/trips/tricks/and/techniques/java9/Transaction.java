package com.java.trips.tricks.and.techniques.java9;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Transaction {

    private String transactionId;

    private double transactionAmount;

}
