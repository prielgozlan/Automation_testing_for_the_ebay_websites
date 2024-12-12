package projectEbayTests.test;

import projectEbayTests.seleniumBase;
import org.openqa.selenium.chrome.ChromeDriver;
import projectEbayTests.page.createAccountPage;

public class createAccountTest {
    public static void main(String[] args) throws InterruptedException {
        seleniumBase base = new seleniumBase();
        ChromeDriver driver = base.seleniumInit("https://signup.ebay.com/pa/crte?siteid=0&co_partnerId=0&UsingSSL=1&rv4=1&ru=https%3A%2F%2Fwww.ebay.com%2F&signInUrl=https%3A%2F%2Fsignin.ebay.com%2Fsignin%3Fsgn%3Dreg%26siteid%3D0%26co_partnerId%3D0%26UsingSSL%3D1%26rv4%3D1%26ru%3Dhttps%253A%252F%252Fwww.ebay.com%252F&_trksid=p2487285.m5021.l46827");
        createAccountPage createAccount = new createAccountPage(driver);
        createAccount.AccountNew();








        base.seleniumClose(driver);






    }




}
