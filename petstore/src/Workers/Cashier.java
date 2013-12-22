package Workers;


public class Cashier extends Worker{
public Cashier(String name, int id)
{
	super(name, id);
	d = new CashierDuty();
}

}
