package com.base.helpers;

import org.openqa.selenium.WebElement;

public class ButtonHelper extends StartWebDriver{
	
	public static void clickButton(String locator){
		WebElement ele = getElement(locator);
		ele.click();
	}
}
