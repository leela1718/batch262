package practiseTestng;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestngDummy03 
{
	@Test(expectedExceptions= {NoSuchElementException.class })
	public void method()
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.name("magnitia")).click();
	}
}
