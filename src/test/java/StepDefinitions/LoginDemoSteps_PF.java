package StepDefinitions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageFactory.HomePage_PF;
import pageFactory.LoginPage_PF;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;

public class LoginDemoSteps_PF {
    WebDriver driver= null;
    LoginPage_PF login;
    HomePage_PF home;

    @io.cucumber.java.en.Given("^browser is open$")
    public void browserIsOpen() {
        System.out.println(" === I am inside LoginDemoSteps_PF Class === ");
        System.out.println(" Inside Step - browser is open ");
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().window().fullscreen();
    }
    @io.cucumber.java.en.And("^user is on login page$")
    public void userIsOnLoginPage() {
        driver.navigate().to("https://www.saucedemo.com/");
    }
    @io.cucumber.java.en.When("^user enters (.*) and (.*)$")
    public void userEntersUsernameAndPassword(String username, String password) throws InterruptedException {
        login = new LoginPage_PF(driver);
        login.enterUsername(username);
        login.enterPassword(password);
        Thread.sleep(2000);
    }
    @io.cucumber.java.en.And("^user clicks on login$")
    public void userClicksOnLogin() {
        login.clickLogin();
    }
    @io.cucumber.java.en.Then("^user is navigated to home page$")
    public void userIsNavigatedToHomePage() throws InterruptedException{
        home= new HomePage_PF(driver);
        home.checkLogoutIsDisplayed();
        Thread.sleep(2000);
        driver.close();
        driver.quit();
    }
}
