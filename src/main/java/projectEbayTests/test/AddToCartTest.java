package projectEbayTests.test;

import projectEbayTests.seleniumBase;
import org.openqa.selenium.chrome.ChromeDriver;
import projectEbayTests.page.AddToCart;

import java.util.Scanner;

import static java.lang.Thread.sleep;

public class AddToCartTest {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Add the first item you find to your shopping cart :");
        String name = scanner.nextLine();
        seleniumBase base = new seleniumBase();
        ChromeDriver driver = base.seleniumInit("https://www.ebay.com/sch/i.html?_from=R40&_trksid=p4432023.m570.l1313&_nkw="+name+"&_sacat=0");
//        ChromeDriver driver = base.seleniumInit("https://www.ebay.com/sch/i.html?_from=R40&_trksid=p4432023.m570.l1313&_nkw=chair&_sacat=0");
        AddToCart AddToCart = new  AddToCart(driver);

        AddToCart.addItemToCard();




        sleep(3000);


        driver.quit();







    }
}
