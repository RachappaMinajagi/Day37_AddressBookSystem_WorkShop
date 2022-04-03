package AddressBookSystemWorkShop;

/**
 * Create method NameValidationException
 * 
 * @author Rachoti
 *
 */
public class NameValidationException extends Exception {
	/**
	 * final key is used to the value can not be changed
	 */
	private static final long serialVersionUID = 1L;

	public NameValidationException(String message) {
		super(message);
	}
}