package practiseTestng;

import org.testng.annotations.Test;

public class TestngDummy04 
{
	public int i=1;
	@Test(invocationCount=5, invocationTimeOut=30000)
	public void method() throws Exception
	{
		System.out.println(i);
		i++;
		Thread.sleep(4000);
	}
}
