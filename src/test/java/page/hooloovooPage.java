package page;

import base.baseHooloovoo;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;

public class hooloovooPage extends baseHooloovoo {

    public hooloovooPage() {
        PageFactory.initElements(driver,this);
    }

        @FindBy (css = "div[class='cc-compliance']")
        public WebElement cookieButton;

        @FindBy(css = "li[id='menu-item-582']")
        public WebElement posaoButton;

        @FindBy(xpath = "//a[text()='Pridruži se!']")
        public WebElement pridruziSeButton;

        @FindBy(css = "a[class='fusion-button button-flat button-large button-custom button-1 fusion-button-default-span fusion-button-default-type']")
        public WebElement prijaviSeButton;

        @FindBy(xpath = "//h1[contains(text(),'General Application')]")
        public WebElement applicationText;

        @FindBy(id = "firstname")
        public WebElement firstnameField;

        @FindBy(id = "lastname")
        public WebElement lastnameField;

        @FindBy(id = "email")
        public WebElement emailField;

        @FindBy(xpath = "//span[text()='Upload a file']")
        public WebElement uploadFile;

        @FindBy(id = "cover_letter")
        public WebElement coverLetterField;

        @FindBy(css = "button--2de5X button--14TuV primary--25RCR styles--10XMc")
        public WebElement submitButton;





        public void clickCookieButton(){
            wdwait.until(ExpectedConditions.visibilityOf(cookieButton));
            cookieButton.click();
        }

        public void navigateToPosaoPage(){
            wdwait.until(ExpectedConditions.visibilityOf(posaoButton));
            posaoButton.click();
        }

        public void clickOnPridruziSeButton(){
            wdwait.until(ExpectedConditions.visibilityOf(pridruziSeButton));
            pridruziSeButton.click();
        }

        public void clickOnPrijaviSeButton(){
            wdwait.until(ExpectedConditions.visibilityOf(prijaviSeButton));
            prijaviSeButton.click();
        }

        public void moveToNewTab() {
           wdwait.until(ExpectedConditions.numberOfWindowsToBe(2));
           List<String> tabs = new ArrayList<String>(driver.getWindowHandles());
           driver.switchTo().window(tabs.get(1));
       }

       public void applicationTextDisplayer(){
            wdwait.until(ExpectedConditions.visibilityOf(applicationText));
            Assert.assertTrue(applicationText.isDisplayed());
            System.out.println(applicationText.getText());
       }



        public void enterNameInFirstNameField(){
            wdwait.until(ExpectedConditions.visibilityOf(firstnameField));
            firstnameField.sendKeys("Milan");

        }

        public void enterLastnameInLastnameField(){
            wdwait.until(ExpectedConditions.visibilityOf(lastnameField));
            lastnameField.sendKeys("Kostic");
        }

        public void enterEmailInEmailField(){
            wdwait.until(ExpectedConditions.visibilityOf(emailField));
            emailField.sendKeys("milan.kostic90@gmail.com");
        }

        public void uploadFileFromHD(){
            wdwait.until(ExpectedConditions.visibilityOf(uploadFile));
            uploadFile.sendKeys("/Users/milan/CV Milan Kostić.pdf");

        }

        public void addCVlinkInCoverLetterField(){
            wdwait.until(ExpectedConditions.visibilityOf(coverLetterField));
            coverLetterField.sendKeys("https://drive.google.com/file/d/1sqJmITBWLyv3y_r8XRqZB-cHa8G8ox_m/view?usp=share_link");
        }
























}
