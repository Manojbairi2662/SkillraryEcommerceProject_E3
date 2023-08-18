package TestNg;

import org.testng.annotations.Test;

public class Enabled 
{
	//enabled = false: means it will not execute program
	@Test(enabled = false)
	public void A()
	{
		System.out.println("Hello A");
	}
	@Test
	public void C()
	{
		System.out.println("Hello C");
	}
	@Test
	public void B()
	{
		System.out.println("Hello B");
	}

}
