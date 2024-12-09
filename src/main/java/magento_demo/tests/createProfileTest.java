package magento_demo.tests;

import magento_demo.pages.createProfile;
import magento_demo.seleniumBase;
import org.openqa.selenium.chrome.ChromeDriver;

public class createProfileTest {
    public static void main(String[] args) throws InterruptedException {
        createProfile create = new createProfile();
        seleniumBase base = new seleniumBase();
        ChromeDriver driver = base.seleniumInit("https://magento-demo.mageplaza.com/");
        create.fullProfile(driver);




        base.seleniumClose(driver);
    }
}
