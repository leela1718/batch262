package practiseTestng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestngDummy06 
{
	@Test(priority=1)
	public void openbrowser()
	{
		System.out.println("launch browser");
		Assert.assertTrue(true);
	}
	@Test(priority=2, dependsOnMethods={"openbrowser"})
	public void login()
	{
		System.out.println("do login");
		Assert.assertTrue(true);
	}
	}
