package com.test;



import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.base.StartWebDriver;



public class TestWebElement2 extends StartWebDriver{

	@Test
	public void findElemnt(){
		try {
			driver.findElement(By.className("email")).clear();
			driver.findElement(By.className("email")).sendKeys("diego.zottola@gpcloud.com");
			driver.findElement(By.cssSelector("input[name=\"password\"]")).clear();
		    driver.findElement(By.cssSelector("input[name=\"password\"]")).sendKeys("Enfermo@1");
		    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		    driver.findElement(By.xpath("//div[@id='main']/div[2]/div/form/div[4]/button")).click();
		    System.out.println("asdfasdddddddddddddddddddddddddddd");
		    java.lang.Thread.sleep(10000);
		    System.out.println("asdfasdddddddddddddddddddddddddddd");

		    driver.findElement(By.xpath("//*[@id='nav']/li[5]/a")).click();
		    driver.findElement(By.xpath("//ul[@id='nav']/li[5]/ul/li[2]/a")).click();
		    driver.findElement(By.xpath("//input[@name='MerchantTransactionID']")).sendKeys("201751121467");
		    
		  
		    

		} catch (NoSuchElementException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
