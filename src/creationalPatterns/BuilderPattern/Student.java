package creationalPatterns.BuilderPattern;

import java.util.Objects;

//Student.java
import java.util.Objects; // For Objects.requireNonNull

public class Student {
	private final String firstName;
	private final String lastName;
	private final int studentId;
	private final String major;
	private final double gpa;
	private final String address;
	private final String phone;
	private final String email;

	// Private constructor to enforce creation only through the Builder
	// This constructor takes a StudentBuilder object to get all field values.
	Student(StudentBuilder builder) {
		this.firstName = Objects.requireNonNull(builder.firstName, "First name cannot be null");
		this.lastName = Objects.requireNonNull(builder.lastName, "Last name cannot be null");
		this.studentId = builder.studentId;
		this.major = builder.major;
		this.gpa = builder.gpa;
		this.address = builder.address;
		this.phone = builder.phone;
		this.email = builder.email;
	}

	// Getters for all fields (making the Student object immutable after creation)
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getStudentId() {
		return studentId;
	}

	public String getMajor() {
		return major;
	}

	public double getGpa() {
		return gpa;
	}

	public String getAddress() {
		return address;
	}

	public String getPhone() {
		return phone;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return "Student{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", studentId="
				+ studentId + ", major='" + major + '\'' + ", gpa=" + gpa
				+ (address != null ? ", address='" + address + '\'' : "")
				+ (phone != null ? ", phone='" + phone + '\'' : "") + (email != null ? ", email='" + email + '\'' : "")
				+ '}';
	}
}