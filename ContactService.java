package contactproject;

import java.util.HashMap;

public class ContactService {
	private int count = 0;
	private HashMap<String, Contact> contactList;

	public ContactService(){
		// Creates the hashMap to store the contact objects upon creation.
		contactList = new HashMap<String, Contact>();
	}
	
	// Creates contact and adds it to the list.
	public void addContact(String firstName, String lastName, String number, String address) {
		// creates a unique ID based on count and increments count.
		String contactId = "" + count++;
		
		Contact contact = new Contact(firstName, lastName, number, address, contactId);
		
		if (contact != null) {
			contactList.put(contact.getId(), contact);
		}
	}
	
	// Returns Contact object based on contactId
	public Contact getContact(String contactIdKey) {
		Contact current = contactList.get(contactIdKey);
		return current;
	}
	
	// Deletes the contact based on the contactId
	public void deleteContact(String contactIdKey) {
		contactList.remove(contactIdKey);
	}
	
	// Used to update the various values of a contact based on the contactId
	public void setFirstName(String contactIdKey, String newFirstName) {
		
		if (contactList.get(contactIdKey) != null) {
			contactList.get(contactIdKey).setFirstName(newFirstName);
		}
		
	}
	
	public void setLastName(String contactIdKey, String newLastName) {
		if (contactList.get(contactIdKey) != null) {
			contactList.get(contactIdKey).setLastName(newLastName);
		}
	}
	
	public void setNumber(String contactIdKey, String newNumber) {
		if (contactList.get(contactIdKey) != null) {
			contactList.get(contactIdKey).setNumber(newNumber);
		}
	}
	
	public void setAddress(String contactIdKey, String newAddress) {
		if (contactList.get(contactIdKey) != null) {
			contactList.get(contactIdKey).setAddress(newAddress);
		}
	}
}
