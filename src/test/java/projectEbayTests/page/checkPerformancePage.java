package projectEbayTests.page;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class checkPerformancePage {

    private ChromeDriver driver;
    public checkPerformancePage(ChromeDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void getPerformance (long startTime){
        long loadTime = System.currentTimeMillis() - startTime;
        loadTime /= 1000;
        if (loadTime > 4){
            System.out.println("The site does not load in a timely manner." +
                  loadTime + " is not enough fest for load time ");

        }
        else {
            System.out.println("The site does load in a timely manner.");
        }

    }
}
