package AddressBookSystemWorkShop;

import java.util.ArrayList;

/**
 * create a class name as AddressBook
 */
public class AddressBook {
	/**
	 * create a ArrayList Contact
	 */

	private ArrayList<Contact> addressList = new ArrayList<Contact>();

	public void setAddressList(ArrayList<Contact> addressList) {

		this.addressList = addressList;
	}

	public ArrayList<Contact> getAddressList() {
		return addressList;
	}

	public void addContact(Object object) {

		addressList.add((Contact) object);
	}

	public Contact searchByName(String name) {
		for (int i = 0; i < addressList.size(); ++i) { 
			if (addressList.get(i).getName().contains(name))
				/**
				 * calling get method from addressList object
				 */
				return addressList.get(i);
		}
		return null;
	}

	/**
	 * create mentod deleteContact
	 * 
	 * @param name - person name in address book
	 * @return - delete name in address book
	 */
	public boolean deleteContact(String name) {
		for (int i = 0; i < addressList.size(); ++i) {
			if (addressList.get(i).getName().equalsIgnoreCase(name)) {

				addressList.remove(i);
				return true;
			}
		}
		return false;
	}

	public String toString() {

		StringBuilder str = new StringBuilder();
		/**
		 * variable
		 */
		int count = 1;
		for (Contact contact : addressList) {
			if (contact != null) {
				str.append(count + ". " + contact.getFirstName() + " " + contact.getLastName() + "\n");
				count++;
			}
		}

		if (str.length() == 0)
			return "\nNo contact found";
		return str.toString();
	}
}