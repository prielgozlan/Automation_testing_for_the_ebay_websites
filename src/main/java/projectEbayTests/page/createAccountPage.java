package projectEbayTests.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class createAccountPage {

    @FindBy(id = "firstname")
     WebElement firstname;
    @FindBy(id = "lastname")
     WebElement lastname;
    @FindBy(id = "Email")
     WebElement Email;
    @FindBy(id = "password")
     WebElement password;
    @FindBy(id = "EMAIL_REG_FORM_SUBMIT")
     WebElement EMAIL_REG_FORM_SUBMIT;


    private ChromeDriver driver;


    public createAccountPage(ChromeDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver , this);
    }

    public void AccountNew(){
        firstname.click();
        firstname.sendKeys("priel");
        lastname.click();
        lastname.sendKeys("gozlan");
        Email.click();
        Email.sendKeys("gozlan@gmail.com");
        password.click();
        password.sendKeys("Priel101010");
        EMAIL_REG_FORM_SUBMIT.click();

    }


}
