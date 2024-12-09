package projectEbayTests.test;

import magento_demo.seleniumBase;
import org.openqa.selenium.chrome.ChromeDriver;
import projectEbayTests.page.searchItem;

import java.util.Scanner;

import static java.lang.Thread.sleep;

public class searchItemTest {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your item that you search :");
        String name = scanner.nextLine();
        seleniumBase base = new seleniumBase();
        ChromeDriver driver = base.seleniumInit("https://www.ebay.com/");
        searchItem searchItem = new  searchItem(driver);
        searchItem.searchNameItem(name);




        sleep(3000);





        base.seleniumClose(driver);
    }
}
