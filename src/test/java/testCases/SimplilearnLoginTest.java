package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.LoginPage;

public class SimplilearnLoginTest extends BaseClass {


	@Test
	public void Test1() {

		LoginPage lp = new LoginPage(driver);
		lp.Login("abc@xyz.com", "Abc@1234");

		String ExError = "The email or password you have entered is invalid.";
		WebElement error = driver.findElement(By.id("msg_box"));
		String AcError = error.getText();
		//Assert.assertFalse(error.isDisplayed());
		Assert.assertEquals(ExError, AcError);
		System.out.println("Test1 is done");

	}
	@Test
	@Parameters({"uname","pwd"})
	public void Test2(String UserName, String Password) {
		LoginPage lp = new LoginPage(driver);
		lp.Login(UserName, Password);
		System.out.println("Test2 is done");

	}

	@Test
	public void Test3() {

		String UserName = sheet.getRow(1).getCell(0).getStringCellValue();
		String Password = sheet.getRow(1).getCell(1).getStringCellValue();

		LoginPage lp = new LoginPage(driver);
		lp.Login(UserName, Password);
		System.out.println("Test3 is done");

	}
}
