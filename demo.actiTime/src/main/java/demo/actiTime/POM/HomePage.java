package demo.actiTime.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="logoutLink")
	private WebElement logoutButton;

	public WebElement getLogoutButton() {
		return logoutButton;
	}
    
	public void setLogoutButton(WebElement logoutButton) {
		this.logoutButton = logoutButton;
	}
	
	//business logic
	public void logout() {
		logoutButton.click();
	}
	
	
	
}
