package TestNg;

import org.testng.annotations.Test;

public class PriorityEx2 
{
	@Test(priority = -2)
	public void manoj()
	{
		System.out.println("Hello manoj");
	}
	@Test(priority = -4)
	public void kumar()
	{
		System.out.println("Hello kumar");
	}
	@Test(priority = -3)
	public void bairi()
	{
		System.out.println("Hello bairi");
	}

}
