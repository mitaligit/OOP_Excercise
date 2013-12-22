
public interface PaymentMethod {
public boolean charge(double amount);
public boolean refund(double amount);
}
