package projectEbayTests.page;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AddToCartPage {

    @FindBy(className = "s-item__title")
    List<WebElement> pushToItem;
    @FindBy(className = "item-price")
    WebElement priceItem;
    @FindBy(className = "logistics-costs")
    WebElement priceShipping;
    @FindBy(className = "total-row")
    WebElement allCost;

    private ChromeDriver driver;
    public AddToCartPage(ChromeDriver driver){
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
        double numberAsDoubleShipping;
        String priceShippingItem  = priceShipping.getText();
        if(Objects.equals(priceShippingItem, "Free shipping")){
            numberAsDoubleShipping = 0;
        }
        else {
            String numberShipping = priceShippingItem.replaceAll("[^\\d.]", "");
             numberAsDoubleShipping = Double.parseDouble(numberShipping);

        }
        WebElement priceAll = driver.findElement(By.cssSelector("div[data-test-id='SUBTOTAL'] > span.text-display-span > span > span"));
        String numAll = priceAll.getText();
        String SumAll = numAll.replaceAll("[^\\d.]", "");
        double numberAsDoubleAll = Double.parseDouble(SumAll);
        boolean isPass = false;
        if (numberAsDoubleAll == numberAsDoubleShipping+numberAsDouble){
            Assert.assertTrue("The price is the same." , isPass);
        }
        else {
            Assert.assertTrue("The price is not the same." , isPass);
        }
    }
}
