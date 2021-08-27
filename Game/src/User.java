import java.time.LocalDate;

public class User {

	private int id;
	private String FirstName;
	private String lastName;
	private LocalDate dateOfBirth;
	private String nationalIdendity;
	
	public User() {
		
	}
	
	public User(int id, String firstName, String lastName, LocalDate dateOfBirth, String nationalIdentity) {
		this.id = id;
		FirstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationalIdendity=nationalIdentity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getNationalIdendity() {
		return nationalIdendity;
	}

	public void setNationalIdendity(String nationalIdendity) {
		this.nationalIdendity = nationalIdendity;
	}
	
}
