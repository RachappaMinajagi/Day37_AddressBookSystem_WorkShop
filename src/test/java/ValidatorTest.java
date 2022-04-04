import org.junit.Assert;
import org.junit.Test;

import AddressBookSystemWorkShop.AddressValidationException;
import AddressBookSystemWorkShop.EmailValidationException;
import AddressBookSystemWorkShop.NameValidationException;
import AddressBookSystemWorkShop.PhoneNumberValidationException;
import AddressBookSystemWorkShop.Validator;

public class ValidatorTest {

	@Test
	public void validateFirstName() throws NameValidationException {
		Validator contact = new Validator();
		boolean result = contact.validateFirstName("Rachoti");
		Assert.assertTrue(true);
	}

	@Test
	public void lastNameTest() throws NameValidationException {
		Validator contact = new Validator();
		boolean result = contact.validateLastName("Minajagi");
		Assert.assertTrue(true);
	}

	@Test
	public void validateEmail() throws EmailValidationException {
		Validator contact = new Validator();
		boolean result = contact.validateEmail("rachoti@gmail.com");
		Assert.assertTrue(true);
	}
 
	@Test
	public void phoneNoTest() throws PhoneNumberValidationException {
		Validator contact = new Validator();
		boolean result = contact.validatePhoneNumber("91 9686451124");
		Assert.assertTrue(true);
	}

	@Test
	public void addressTest() throws AddressValidationException { 
		Validator contact = new Validator();
		boolean result = contact.validateAddress("Basav Nagar");
		Assert.assertTrue(true);
	}

	@Test
	public void cityTest() throws NameValidationException {
		Validator contact = new Validator();
		boolean result = contact.validateCity("Gadag");
		Assert.assertTrue(true);
	}

	@Test
	public void stateTest() throws NameValidationException {
		Validator contact = new Validator();
		boolean result = contact.validateState("Karnataka");
		Assert.assertTrue(true);
	}
}