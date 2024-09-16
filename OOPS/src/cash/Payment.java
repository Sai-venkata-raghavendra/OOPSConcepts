package cash;

public class Payment {
	double amount;

	Payment(double amount) {
		this.amount = amount;
	}

	public void setPayment(double amount) {
		this.amount = amount;
	}

	public double getPayment() {
		return amount;
	}

	public void paymentDetails() {
		System.out.println("Amount of the payment:" + amount);
	}
}
