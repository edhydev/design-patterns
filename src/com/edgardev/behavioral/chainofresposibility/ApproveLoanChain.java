package com.edgardev.behavioral.chainofresposibility;

public interface ApproveLoanChain {
    void setNext(ApproveLoanChain loan);

    ApproveLoanChain getNext();

    void creditCardRequest(int totalLoan);
}
