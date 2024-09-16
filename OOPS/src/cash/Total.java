package cash;

public class Total {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreditCard a = new CreditCard(10000, "Raghavendra", "1/12", 1564784152);
		CashPayment b = new CashPayment(20000);
		Payment p = new Payment(2000);
		a.paymentDetails();
		b.paymentDetails();
		p.paymentDetails();
	}

}
