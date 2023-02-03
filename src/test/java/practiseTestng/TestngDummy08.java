package practiseTestng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestngDummy08
{
	@DataProvider(name="testdata")
	public Object[][] datamethod()
	{
		Object[][] x=new Object[][] {{12,34},{21,43},{23,-65}};
		return(x);
	}
	@Test(priority=1,dataProvider="testdata")
	public void testmethod( int x,int y)
	{
	int	w=x+y;
	System.out.println(w);
	}
}
