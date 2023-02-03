package practiseTestng;

import org.testng.annotations.Factory;

public class TestngDummy18
{
	@Factory
	public Object[] method()
	{
		// Create an Object to runner classes
		TestngDummy08 obj1=new TestngDummy08();
		TestngDummy09 obj2=new TestngDummy09();
		 //Store runner classes objects into  array
		Object[] tests=new Object[2];
		tests[0]=obj1;
		tests[1]=obj2;
		//return that array to TestNG to run listed runner classes sequentially
		return(tests);
	}
}

// or
// use a testng suite file  EX: testng5groups
