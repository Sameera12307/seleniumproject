package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class AddToCart extends BasePage {
	    @FindBy(xpath="(//a[@href='/computers'])[3]")
	    private WebElement computersHover;


	    public void computersHover(WebDriver driver)
	    {
	    Actions act=new Actions(driver);

	    act.moveToElement(computersHover).perform();
	    }

	    @FindBy(xpath="(//a[@href='/desktops'])[3]")
	    private WebElement DesktopsClick;

	    public void clickDesktops() {
	        DesktopsClick.click();
	    }

	    @FindBy(xpath="(//a[text()='Simple Computer'])")
	        private WebElement ItemSelect;
	        public void SelectItem() {
	            ItemSelect.click();
	            }
	        @FindBy(xpath="(//input[@value='Add to cart'])[4]")
	            private WebElement AddtocartClick;
	            public void SelectAddtocart() {
	                AddtocartClick.click();
	                }
}




