package AddressBookSystemWorkShop;

/**
 * import java.util.regex.Pattern;
 */
import java.util.regex.Pattern;

/** 
 * Create String pattern Rejex namePattern, addressPattern, zipPattern,
 * emailPattern, phoneNumberPattern.
 * 
 * @author Rachoti
 *
 */ 
public class Validator {
	private String namePattern = "^[A-Z]{1}[A-Za-z]{2,}";
	private String addressPattern = "^[a-zA-Z0-9-, ]+";
	private String zipPattern = "^[0-9]{2,}";
	private String emailPattern = "^[a-zA-Z0-9+_-]+([.][a-zA-Z0-9]+)*@([a-zA-Z0-9]+)([.][a-z]+)?[.][a-z]{2,}$";
	private String phoneNumberPattern = "^[0-9]{1,}[ ][1-9][0-9]{9}$";

	/**
	 * Create method validateFirstName
	 * 
	 * @param firstName
	 * @return
	 * @throws NameValidationException
	 */

	public boolean validateFirstName(String firstName) throws NameValidationException {
		if (Pattern.matches(namePattern, firstName))
			return true;
		else
			/**
			 * if name is invalid then throw the Exception
			 */

			throw new NameValidationException("Invalid First Name, Please enter valid first name");
	}

	/**
	 * Create method validateLastName
	 * 
	 * @param lastName
	 * @return
	 * @throws NameValidationException
	 */
	public boolean validateLastName(String lastName) throws NameValidationException {
		if (Pattern.matches(namePattern, lastName))
			return true;
		/**
		 * if name is invalid then throw the Exception
		 */

		else
			throw new NameValidationException("Invalid Last Name, Please enter valid last name");
	}

	/**
	 * Create method validateAddress
	 * 
	 * @param address
	 * @return
	 * @throws AddressValidationException
	 */

	public boolean validateAddress(String address) throws AddressValidationException {
		if (Pattern.matches(addressPattern, address))
			return true;
		/**
		 * if name is invalid then throw the Exception
		 */
		else
			throw new AddressValidationException("Invalid Address, Please enter valid address");
	}

	/**
	 * Create method validateCity
	 * 
	 * @param city
	 * @return
	 * @throws NameValidationException
	 */
	public boolean validateCity(String city) throws NameValidationException {
		if (Pattern.matches(namePattern, city))
			return true;
		/**
		 * if name is invalid then throw the Exception
		 */
		else
			throw new NameValidationException("Invalid City, Please enter valid city");
	}

	/**
	 * Create method validateState
	 * 
	 * @param state
	 * @return
	 * @throws NameValidationException
	 */

	public boolean validateState(String state) throws NameValidationException {
		if (Pattern.matches(namePattern, state))
			return true;
		/**
		 * if name is invalid then throw the Exception
		 */
		else
			throw new NameValidationException("Invalid State, Please enter valid state");
	}

	/**
	 * create method validateZip
	 * 
	 * @param zip
	 * @return
	 * @throws ZipValidationException
	 */

	public boolean validateZip(String zip) throws ZipValidationException {
		if (Pattern.matches(zipPattern, zip))
			return true;
		/**
		 * if name is invalid then throw the Exception
		 */
		else
			throw new ZipValidationException("Invalid Zip, Please enter valid zip");
	}

	/**
	 * Creare method validateEmail
	 * 
	 * @param email
	 * @return
	 * @throws EmailValidationException
	 */
	public boolean validateEmail(String email) throws EmailValidationException {
		if (Pattern.matches(emailPattern, email))
			return true;
		/**
		 * if name is invalid then throw the Exception
		 */
		else
			throw new EmailValidationException("Invalid Email, Please enter valid email");
	}

	/**
	 * create method validatePhoneNumber
	 * 
	 * @param phoneNumber
	 * @return
	 * @throws PhoneNumberValidationException
	 */
	public boolean validatePhoneNumber(String phoneNumber) throws PhoneNumberValidationException {
		if (Pattern.matches(phoneNumberPattern, phoneNumber))
			return true;
		/**
		 * if name is invalid then throw the Exception
		 */
		else
			throw new PhoneNumberValidationException("Invalid Phone Number, Please enter valid phone number");
	}
}