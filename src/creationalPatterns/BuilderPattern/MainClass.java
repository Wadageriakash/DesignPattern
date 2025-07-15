package creationalPatterns.BuilderPattern;

public class MainClass {
	public static void main(String[] args) {
        // Building a student with only mandatory fields
        Student student1 = new StudentBuilder("Alice", "Smith", 1001, "Computer Science", 3.8)
                                     .build();
        System.out.println("Student 1: " + student1);

        // Building a student with some optional fields
        Student student2 = new StudentBuilder("Bob", "Johnson", 1002, "Mathematics", 3.5)
                                     .withAddress("123 Main St, Anytown")
                                     .withPhone("555-1234")
                                     .build();
        System.out.println("Student 2: " + student2);

        // Building a student with all fields
        Student student3 = new StudentBuilder("Charlie", "Brown", 1003, "Physics", 3.9)
                                     .withAddress("456 Oak Ave, Otherville")
                                     .withPhone("555-5678")
                                     .withEmail("charlie.brown@example.com")
                                     .build();
        System.out.println("Student 3: " + student3);

        // Example of validation failure
        try {
            Student studentInvalidGpa = new StudentBuilder("Invalid", "Student", 1004, "Art", 5.0)
                                                    .build();
            System.out.println(studentInvalidGpa);
        } catch (IllegalArgumentException e) {
            System.out.println("Error building student: " + e.getMessage());
        }

        try {
            Student studentInvalidId = new StudentBuilder("Invalid", "ID", 0, "History", 3.0)
                                                    .build();
            System.out.println(studentInvalidId);
        } catch (IllegalArgumentException e) {
            System.out.println("Error building student: " + e.getMessage());
        }
    }
}
