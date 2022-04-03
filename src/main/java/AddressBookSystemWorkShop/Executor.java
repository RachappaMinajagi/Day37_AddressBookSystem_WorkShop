package AddressBookSystemWorkShop;

/**
 * import java.util.Scanner;
 */
import java.util.Scanner;

/**
 * create class Executor
 * 
 * @author Rachoti
 *
 */
public class Executor {
	/**
	 * create a scanner object which is used to input from the user
	 */
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		/**
		 * Display the WellCome Messages
		 */
		System.out.println("Welcome to Address Book System");
		System.err.println("_______________________________");
		ContactService contactService = new ContactService(sc);
		Contact contact = new Contact();
		contactService.createPerson(contact, sc);
		System.out.println(contact);
	}
	
}
