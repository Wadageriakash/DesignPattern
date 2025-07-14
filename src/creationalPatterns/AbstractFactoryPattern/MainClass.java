package creationalPatterns.AbstractFactoryPattern;

public class MainClass {

	public static void main(String[] args) {
		AbstractFactoryProducer abstractFactoryProducer= new AbstractFactoryProducer();
		AbstractFactory abstractFactory= abstractFactoryProducer.getFactoryInstance("Premium");
		Car carObj = abstractFactory.getInstance(5000000);
		System.out.println(carObj.getTopSpeed()); // 300
	}
}
