package projectEbayTests.page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Objects;

public class searchItem {

    @FindBy(id = "gh-ac")
    WebElement search;
    @FindBy(className = "srp-save-null-search__heading")
    WebElement itemNotFind;
    @FindBy(css = "div.s-item__title > span")
    List<WebElement> findItems;


    private ChromeDriver driver ;

    public searchItem (ChromeDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver , this);
    }

    public void searchNameItem (String name){

        search.click();
        search.sendKeys(name);
        search.sendKeys(Keys.ENTER);

        for (WebElement el : findItems) {
            String text = el.getText();
            if (!text.isEmpty()) {
                if (text.contains(name)){
                    System.out.println("find on Ebay this items " + name);
                    break;
                }

            }
        }
        if (findItems.size() == 2) {
            System.out.println(itemNotFind.getText()+ " " + name);
        }






    }




}
