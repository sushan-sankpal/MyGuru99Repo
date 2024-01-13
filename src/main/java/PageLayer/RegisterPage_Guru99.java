package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass_Guru99;
import UtilsLayer.DropdownHandle;
import UtilsLayer.UtilsClass;


public class RegisterPage_Guru99 extends BaseClass_Guru99{
	
	@FindBy (name = "firstName")
	WebElement fname;

	@FindBy (name = "lastName")
	WebElement lname;
	
	@FindBy (name = "phone")
	WebElement phone;
	
	@FindBy (name = "userName")
	WebElement email;
	
	@FindBy (name = "address1")
	WebElement add;
	
	@FindBy (name = "city")
	WebElement city;
	
	@FindBy (name = "state")
	WebElement state;
	
	@FindBy (name = "postalCode")
	WebElement pin;
	
	@FindBy (name = "country")
	WebElement Country;
	
	@FindBy (name = "email")
	WebElement username;
	
	@FindBy (name = "password")
	WebElement pwd;
	
	@FindBy (name = "confirmPassword")
	WebElement cpwd;
	
	@FindBy (name = "submit")
	WebElement submit;
	
	public RegisterPage_Guru99() {
		PageFactory.initElements(driver, this);
		
	}
	
	public void registerPageFunctionality(String frname, String lsname, String phn, String email1, String add1, String city1, String state1, String pin1, String country1, String username1, String pwd1, String cpwd1)
	//
	{
		UtilsClass.sendKeys(fname, frname);
		UtilsClass.sendKeys(lname, lsname);
		UtilsClass.sendKeys(phone, phn);
		UtilsClass.sendKeys(email, email1);
		UtilsClass.sendKeys(add, add1);
		UtilsClass.sendKeys(city, city1);
		UtilsClass.sendKeys(state, state1);
		UtilsClass.sendKeys(pin, pin1);
		DropdownHandle.dropDownMethodByVisibleText(Country, country1);
		UtilsClass.sendKeys(username, username1);
		UtilsClass.sendKeys(pwd, pwd1);
		UtilsClass.sendKeys(cpwd, cpwd1);
		submit.click();
	}
	
}
