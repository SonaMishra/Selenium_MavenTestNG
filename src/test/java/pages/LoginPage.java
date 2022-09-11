package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage   {
	//**************Objects******************
	WebDriver driver;

	@FindBy(linkText ="Log in" )
	WebElement login;

	@FindBy(name ="user_login" )
	WebElement User;

	@FindBy(id ="password" )
	WebElement Pass;

	@FindBy(className ="rememberMe" )
	WebElement remberme;

	@FindBy(name ="btn_login" )
	WebElement Login;
	public LoginPage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}


	//****************Methods**************************

	public void Login(String UsernameVal, String PassVal) {

		login.click();

		User.sendKeys(UsernameVal);

		Pass.sendKeys(PassVal);

		remberme.click();

		Login.click();
	}
}
