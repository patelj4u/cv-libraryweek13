package uk.co.library.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.library.utility.Utility;
import org.openqa.selenium.By;

import static org.openqa.selenium.net.HostIdentifier.getHostAddress;

import static uk.co.library.driverfactory.ManageDriver.driver;

public class HomePage extends Utility {




    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//button[@id='save']//span[contains(text(),'Accept All')]")
    WebElement acceptButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='hps-jobtitle hps-transition']//input[@name='q']")
    WebElement jobSearchField;

    @CacheLookup
    @FindBy(xpath = "//div[@class='hps-location hps-transition']//input[@name='geo']")
    WebElement locationField;

    @CacheLookup
    @FindBy(id = "distance")
    WebElement distanceDropDown;

    @CacheLookup
    @FindBy(xpath = "//button[@id='toggle-hp-search']")
    WebElement moreSearchOptionslink;

    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymin']")
    WebElement salaryminimum;

    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymax']")
    WebElement salarymax;

    @CacheLookup
    @FindBy(xpath = "//select[@id='salarytype']")
    WebElement salaryType;

    @CacheLookup
    @FindBy(id = "tempperm")
    WebElement jobTypedropdown;

    @CacheLookup
    @FindBy(xpath = "//input[@id='hp-search-btn']")
    WebElement findJobsButton;
    // By findJobsButton = By.xpath("//input[@id='hp-search-btn']");

    @CacheLookup
    @FindBy(xpath = "//h1[@class='search-header__title']")
    WebElement homePageMsg;
public String verifyResult(String result) {
    log.info("getting text from : " + homePageMsg.toString());
    System.out.println(getTextFromElement(homePageMsg));
    return getTextFromElement(homePageMsg);
}

public void acceptCookies(){
    driver.switchTo().frame("gdpr-consent-notice");
    mouseHoverToElement(acceptButton);
    clickOnElement(acceptButton);
}

//public void acceptCookies(){
//    mouseHoverToElementAndClick(accept);
//}
    public void enterJobTitle(String job) {
        sendTextToElement(jobSearchField, job);
    }

    public void enterlocation(String location) {
       sendTextToElement(locationField, location);
    }


    public void selectDistance(String text)
    {selectByVisibleTextFromDropDown(distanceDropDown,text);}

    public void clickonmoresearchoptions() {
       clickOnElement(moreSearchOptionslink);

    }

    public void enterSalarymin(String min) {
       sendTextToElement(salaryminimum,min);
    }

    public void entersalarymax(String max) {
        sendTextToElement(salarymax,max);
    }

    public void selectSalaryType(String text) {
        selectByValueFromDropDown(salaryType,text);
    }

    public void selectJobTypeDropdown(String value) {
        selectByValueFromDropDown(jobTypedropdown,value);
    }

    public void clickOnFindjob() {
        clickOnElement(findJobsButton);
    }

    public String verifyResultPage() {
    return getTextFromElement(homePageMsg);
    }
}