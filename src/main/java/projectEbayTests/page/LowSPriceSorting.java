package projectEbayTests.page;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


import java.util.ArrayList;
import java.util.List;

public class LowSPriceSorting {



    private ChromeDriver driver;
    public LowSPriceSorting(ChromeDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver , this);
    }
    public void sortItem(){



        List<WebElement> items = driver.findElements(By.className("s-item__price"));

        List<Double> pricesOfItem = new ArrayList<>();
        for (int i = 2 ; i < items.size() ; i++){
            String parts = items.get(i).getText();
            String result = parts.replaceAll(".*ILS\\s(\\d+\\.\\d+).*", "$1");
            double number = Double.parseDouble(result);
            pricesOfItem.add(number);


        }
         for (int i = 1 ; i < pricesOfItem.size()-1 ; i++){
             boolean isPass = true;
             double numFirst = pricesOfItem.get(i);
             double numSecond = pricesOfItem.get(i+1);

             if (numFirst > numSecond){
                 System.out.println(numFirst + ">" + numSecond);
                 isPass = false;
             }
//             Assert.assertTrue("the sort wrong, numFirst :" + numFirst  + "  better from the numSecond "+ numSecond , isPass);


         }



    }





}
