package projectEbayTests.test;

import magento_demo.seleniumBase;
import org.openqa.selenium.chrome.ChromeDriver;
import projectEbayTests.page.HighPriceSorting;

import java.util.Scanner;

import static java.lang.Thread.sleep;

public class HighPriceSortingTest {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your item that you search for got the price high :");
        String name = scanner.nextLine();
        seleniumBase base = new seleniumBase();

        ChromeDriver driver = base.seleniumInit("https://www.ebay.com/sch/i.html?_from=R40&_nkw="+name+"&_sacat=0&_sop=16");
        HighPriceSorting HighPriceSorting = new HighPriceSorting(driver);
        HighPriceSorting.sortItem();




        sleep(3000);





        base.seleniumClose(driver);
    }

}
