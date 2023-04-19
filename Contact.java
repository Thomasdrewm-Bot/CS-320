package contactproject;

public class Contact {
	
	private String contactId;
	private String firstName;
	private String lastName;
	private String number;
	private String address;
	
	public Contact(String firstName, String lastName, String number, String address, String contactId){
		
		// Tests if each passed variable is valid.
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid first name");
		}
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid last name");
		}
		if (number == null || number.length() != 10) {
			throw new IllegalArgumentException("Invalid number");
		}
		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid address");
		}
		if (contactId == null || contactId.length() > 10) {
			throw new IllegalArgumentException("Invalid contactId");
		}
		
		// Assigns valid variables.
		this.firstName = firstName;
		this.lastName = lastName;
		this.number = number;
		this.address = address;
		this.contactId = contactId;
	}

	// Mutator methods
	public void setFirstName(String firstName){
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid first name");
		}
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid last name");
		}
		
		this.lastName = lastName;
	}
	
	public void setNumber(String number) {
		if (number == null || number.length() != 10) {
			throw new IllegalArgumentException("Invalid number");
		}
		
		this.number = number;
	}
	
	public void setAddress(String address) {
		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid address");
		}
		
		this.address = address;
	}
	
	// Accessor Methods
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getNumber() {
		return number;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getId() {
		return contactId;
	}

}
