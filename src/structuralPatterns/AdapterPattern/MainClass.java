package structuralPatterns.AdapterPattern;

// Step 4: Client Code (uses PaymentProcessor)
public class MainClass {

	public static void main(String [] args) {
		// Without Adapter → not possible (interfaces don’t match)

        // With Adapter
        PayPalGateway payPalGateway = new PayPalGateway();
        PaymentProcessor processor = new PayPalAdapter(payPalGateway);

        processor.pay(100);  // ✅ Works through adapter
	}
}
