package BaseLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass_Guru99 {
	
	public static WebDriver driver;
	
	public static void iniilization()
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.get("https://demo.guru99.com/test/newtours/register.php");		
		driver.manage().window().maximize();
	}

}
