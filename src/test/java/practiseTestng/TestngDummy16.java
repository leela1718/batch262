package practiseTestng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestngDummy16
{
	@Test(priority=1)
	@Parameters({"country","firstname","secondname"})
	public void displaycountry(String c,String fn,String sn)
	{
		System.out.println(fn+" "+sn+" bleongs to "+c);
	}
}
