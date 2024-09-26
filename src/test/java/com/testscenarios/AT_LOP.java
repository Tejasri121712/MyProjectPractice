package com.testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AT_LOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://practice.automationtesting.in/");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Lost your password?")).click();
		driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("gtejasri1217@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/form/p[3]/input[2]")).click();


	}

}
