
public class BankAccount implements PaymentMethod{
int accountNumber;
public BankAccount(int accountNumber)
{
	this.accountNumber = accountNumber;
}
public boolean charge(double amount)
{
	return true;
}
public boolean refund(double amount)
{
	return true;
}
}
