package practiseTestng;

import org.testng.annotations.Test;

public class TestngDummy01 
{
	// way-1(Run as Java Application)
	public static void main(String[] args)
	{
		System.out.println("Hi i am main method");
	}
	// Way-2(Run as TestNG Test)
		@Test
		public void method()
		{
			System.out.println("Hi i am an annotated method");
		}


}
