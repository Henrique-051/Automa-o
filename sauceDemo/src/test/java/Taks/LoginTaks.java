package Taks;

import PageObjects.LoginPage;
import org.openqa.selenium.WebDriver;

public class LoginTaks {

    private WebDriver driver;
    private LoginPage loginPage;

    public LoginTaks (WebDriver driver){

        this.driver = driver;
        loginPage = new LoginPage(this.driver);
    }

    public void efetuarLogin() throws InterruptedException {
        loginPage.getUserNameInput().sendKeys("standard_user");
        Thread.sleep(5000);
        loginPage.getUserPasswordInput().sendKeys("standard_sauce");
        Thread.sleep(5000);
        loginPage.getLoginButton().click();
    }
}
