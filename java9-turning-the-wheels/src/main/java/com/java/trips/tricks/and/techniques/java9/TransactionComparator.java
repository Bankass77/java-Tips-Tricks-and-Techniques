package com.java.trips.tricks.and.techniques.java9;

import java.util.Comparator;

public class TransactionComparator implements Comparator<Transaction> {

    @Override
    public int compare(Transaction transaction, Transaction t1) {
        return transaction.getTransactionId().compareTo(t1.getTransactionId());
    }
}
