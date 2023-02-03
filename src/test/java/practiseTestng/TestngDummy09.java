package practiseTestng;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestngDummy09 
{
	@DataProvider(name="mydata")
	public Object[][] datamethod(Method m)
	{
	if(m.getName().equalsIgnoreCase("testMethod1"))
	{
		Object[][] x=new Object[][] {{12,34,45},{21,43,65},{24,23,-65}};
		return(x);
	}
	else if(m.getName().equalsIgnoreCase("testMethod2"))
	{
		Object[][] x=new Object[][] {{"Abdul","Kalam",93},{"Dhoni","Ms",41},{"Kholi","Anushka",31}};
		return(x);
	}
	else
	{
		Object[][] x=new Object[][] {{"Abdul","Kalam","11"},{"Dhoni","MS","34.8"}};
		return(x);
	}
  }
	@Test(priority=1,dataProvider="mydata")
	public void testmethod1(int x,int y,int z)
	{
		int w=x+y+z;
		System.out.println(w);
	}
	@Test(priority=2,dataProvider="mydata")
	public void testmethod2(String x,String y, int z)
	{
		String w= x+"-"+y+"-"+z;
		System.out.println(w);
	}
}
	
