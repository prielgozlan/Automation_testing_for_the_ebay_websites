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

import static java.lang.Thread.sleep;

public class AddToCart {

    @FindBy(className = "s-item__title")
    List<WebElement> pushToItem;
    @FindBy(className = "item-price")
    WebElement priceItem;
    @FindBy(className = "logistics-costs")
    WebElement priceShipping;
    @FindBy(className = "total-row")
    WebElement allCost;



    private ChromeDriver driver;
    public AddToCart(ChromeDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver , this);
    }


    public void addItemToCard() throws InterruptedException {
        for(WebElement push : pushToItem){
            String text = push.getText();

            if(!text.isEmpty()){
                push.click();
                break;
            }
        }
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }

        WebElement addCard2 = driver.findElement(By.linkText("Add to cart"));
        addCard2.click();
        String price = priceItem.getText();
        String number = price.replaceAll("[^\\d.]", "");
        double numberAsDouble = Double.parseDouble(number);

        String priceShippingItem  = priceShipping.getText();
        String numberShipping = priceShippingItem.replaceAll("[^\\d.]", "");
        double numberAsDoubleShipping = Double.parseDouble(numberShipping);


        WebElement priceAll = driver.findElement(By.cssSelector("div[data-test-id='SUBTOTAL'] > span.text-display-span > span > span"));
        String numAll = priceAll.getText();
        String SumAll = numAll.replaceAll("[^\\d.]", "");
        double numberAsDoubleAll = Double.parseDouble(SumAll);


        if (numberAsDoubleAll == numberAsDoubleShipping+numberAsDouble){
            System.out.println("The price is the same.");
        }
        else {
            System.out.println("The price is not the same.");
        }








        sleep(3000);

    }
}
