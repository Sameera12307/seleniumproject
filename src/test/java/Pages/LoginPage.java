package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	@FindBy( xpath ="//a[@class='ico-login']" )
    private WebElement clickLogin;

    @FindBy( xpath = "//input[@class='email']")
    private WebElement enterEmail;

    @FindBy( xpath = "//input[@name='Password']")
    private WebElement enterPassword;

    @FindBy( xpath =  "//input[@class='button-1 login-button']")
    private WebElement clickLogin1;
	 
    public void clicklogin()
    {
        clickLogin.click();
    }

    public void enterEmail(String str)
    {
        enterEmail.sendKeys(str);
    }
    public void enterPassword(String str)
    {
        enterPassword.sendKeys(str);
    }
    public void clickLogin1()
    {
        clickLogin1.click();
    }

	
	}

