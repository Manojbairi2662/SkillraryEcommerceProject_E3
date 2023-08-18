package Basic_Programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeBrowser_Lanunch
{
	public static void main(String[] args) 
	{
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();

	}

}
