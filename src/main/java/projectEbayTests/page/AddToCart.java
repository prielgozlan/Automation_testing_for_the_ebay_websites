package projectEbayTests.page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class AddToCart {

    @FindBy(className = "s-item__title")
    List<WebElement> pushToItem;
    @FindBy(id = "atcBtn_btn_1")
    WebElement addPriceToCard;



    private ChromeDriver driver;
    public AddToCart(ChromeDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver , this);
    }


    public void addItemToCard(){
        for(WebElement push : pushToItem){
            String text = push.getText();

            if(!text.isEmpty()){
                push.click();
                break;
            }
        }


    }
}
