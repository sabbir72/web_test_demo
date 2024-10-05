package pages;

import org.openqa.selenium.By;
public class HomePage extends BasePage{
	private By SignUpButton = By.xpath("//button[@class='btn sb-btn-lg sb-btn-secondary rounded-pill py-1 px-3 fw-normal']");
	public void clickLoginButton() {
		click(SignUpButton);
	}
}
