package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Admin extends BasePage {
	
	@FindBy(xpath="(//a[@href='/login'])")

	private WebElement loginclick;

	 

	@FindBy(xpath="//input[@id='Email']")

	private WebElement email;

	 

	@FindBy(xpath="//input[@id='Password']")

	private WebElement password;

	 

	@FindBy(xpath="//input[@class='button-1 login-button']")

	private WebElement loginbtn;

	

	public void loginclick() {

	loginclick.click();

	}

	public void enteremail(String str) {

	email.sendKeys(str);

	}

	public void enterpassword(String str) {

	password.sendKeys(str);
	}
	public void loginbtn() {

		loginbtn.click();

		}

		 
	}

	 

	 