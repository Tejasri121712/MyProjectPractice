package com.testscenarios;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AT_LOP {

	@Test

	public void f() throws IOException, InterruptedException {
		
		// TODO Auto-generated method stub
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://practice.automationtesting.in/");
		Thread.sleep(5000);
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Lost your password?")).click();
		driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("gtejasri1217@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/form/p[3]/input[2]")).click();


	}

}
