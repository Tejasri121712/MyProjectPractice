package com.objectrepository;

import org.openqa.selenium.By;

public class locators {

	public final By at_myaccount = By.linkText("My Account");
	public final By atlogin_email_editbox = By.xpath("//*[@id=\"username\"]");
	public final By atlogin_password_editbox = By.xpath("//*[@id=\"password\"]");
	public final By atlogin_login_button = By.name("login");
}
