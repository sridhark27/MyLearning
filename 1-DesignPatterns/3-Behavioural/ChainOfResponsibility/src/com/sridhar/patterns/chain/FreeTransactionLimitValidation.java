package com.sridhar.patterns.chain;

public class FreeTransactionLimitValidation implements TransactionHandler {
	
	TransactionHandler nextTransactionHandler;

	@Override
	public void doTransactionAction(BankTransaction bankTransaction) {
		/*Each account has daily free limit of NEFT, IMPS, RTGS
		 * Check whether it is free or transaction fees*/
		
		System.out.println("Free Transaction limit validation");
		

	}

	@Override
	public void setNextTransactionHandler(TransactionHandler nextTransactionHandler) {
		this.nextTransactionHandler = nextTransactionHandler;

	}

}
