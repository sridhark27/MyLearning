package com.sridhar.patterns.chain;

public class MainClass {

	public static void main(String[] args) {
		TransactionHandler t1 = new AccountNumberValidation();
		TransactionHandler t2 = new TransactionAmountValidation();
		TransactionHandler t3 = new MinBalanceAccountVariantValidation();
		TransactionHandler t4 = new FreeTransactionLimitValidation();
		
		t1.setNextTransactionHandler(t2);
		t2.setNextTransactionHandler(t3);
		t3.setNextTransactionHandler(t4);
		//Assume t4 is the last handler in the chain
		
		BankTransaction bankTransaction = new BankTransaction("1005IOB478", "45587AXIS5699", 1200L);
		
		t1.doTransactionAction(bankTransaction);

	}

}
