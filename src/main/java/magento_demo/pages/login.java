package magento_demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class login {
    public void loginToCreateAccount(ChromeDriver driver) throws InterruptedException {

        WebElement loginToAccount = driver.findElement(By.linkText("Sign In"));
        loginToAccount.click();
        WebElement createAccount = driver.findElement(By.linkText("Create an Account"));
        createAccount.click();






    }
}
