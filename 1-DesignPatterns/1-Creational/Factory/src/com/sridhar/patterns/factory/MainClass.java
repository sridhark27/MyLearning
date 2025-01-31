package com.sridhar.patterns.factory;

public class MainClass {

	public static void main(String[] args) {
		
		PaymentClient payment;
		UPI upi;
		
		UPIFactory gPayFactory = new GpayFactory();
		payment = new PaymentClient(gPayFactory);
		upi= payment.getUpi();
		upi.transfer();
		
		UPIFactory phonePeFactory = new PhonePeFactory();
		payment = new PaymentClient(phonePeFactory);
		upi= payment.getUpi();
		upi.transfer();
		
		UPIFactory bhimFactory = new BHIMFactory();
		payment = new PaymentClient(bhimFactory);
		upi= payment.getUpi();
		upi.transfer();

	}

}
