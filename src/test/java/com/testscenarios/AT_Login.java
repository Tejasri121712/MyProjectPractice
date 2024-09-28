package com.testscenarios;

import org.testng.annotations.Test;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.testng.annotations.Test;

import com.objectrepository.locators;

public class AT_Login {
	locators loc = new locators();

	@Test

	public void f() throws IOException {
		WebDriver driver;
		
		Properties prop = new Properties();
		FileInputStream file = new FileInputStream("/Users/tejasrigudavalli/eclipse-workspace/Frameworksample/src/test/resources/testdata/QA_td.properties");
		prop.load(file);
		
		driver = new ChromeDriver();
		driver.get(prop.getProperty("AT_Login_URL"));
		driver.findElement(loc.at_myaccount).click();
		driver.findElement(loc.atlogin_email_editbox).sendKeys(prop.getProperty("AT_username"));
		driver.findElement(loc.atlogin_password_editbox).sendKeys(prop.getProperty("AT_password"));
		driver.findElement(loc.atlogin_login_button).click();
		
		//Take Screenshot
		File abc = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(abc, new File("/Users/tejasrigudavalli/eclipse-workspace/Frameworksample/screenshots/atlogin.png"));
		

	}

}
