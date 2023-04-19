package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import contactproject.Contact;
import contactproject.Task;

class ContactClassTest {

	@Test
	void testContactClassVariables() {
		Contact contactClass = new Contact("Name", "Last Name", "5556667777", "101 test st", "1");
		assertTrue(contactClass.getFirstName().equals("Name"));
		assertTrue(contactClass.getLastName().equals("Last Name"));
		assertTrue(contactClass.getNumber().equals("5556667777"));
		assertTrue(contactClass.getAddress().equals("101 test st"));
		assertTrue(contactClass.getId().equals("1"));
	}
	
	@Test
	void testFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			new Contact("Thisnametoolong", "Last Name", "5556667777", "101 test st", "1");
		});
	}
	
	@Test
	void testLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			new Contact("Name", "Thisnametoolong", "5556667777", "101 test st", "1");
		});
	}
	
	@Test
	void testNumberTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			new Contact("Name", "Last Name", "55566677778888", "101 test st", "1");
		});
	}
	
	@Test
	void testNumberTooShort() {
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			new Contact("Name", "Last Name", "555666", "101 test st", "1");
		});
	}
	
	@Test
	void testAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			new Contact("Name", "Last Name", "5556667777", "This street address is going to be too long", "1");
		});
	}
	
	@Test
	void testIdTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			new Contact("Name", "Last Name", "5556667777", "101 test st", "12345678901");
		});
	}
	
	@Test
	void testFirstNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			new Contact(null, "Last Name", "5556667777", "101 test st", "1");
		});
	}
	
	@Test
	void testLastNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			new Contact("Name", null, "5556667777", "101 test st", "1");
		});
	}
	
	@Test
	void testNumberIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			new Contact("Name", "Last Name", null, "101 test st", "1");
		});
	}
	
	@Test
	void testAddressIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			new Contact("Name", "Last Name", "5556667777", null, "1");
		});
	}
	
	@Test
	void testIdIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			new Contact("Name", "Last Name", "5556667777", "101 test st", null);
		});
	}
	
	@Test
	void testSetMethods() {
		Contact testContMethods = new Contact ("first", "last", "1234567890", "the address", "1");
		
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			testContMethods.setFirstName("This name too long for this test to be true");
		});
		
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			testContMethods.setFirstName(null);
		});
		
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			testContMethods.setLastName("This name too long for this test to be true");
		});
		
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			testContMethods.setLastName(null);
		});
		
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			testContMethods.setNumber("12345678910");
		});
		
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			testContMethods.setNumber(null);
		});
		
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			testContMethods.setAddress("This address is way to unnecessarily long");
		});
		
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			testContMethods.setAddress(null);
		});
		
		testContMethods.setFirstName("NewName");
		testContMethods.setLastName("NewNew");
		testContMethods.setNumber("9876543210");
		testContMethods.setAddress("New address");
		
		assertTrue(testContMethods.getFirstName().equals("NewName"));
		assertTrue(testContMethods.getLastName().equals("NewNew"));
		assertTrue(testContMethods.getNumber().equals("9876543210"));
		assertTrue(testContMethods.getAddress().equals("New address"));
		
	}

}

