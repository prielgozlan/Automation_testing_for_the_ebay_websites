package magento_demo.tests;

import magento_demo.pages.login;
import magento_demo.seleniumBase;
import org.openqa.selenium.chrome.ChromeDriver;

public class testLogin {
    public static void main(String[] args) throws InterruptedException {
        login log = new login();
        seleniumBase base = new seleniumBase();
        ChromeDriver driver = base.seleniumInit("https://magento-demo.mageplaza.com/");
        log.loginToCreateAccount(driver);


        base.seleniumClose(driver);







    }
}
