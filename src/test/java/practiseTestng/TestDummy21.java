package practiseTestng;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDummy21
{
	@Test
	public void method1() throws Exception
	{
		// Open Browser
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver =new ChromeDriver();
		Reporter.log("Chrome browser opened");
		Reporter.log("<br>");
		// Launch Site
		driver.get("https://www.google.co.in");
		Reporter.log("Google site is launched");
		Reporter.log("<br>");
		// Capture Screenshot
		File src=driver.getScreenshotAs(OutputType.FILE);
		// Save in target folder
		SimpleDateFormat sf=new SimpleDateFormat("dd-mmm-yyyy-hh-mm-ss");
		Date dt=new Date();
		String fp=System.getProperty("user.dir")+"\\target\\"+sf.format(dt)+".ping";
		File dest=new File(fp);
		FileHandler.copy(src, dest);
		// Add to Testng report("index.html" file in test out put folder)
		Reporter.log("<a href=\""+fp+"\"><img src=\""+fp+"\" height=\"100\" width=\"100\"/></a>");
		driver.close();
	}
}
