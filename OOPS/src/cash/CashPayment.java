package cash;

public class CashPayment extends Payment {

	CashPayment(double amount) {
		super(amount);
	}

	public void paymentDetails() {
		System.out.println("Total cash is" + amount);
	}
}
