package TestNg;

import org.testng.annotations.Test;

public class Invocation 
{
	// invocation means number of times program execute 
	@Test(invocationCount = 2)
	public void demo1()
	{
	System.out.println("Hi java");
	}
	@Test(invocationCount =4)
	public void demo2()
	{
	System.out.println("Hello selenium");
	}
}


