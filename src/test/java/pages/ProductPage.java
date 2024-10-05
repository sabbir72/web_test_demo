package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static utilities.DriverSetup.getDriver;

public class ProductPage extends BasePage{
    public By Cookies= By.xpath("//button[.='Accept cookies']");
    public By SelectUser=By.xpath("//span[@class='p-dropdown-trigger-icon pi pi-chevron-down']");
    public  By Sharelead = By.xpath("//li[@aria-label='sharelead']");
    public By CountinueButton=By.xpath("//button[.='Continue']");
    public By SetUpShareBusButton = By.xpath("//button[@class='btn btn-primary sb-btn-primary sb-btn-lg px-4 py-1 my-2 rounded-pill border-0 fw-400']");
    public By From=By.xpath("//input[@id='startPoint']");
    public By To=By.xpath("//input[@id='destination']");
    public By ReturnLavel=By.xpath("//label[normalize-space()='Return time']");
    public By Date=By.xpath("//body/div/div/div/div/div/div/form/div/div/div[1]/div[1]/div[1]/div[1]/span[1]");
    public By SpecificDate=By.xpath("//body[1]/div[3]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[4]");
    public By Times=By.xpath("(//input[@placeholder='Time'])[1]");
    public By ToggleButton =By.xpath("//label[@for='returnTripswitch']");
    public By ToggleText =By.xpath("(//small[normalize-space()='I don't want return trip.'])[1]");
    public By Continuebutton =By.xpath("//span[normalize-space()='Continue']");
    public By NoButton=By.xpath("//button[contains(@class,'border-start-0 border-light')]");
    public By MemberContinueButton=By.xpath("//span[normalize-space()='Continue']");
    public By YourselfNoButton=By.xpath("//button[.='No']");
    public By DicsountNoButton=By.xpath("//button[@class='btn gray-white-bg ship-gray btn-discount-size rounded-end']");
    public By CreateBtn=By.xpath("//button[.='Create Sharebus']");
    public By Publish=By.xpath("//button[.='Publish']");
   public  By TripName = By.xpath("//input[@class='form-control rounded']");
   public  By Vacation = By.xpath("//div[@id='vacation3']");
   public  By TextArea = By.xpath("//textarea[@class='border-light w-100 rounded ship-gray']");
   public  By PreviewAndPublish = By.xpath("//span[.='Preview and publish']");
   public  By TripPublish = By.xpath("//button[.='Publish']");
   public  By MyBuses = By.xpath("//button[@class='btn sb-btn-sharelead rounded-pill sb-btn-lg text-dark fw-bold']");

public void cookiesClick(){
    click(Cookies);
}
    public void selectUser(){click(SelectUser);}
    public void sharelead(){click(Sharelead);}
    public void countinueButton(){
        click(CountinueButton);
    }
    public void ScrollDown(){
        Scroll(SetUpShareBusButton);
    }
    public void setUpShareBusbutton(){
        click(SetUpShareBusButton);
    }
    public void from(String startpoint) {
        writeText(From, startpoint);
    }
    public  void to(String destination) {writeText(To,destination);}
    public void dateClick(){
        click(Date);
    }
    public void specificDate(){click(SpecificDate);}
    public void times(){click(Times);}
     public void continueScroll(){
      Scroll(CreateBtn);
     }
     public void checkClick(){click(ToggleButton);}
     public void nextContinueButton(){click(Continuebutton);}
    public void noButton(){
        click(NoButton);
    }
     public void memberContinueButton(){
        click(MemberContinueButton);
    }
     public void yourselfNoButton(){
        click(YourselfNoButton);
    }
   public void descountNoButton(){
        click(DicsountNoButton);
    }
  public void createSharebus(){
        click(CreateBtn);
    }
  public void publised(){
        click(Publish);
    }
    public void tripName(String name) {
        writeText(TripName, name);
    }
 public void vacation(){
    click(Vacation);
 }
    public void textArea(String name) {
        writeText(TextArea, name);
    }
    public void previewAndPublish(){
        click(PreviewAndPublish);
    }
    public void tripPublish(){
        click(TripPublish);
    }
    public void myBuses(){
        click(MyBuses);
    }
}
