package projectEbayTests.page;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class HighPriceSorting {

    private ChromeDriver driver;
    public HighPriceSorting(ChromeDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver , this);
    }
    public void sortItem() {


        List<WebElement> items = driver.findElements(By.className("s-item__price"));

        List<Double> pricesOfItem = new ArrayList<>();
        for (int i = 2; i < items.size(); i++) {
            String parts = items.get(i).getText();
            String firstNumber = parts.replaceAll(".*ILS\\s([\\d,]+\\.\\d+).*", "$1");
            String cleanNumber = firstNumber.replace(",", "");

            double number = Double.parseDouble(cleanNumber);

            pricesOfItem.add(number);


        }
        for (int i = 1; i < pricesOfItem.size() - 1; i++) {
            boolean isPass = true;
            double numFirst = pricesOfItem.get(i);
            double numSecond = pricesOfItem.get(i + 1);

            if (numFirst < numSecond) {

                isPass = false;
                System.out.println("the sort wrong, numSecond :" + numSecond + "  better from the numFirst " + numFirst);
            }
            Assert.assertTrue("the sort wrong, numSecond :" + numSecond + "  better from the numFirst " + numFirst, isPass);


        }


    }
}
