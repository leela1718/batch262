package practiseTestng;

import org.testng.annotations.Factory;

public class Simplefactory 
{
	@Factory
	public Object[] factoryMethod()
	{
		simpleTest obj1=new simpleTest(20,10);
		simpleTest obj2=new simpleTest(30,20);
		Object[] tests=new Object[2];
		tests[0]=obj1;
		tests[1]=obj2;
		return(tests);
	}
}
