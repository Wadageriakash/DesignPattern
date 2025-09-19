package structuralPatterns.FacadePattern;

//Subsystem 1
class Engine {
	void start() {
		System.out.println("Engine started...");
	}
}

//Subsystem 2
class FuelPump {
	void pump() {
		System.out.println("Fuel pumped...");
	}
}

//Subsystem 3
class Starter {
	void ignite() {
		System.out.println("Ignition started...");
	}
}

//Facade Class
class CarFacade {
	private Engine engine;
	private FuelPump fuelPump;
	private Starter starter;

	public CarFacade() {
		this.engine = new Engine();
		this.fuelPump = new FuelPump();
		this.starter = new Starter();
	}

	// Simplified method for user
	public void startCar() {
		fuelPump.pump();
		starter.ignite();
		engine.start();
		System.out.println("Car is ready to go!");
	}
}

//Client
public class FacadePatternDemo {
	public static void main(String[] args) {
		CarFacade car = new CarFacade();
		car.startCar(); // User just calls one method
	}
}