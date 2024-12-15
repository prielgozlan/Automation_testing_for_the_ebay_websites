package projectEbayTests.page;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class HighPriceSortingPage {

    private ChromeDriver driver;
    public HighPriceSortingPage(ChromeDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver , this);
    }

    public void sortItem() {
        List<WebElement> items = driver.findElements(By.className("s-item__price"));
        List<WebElement> itemsSecond = driver.findElements(By.className("s-item__shipping"));
        List<Double> pricesOfItem = new ArrayList<>();
        List<Double> pricesOfShipping = new ArrayList<>();
        List<Double> pricesOfShippingAndItem = new ArrayList<>();
        for (int i = 2; i < items.size()-3; i++) {
            String parts = items.get(i).getText();
            String firstNumber = parts.replaceAll(".*ILS\\s([\\d,]+\\.\\d+).*", "$1");
            String cleanNumber = firstNumber.replace(",", "");

            double number = Double.parseDouble(cleanNumber);


            pricesOfItem.add(number);
            double numberSecond;
            if(!Objects.equals(itemsSecond.get(i).getText(), "Free International Shipping")) {
                String partsSecond = itemsSecond.get(i).getText();
                String secondNumber = partsSecond.replaceAll(".*ILS\\s([\\d,]+\\.\\d+).*", "$1");
                String cleanNumberSecond = secondNumber.replace(",", "");
                numberSecond = Double.parseDouble(cleanNumberSecond);

                pricesOfShipping.add(numberSecond);
            }
            else {
                numberSecond = 0;
                pricesOfShipping.add(numberSecond);
            }

        }
        for (int i = 0 ; i < pricesOfItem.size() ; i++){
            double num = pricesOfItem.get(i) + pricesOfShipping.get(i);
            pricesOfShippingAndItem.add(num);
        }
        for (int i = 0; i < pricesOfShippingAndItem.size()-1; i++) {
            boolean isPass = true;
            double numFirst = pricesOfShippingAndItem.get(i);
            double numSecond = pricesOfShippingAndItem.get(i + 1);

            if (numFirst < numSecond) {

                isPass = false;
                System.out.println("the sort wrong, numSecond :" + numSecond + "  better from the numFirst " + numFirst);
            }
            Assert.assertTrue("the sort wrong, numSecond :" + numSecond + "  better from the numFirst " + numFirst, isPass);
        }
    }
}
