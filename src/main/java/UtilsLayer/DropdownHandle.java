package UtilsLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.BaseClass_Guru99;

public class DropdownHandle extends BaseClass_Guru99{
	
	public static void dropDownMethodByVisibleText(WebElement wb , String var1)
	{
		Select sel =  new Select(wb);
		sel.selectByVisibleText(var1);
	}

}
