package structuralPatterns.AdapterPattern;

// Step 3: Adapter (makes PayPal fit into PaymentProcessor)
public class PayPalAdapter implements PaymentProcessor {

	 private PayPalGateway payPalGateway;
	 
	 public PayPalAdapter(PayPalGateway payPalGateway) {
	        this.payPalGateway = payPalGateway;
	    }

	@Override
	public void pay(int amount) {
		
		payPalGateway.sendPayment(amount); // adapts method
	}

}
