package com.sridhar.patterns.chain;

public interface TransactionHandler {
	
	void doTransactionAction(BankTransaction bankTransaction);
	void setNextTransactionHandler(TransactionHandler nextTransactionHandler);

}
