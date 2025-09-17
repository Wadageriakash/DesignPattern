package creationalPatterns.SingletonPattern_EagerInitialization;

public class DBConnection {

	// Step 1: Create the object immediately (eagerly)
	private static DBConnection connectionObj = new DBConnection();
	
	 // Step 2: Make constructor private so no one else can create new objects
	private DBConnection() {
		
	}
	
	// Step 3: Provide a method to give the already created object
	public static DBConnection getInstance() {
		return connectionObj;
	}
	
}
