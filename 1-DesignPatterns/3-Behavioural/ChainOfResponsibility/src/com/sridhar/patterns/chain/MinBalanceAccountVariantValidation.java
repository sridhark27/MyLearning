package com.sridhar.patterns.chain;

public class MinBalanceAccountVariantValidation implements TransactionHandler {
	
	TransactionHandler nextTransactionHandler;

	@Override
	public void doTransactionAction(BankTransaction bankTransaction) {
		/*Calculate new balance within minimum balance of Account variant
		 * e.g. Gold, Silver, Platinum accounts balance*/
		System.out.println("Minimum balance for the from account variant validation");
		this.nextTransactionHandler.doTransactionAction(bankTransaction);

	}

	@Override
	public void setNextTransactionHandler(TransactionHandler nextTransactionHandler) {
		this.nextTransactionHandler = nextTransactionHandler;

	}

}
