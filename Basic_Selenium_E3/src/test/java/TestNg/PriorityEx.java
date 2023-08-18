package TestNg;

import org.testng.annotations.Test;

public class PriorityEx 
{
	// priority means:which program execute first
	@Test(priority=-3, invocationCount =2)
	public void demo()
	{
		System.out.println("Hi demo1");
	}
	// invocation means number of times program execute
	@Test (priority=1, invocationCount =-1)
	public void demo2()
	{
		System.out.println("Hi demo2");
	}
	//enabled = false means it will not execute program
	@Test (priority=-5,invocationCount = 3,enabled = false)
	public void demo3()
	{
		System.out.println("Hi demo3");
	}

}