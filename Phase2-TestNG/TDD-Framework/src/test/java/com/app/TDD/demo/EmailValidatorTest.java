package com.app.TDD.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EmailValidatorTest {

	EmailValidator emailValidator = new EmailValidator();

	@Test
	public void testValidEmail() {

		String validEmail = "test@example.com";

		boolean isValid = emailValidator.isValidEmail(validEmail, true);

		Assert.assertTrue(isValid, "Email id is not valid...");

	}

	@Test
	public void testInvalidEmail() {

		String invalidEmail = "invalid-email-format";

		boolean isValid = emailValidator.isValidEmail(invalidEmail, true);

		Assert.assertFalse(isValid, "Invalid email is marked as valid");

	}

	@Test
	public void testValidEmailWithoutDomainValidation() {

		String validEmaill = "test@localhost";

		boolean isValid = emailValidator.isValidEmail(validEmaill, false);

		Assert.assertTrue(isValid, "Domain is not valid");

	}

	@Test
	public void testEmailLengthOutOfRange() {

		String shortEmail = "a@b.c";
		String longEmail = "abcdefghijklmnopqrstuvwzyz0123456789abcdefghijklmnopqrstuvwzyz0123456789abcdefghijklmnopqrstuvwzyz0123456789abcdefghijklmnopqrstuvwzyz0123456789abcdefghijklmnopqrstuvwzyz0123456789abcdefghijklmnopqrstuvwzyz0123456789@example.com";

		boolean isShortValid = emailValidator.isValidEmail(shortEmail, true);
		boolean isLongValid = emailValidator.isValidEmail(longEmail, true);

		// Assert

		Assert.assertFalse(isShortValid, "Short email is considered valid");
		Assert.assertFalse(isLongValid, "Long email is considered valid");

	}

}