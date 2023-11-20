package com.ninjademo.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	//WebDriver driver;

	// Create PageFactory

	@FindBy(xpath = "//span[text()='My Account']")
	WebElement myaccount;

	@FindBy(xpath = "//a[text()='Register']")
	WebElement register;

	@FindBy(linkText = "Login")
	WebElement login;

	@FindBy(xpath = "//span[text()='Wish List (0)']")
	WebElement wishlist;

	public HomePage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	// Actions

	public void clickOnMyAccount() {

		myaccount.click();
	}

	public void clickOnLogin() {

		login.click();

	}

	public void clickOnRegister() {

		register.click();
	}

	public void clickOnWishList() {

		wishlist.click();
	}

}