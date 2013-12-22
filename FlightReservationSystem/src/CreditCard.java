
public class CreditCard implements PaymentMethod{
	int cardNumber;
	int ccv;
	public CreditCard(int cardNumber, int ccv) {
		this.cardNumber = cardNumber;
		this.ccv = ccv;
	}
	public boolean charge(double amount)
	{
		System.out.println("credit card charging: " + amount);
		return true;
	}
	public boolean refund(double amount)
	{
		return true;
	}

}
