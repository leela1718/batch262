package practiseTestng;

import org.testng.annotations.Test;

public class simpleTest
{
	private int param1;
	private int param2;
	public simpleTest(int x,int y)
	{
		param1=x;
		param2=y;
	}
	@Test
	public void testMethodOne()
	{
		System.out.println(param1+param2);
	}
	@Test
	public void testMethodTwo()
	{
		System.out.println(param1-param2);
	}
}
