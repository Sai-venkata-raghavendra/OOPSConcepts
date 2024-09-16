package cash;

public class CreditCard extends Payment {
	String name, exdate;
	long creditnumber;

	CreditCard(double amount, String name, String exdate, long credit) {
		super(amount);
		this.exdate = exdate;
		this.name = name;
		creditnumber = credit;
	}

	public void paymentDetails() {
		System.out.println("The cardholder name is" + name + "and the credit card number is:" + creditnumber
				+ "and total amount in account is:" + amount + "and the card will expires on " + exdate);
	}

}
