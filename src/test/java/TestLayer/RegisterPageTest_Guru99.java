package TestLayer;

import java.io.IOException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLayer.BaseClass_Guru99;
import PageLayer.RegisterPage_Guru99;
import UtilsLayer.UtilsClass;
import junit.framework.Assert;

public class RegisterPageTest_Guru99 {
	@BeforeTest
	public void setUp()
	{
		BaseClass_Guru99.iniilization();
	}
	
	@Test(priority =  1)
	public void validateRegisterPage() 
	{
		RegisterPage_Guru99 register = new RegisterPage_Guru99();
		register.registerPageFunctionality("Sushant", "Sankpal", "71236872", "Test", "Thane", "Bhiwnadi", "Maharashtra", "123456", "AUSTRIA", "sushant.sankpal", "Sushant@123", "Sushant@123");
	}
	
	@Test(priority = 2)
	public void validateRegisterSuccess()
	{
		Assert.assertEquals("https://demo.guru99.com/test/newtours/register_sucess.php", UtilsClass.getURL());
		Assert.assertEquals("Register: Mercury Tours", UtilsClass.getTitle());
	}
	
	@AfterTest
	public void tearDown() throws IOException
	{
		UtilsClass.tekeScreenShotMethodSuccess();
	}
	
}

