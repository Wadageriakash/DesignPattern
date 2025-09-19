package structuralPatterns.AdapterPattern;

//Step 2: Existing Incompatible Class (PayPal API simulation)
public class PayPalGateway {

	public void sendPayment(int money) {
		 System.out.println("Payment of $" + money + " processed via PayPal.");
	}
}
