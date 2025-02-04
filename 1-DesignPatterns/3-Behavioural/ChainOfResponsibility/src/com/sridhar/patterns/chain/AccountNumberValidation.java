package com.sridhar.patterns.chain;

public class AccountNumberValidation implements TransactionHandler {
	
	TransactionHandler nextTransactionHandler;

	@Override
	public void doTransactionAction(BankTransaction bankTransaction) {
		/* Here, we can validate account number of transaction by checking DB, API call */
		System.out.println("Account number validation");
		this.nextTransactionHandler.doTransactionAction(bankTransaction);

	}

	@Override
	public void setNextTransactionHandler(TransactionHandler nextTransactionHandler) {
		this.nextTransactionHandler = nextTransactionHandler;

	}

}
