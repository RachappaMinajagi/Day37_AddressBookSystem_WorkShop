package AddressBookSystemWorkShop;

/**
 * import java.util.Scanner; 
 */
import java.util.Scanner;

/**
 * Create Class ContactService
 * 
 * @author Rachoti
 *
 */
public class ContactService {
	public static final String REST_IO = null;
	public static final String DB_IO = null;
	private Scanner sc;
	private Validator validator;

	/**
	 * Create Constructor passing Scanner sc
	 * 
	 * @param sc
	 */
	public ContactService(Scanner sc) {
		this.sc = sc;
		this.validator = new Validator();
	}

	/**
	 * create method createPerson passing parameter
	 * 
	 * @param contact
	 * @param sc
	 */
	public void createPerson(Contact contact, Scanner sc) {
		String firstName, lastName, address, city, state, zip, email, phoneNumber;
		System.out.println("first name:");
		while (true) {
			try {
				firstName = sc.nextLine();
				validator.validateFirstName(firstName);
				contact.setFirstName(firstName);
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("last name:");
		while (true) {
			try {
				lastName = sc.nextLine();
				validator.validateLastName(lastName);
				contact.setLastName(lastName);
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("address:");
		while (true) {
			try {
				address = sc.nextLine();
				validator.validateAddress(address);
				contact.setAddress(address);
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("city:");
		while (true) {
			try {
				city = sc.nextLine();
				validator.validateCity(city);
				contact.setCity(city);
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("state:");
		while (true) {
			try {
				state = sc.nextLine();
				validator.validateState(state);
				contact.setState(state);
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("zip:");
		while (true) {
			try {
				zip = sc.nextLine();
				validator.validateZip(zip);
				contact.setZip(zip);
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("Phone Number:");
		while (true) {
			try {
				phoneNumber = sc.nextLine();
				validator.validatePhoneNumber(phoneNumber);
				contact.setPhoneNumber(phoneNumber); 
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("email:");
		while (true) {
			try {
				email = sc.nextLine();
				validator.validateEmail(email);
				contact.setEmail(email);
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("\nContact is added successfully\n");
	}

	public void editExistingContact(Contact contact) {
		while (true) {
			System.out.println("Options to update contact:");
			System.out.println(
					"1 (FirstName)\n2 (LastName)\n3 (Address)\n4 (City)\n5 (State)\n6 (Zip)\n7 (Phone)\n8 (Email)\n9 (Exit)");
			int options = Integer.parseInt(sc.nextLine());
			/**
			 * Switch case Statements it will the display the Person Contact details
			 */
			switch (options) {
			/**
			 * print all the given Statements
			 */
			case 1:
				System.out.println("Enter New FirstName");
				String newFirstName = sc.nextLine();
				contact.setFirstName(newFirstName);
				break;
			case 2:
				System.out.println("Enter New LastName");
				String newLastName = sc.nextLine();
				contact.setLastName(newLastName);
				break;
			case 3:
				System.out.println("Enter New Address");
				String newAddress = sc.nextLine();
				contact.setAddress(newAddress);
				break;
			case 4:
				System.out.println("Enter New City");
				String newCity = sc.nextLine();
				contact.setCity(newCity);
				break;
			case 5:
				System.out.println("Enter State");
				String newState = sc.nextLine();
				contact.setState(newState);
				break;
			case 6:
				System.out.println("Enter New Zip");
				String newZip = sc.nextLine();
				contact.setZip(newZip);
				break;
			case 7:
				System.out.println("Enter New Phone");
				String newPhone = sc.nextLine();
				contact.setPhoneNumber(newPhone);
				break;
			case 8:
				System.out.println("Enter New Email");
				String newEmail = sc.nextLine();
				contact.setFirstName(newEmail);
				break;
			case 9:
				System.out.println("Exit");
				return;
			default:
				System.out.println("Invalid Entry");
				break;
			}
		}
	}

	/**
	 * create method DisplayContact
	 * 
	 * @param contact
	 */
	public void displayContact(Contact contact) {
		if (contact == null) {
			System.out.println("Contact not found");
			return;
		}
		System.out.println(contact);
	}

	public Object createContact() {
		
		return null;
	}
}