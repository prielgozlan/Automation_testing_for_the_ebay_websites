package magento_demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class createProfile {

    public void fullProfile(ChromeDriver driver) throws InterruptedException {
        WebElement loginToAccount = driver.findElement(By.linkText("Sign In"));
        loginToAccount.click();
        WebElement createAccount = driver.findElement(By.linkText("Create an Account"));
        createAccount.click();
        WebElement firstname = driver.findElement(By.id("firstname"));
        firstname.sendKeys("priel");
        WebElement lastname = driver.findElement(By.id("lastname"));
        lastname.sendKeys("gozlan");
        WebElement email_address = driver.findElement(By.id("email_address"));
        email_address.sendKeys("goiiiizlan");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Goiiiizlan1111!");
        WebElement password_confirmation = driver.findElement(By.id("password-confirmation"));
        password_confirmation.sendKeys("Goiiiizlan1111!");
        WebElement showPassword = driver.findElement(By.id("show-password"));
        showPassword.click();

        sleep(3000);


    }
}
