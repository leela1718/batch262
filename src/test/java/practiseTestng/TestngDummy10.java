package practiseTestng;

import org.testng.annotations.Test;

public class TestngDummy10
{
	@Test(priority=1,dataProvider="mydata",dataProviderClass=TestngDummy09.class)
	public void testmethod3(String x, String y, String z)
	{
		String w=x+"-"+y+"-"+z;
		System.out.println(w);
	}
}
