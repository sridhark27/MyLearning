package com.sridhar.patterns.chain;

public class TransactionAmountValidation implements TransactionHandler {
	
	TransactionHandler nextTransactionHandler;

	@Override
	public void doTransactionAction(BankTransaction bankTransaction) {
		/*Transaction value check against balance*/
		System.out.println("Transaction amount validation");
		this.nextTransactionHandler.doTransactionAction(bankTransaction);

	}

	@Override
	public void setNextTransactionHandler(TransactionHandler nextTransactionHandler) {
		this.nextTransactionHandler = nextTransactionHandler;

	}

}
