package projectEbayTests.test;

import org.openqa.selenium.chrome.ChromeDriver;
import projectEbayTests.page.checkPerformancePage;
import projectEbayTests.seleniumBase;

public class checkPerformanceTest {
    public static void main(String[] args) throws InterruptedException {

        seleniumBase base = new seleniumBase();
        long startTime = System.currentTimeMillis();
        ChromeDriver driver = base.seleniumInit("https://www.ebay.com/");
        checkPerformancePage PerformancePage = new checkPerformancePage(driver);
        PerformancePage.getPerformance(startTime);


        base.seleniumClose(driver);
    }
}
