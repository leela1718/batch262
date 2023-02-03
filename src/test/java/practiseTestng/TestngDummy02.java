package practiseTestng;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestngDummy02
{
	@Test(description="open chrome browser",timeOut=15000)
	public void method() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
}
