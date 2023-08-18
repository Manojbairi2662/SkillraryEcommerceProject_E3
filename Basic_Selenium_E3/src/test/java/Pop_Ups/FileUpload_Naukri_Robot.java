package Pop_Ups;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload_Naukri_Robot {

	public static void main(String[] args) throws Throwable {
		// managing drivers
		WebDriverManager.chromedriver().setup();
		
		// opening the empty browser
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Entering the URL
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		
		// maximize the screen
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[contains(text(),'Upload Resume')]")).click();
		Thread.sleep(2000);
		Robot r = new Robot();
		StringSelection str = new StringSelection("C:\\Manoj files\\Manoj Kumar resume\\Manoj Resume.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		Thread.sleep(2000);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		

	}

}
