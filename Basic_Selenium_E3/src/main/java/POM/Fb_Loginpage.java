package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fb_Loginpage 
{
	//Declaration
	
	//address of email textfield
	@FindBy(xpath="//input[@name='email']")
	private WebElement emailTF;
	
	//address of password text field
	@FindBy(xpath="//input[@type='password']")
	private WebElement passwordTF;
	
	//address of login button
	@FindBy(xpath="//button[@name='login']")
	private WebElement loginButton;
	
	//Initialization
	public Fb_Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//getter and setter methods  // we can't use getter and setter methods from  textfields and button

	public WebElement getEmailTF() 
	{
		return emailTF;
	}
	
	public void setEmailTF(WebElement emailTF) 
	{
		this.emailTF = emailTF;
	}

	public WebElement getPasswordTF() 
	{
		return passwordTF;
	}

	public void setPasswordTF(WebElement passwordTF)
	{
		this.passwordTF = passwordTF;
	}

	public WebElement getLoginButton()
	{
		return loginButton;
	}

	public void setLoginButton(WebElement loginButton) 
	{
		this.loginButton = loginButton;
	}
	
	//utilization
	public void emailTextField(String data)
	{
		emailTF.sendKeys(data);
	}
	public void passwordtext(String data)
	{
		passwordTF.sendKeys(data);
	}
	public void loginbutton()
	{
		loginButton.click();
	}

	
}
