package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{
	private By USER_EMAIL = By.xpath("//input[@id='email']");
	private By PASSWORD = By.xpath("//input[@id='password']");
	public By LOGIN = By.xpath("//button[@type='submit']");

	public void enterUserEmail(String username) {
		writeText(USER_EMAIL, username);
	}
	
	public void enterPassword(String password) {
		writeText(PASSWORD, password);
	}
	public void clickButton() {
		click(LOGIN);
	}
	
	public void doLogIn(String username, String password) {
		writeText(USER_EMAIL, username);
		writeText(PASSWORD, password);
		clickButton();
	}
}
