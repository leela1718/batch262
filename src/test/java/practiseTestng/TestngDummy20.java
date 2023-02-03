package practiseTestng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestngDummy20
{
	@Test(priority=1)
	public void method1()
	{
		System.out.println("hi");
		Assert.assertTrue(false);
		System.out.println("Bye");
	}
	@Test(priority=2)
	public void method2()
	{
		SoftAssert sa=new SoftAssert();
		System.out.println("hi");
		sa.assertTrue(false);
		System.out.println("Bye");
		sa.assertAll();
	}
}
