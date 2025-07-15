package creationalPatterns.BuilderPattern;

//StudentBuilder.java
public class StudentBuilder {
 // Required parameters - these will be typically set in the builder's constructor
 String firstName;
 String lastName;
 int studentId;
 String major;
 double gpa;

 // Optional parameters - these will be set via fluent methods
 String address = null;
 String phone = null;
 String email = null;

 // Constructor for mandatory fields.
 // This ensures that these essential pieces of information are provided upfront.
 public StudentBuilder(String firstName, String lastName, int studentId, String major, double gpa) {
     this.firstName = firstName;
     this.lastName = lastName;
     this.studentId = studentId;
     this.major = major;
     this.gpa = gpa;
 }

 // Methods to set optional parameters.
 // They return 'this' (the current StudentBuilder instance) to allow method chaining.
 public StudentBuilder withAddress(String address) {
     this.address = address;
     return this;
 }

 public StudentBuilder withPhone(String phone) {
     this.phone = phone;
     return this;
 }

 public StudentBuilder withEmail(String email) {
     this.email = email;
     return this;
 }

 // The build method, which creates the Student object.
 // It also contains validation logic.
 public Student build() {
     // Validation logic can be placed here.
     // This ensures that the Student object is created only if its state is valid.
     if (studentId <= 0) {
         throw new IllegalArgumentException("Student ID must be positive.");
     }
     if (gpa < 0.0 || gpa > 4.0) {
         throw new IllegalArgumentException("GPA must be between 0.0 and 4.0.");
     }
     // Add any other specific validation rules here
     // e.g., if (firstName.isEmpty() || lastName.isEmpty()) throw new ...

     // Create and return the Student object, passing 'this' (the builder instance)
     // to the Student's package-private constructor.
     return new Student(this);
 }
}