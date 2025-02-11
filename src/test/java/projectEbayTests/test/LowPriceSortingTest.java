package projectEbayTests.test;

import projectEbayTests.seleniumBase;
import org.openqa.selenium.chrome.ChromeDriver;
import projectEbayTests.page.LowSPriceSortingPage;

import java.util.Scanner;

import static java.lang.Thread.sleep;

public class LowPriceSortingTest {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your item that you search for got the price less :");
        String name = scanner.nextLine();
        seleniumBase base = new seleniumBase();
        ChromeDriver driver = base.seleniumInit("https://www.ebay.com/sch/i.html?_from=R40&_nkw="+name+"&_sacat=0&_sop=15");
        LowSPriceSortingPage sortPriceChip = new LowSPriceSortingPage(driver);
        sortPriceChip.sortItem();
        base.seleniumClose(driver);
    }
}
