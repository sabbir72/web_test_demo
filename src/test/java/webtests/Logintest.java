package webtests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.ProductPage;
import utilities.DriverSetup;

public class Logintest extends DriverSetup{
	HomePage WebHomePage = new HomePage();
	LoginPage WebLoginPage = new LoginPage();
	ProductPage WebProductPage= new ProductPage();



	@Test
	public void loginTest() throws InterruptedException {
		getDriver().get("https://test.sharebus.co/");
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		Actions act=new Actions(getDriver());
		WebHomePage.clickLoginButton();
//		WebLoginPage.scrollBtn();
		WebLoginPage.doLogIn("brainstation23@yopmail.com","Pass@1234");
		WebProductPage.selectUser();
		WebProductPage.sharelead();
		WebProductPage.cookiesClick();
		WebProductPage.countinueButton();
		WebProductPage.ScrollDown();
		Thread.sleep(3000);
		WebProductPage.setUpShareBusbutton();
		Thread.sleep(3000);
		WebProductPage.from("Oslo,Norway");
		Thread.sleep(3000);
		WebProductPage.getElement(WebProductPage.From).sendKeys(Keys.ARROW_DOWN);
		WebProductPage.getElement(WebProductPage.From).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,200)");
		WebProductPage.to("Kolbotn,Norway");
		Thread.sleep(3000);
		WebProductPage.getElement(WebProductPage.To).sendKeys(Keys.ARROW_DOWN);
		WebProductPage.getElement(WebProductPage.To).sendKeys(Keys.ENTER);
//		js.executeScript("window.scrollBy(0,200)");
		WebProductPage.ScrollByXY(0,300);
		Thread.sleep(2000);
		WebProductPage.dateClick();
		Thread.sleep(2000);
		WebProductPage.specificDate();
		Thread.sleep(2000);
		WebProductPage.times();
		WebProductPage.ScrollByXY(0,500);
		Thread.sleep(2000);
		WebProductPage.checkClick();
		Thread.sleep(2000);
		WebProductPage.nextContinueButton();
		Thread.sleep(2000);
		WebProductPage.noButton();
		WebProductPage.memberContinueButton();
		WebProductPage.ScrollByXY(0,300);
		Thread.sleep(2000);
		WebProductPage.yourselfNoButton();
		WebProductPage.ScrollByXY(0,300);
		Thread.sleep(2000);
		WebProductPage.descountNoButton();
		WebProductPage.ScrollByXY(0,300);
		WebProductPage.createSharebus();
		WebProductPage.publised();
		WebProductPage.tripName("Vacation Travel");
		WebProductPage.vacation();
		WebProductPage.ScrollByXY(0,300);
		WebProductPage.textArea("Lorem Ipsum is simply dummy text of the printing and typesetting industry.");
        WebProductPage.ScrollByXY(0,500);
		Thread.sleep(2000);
		WebProductPage.previewAndPublish();
		WebProductPage.tripPublish();
		Thread.sleep(2000);
		WebProductPage.myBuses();

	}

}
