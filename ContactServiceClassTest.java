package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import contactproject.Contact;
import contactproject.ContactService;

class ContactServiceClassTest {
	
	
	@Test
	public void testUniqueIds() {
		ContactService contactServiceClass = new ContactService();
		contactServiceClass.addContact("John", "Doe", "1112223333", "101 test st");
		contactServiceClass.addContact("Jane", "Foster", "5556667777", "203 New Test Ln");
		
		// The first two unique IDs should be 0 and 1 based on the creation of Contact objects
		// Checks to make sure they are not null.
		Contact testContact1 = contactServiceClass.getContact("0");
		Contact testContact2 = contactServiceClass.getContact("1");
		
		assertNotNull(testContact1);
		assertNotNull(testContact2);
	}
	
	
	@Test
	void testRemoveContact() {
		ContactService testRemoveContactMethod = new ContactService();
		testRemoveContactMethod.addContact("John", "Doe", "1112223333", "101 test st");
		testRemoveContactMethod.addContact("Jane", "Foster", "5556667777", "203 New Test Ln");

		assertNotNull(testRemoveContactMethod.getContact("0"));
		testRemoveContactMethod.deleteContact("0");
		assertNull(testRemoveContactMethod.getContact("0"));
		
	}
	
	@Test
	void testUpdateFirstName() {
		ContactService testUpdateFirstName = new ContactService();
		testUpdateFirstName.addContact("John", "Doe", "1112223333", "101 test st");
		
		testUpdateFirstName.setFirstName("0", "Bill");
		assertTrue(testUpdateFirstName.getContact("0").getFirstName().equals("Bill"));
	}
	
	@Test
	void testUpdateLastName() {
		ContactService testUpdateLastName = new ContactService();
		testUpdateLastName.addContact("John", "Doe", "1112223333", "101 test st");
		
		testUpdateLastName.setLastName("0", "Bill");
		assertTrue(testUpdateLastName.getContact("0").getLastName().equals("Bill"));
	}
	
	@Test
	void testUpdateNumber() {
		ContactService testUpdateNumber = new ContactService();
		testUpdateNumber.addContact("John", "Doe", "1112223333", "101 test st");
		
		testUpdateNumber.setNumber("0", "5556667777");
		assertTrue(testUpdateNumber.getContact("0").getNumber().equals("5556667777"));
	}
	
	@Test
	void testUpdateAddress() {
		ContactService testUpdateAddress = new ContactService();
		testUpdateAddress.addContact("John", "Doe", "1112223333", "101 test st");
		
		testUpdateAddress.setAddress("0", "203 New St");
		assertTrue(testUpdateAddress.getContact("0").getAddress().equals("203 New St"));
	}
}


