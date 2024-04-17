package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By txt_username=By.id("user-name");
    private By txt_password=By.id("password");
    private By btn_login=By.id("login-button");
    private By btn_logout=By.id("logout_sidebar_link");

    public LoginPage(WebDriver driver){
        this.driver = driver;
//        if(!driver.getTitle().equals("//div[@class='app_logo']")){
//            throw new IllegalStateException("This is not login page. the Current page is "+ driver.getCurrentUrl());
//        }
    }
    public voidd enterUsername(String username){
        driver.findElement(txt_username).sendKeys(username);
    }
    public void enterPassword(String password){
        driver.findElement(txt_password).sendKeys(password);
    }
    public void clickLogin(){
        driver.findElement(btn_login).click();
    }
    public boolean checkLogoutIsDisplayed(){
        driver.findElement(By.id("react-burger-menu-btn")).click();
        return driver.findElement(btn_logout).isDisplayed();
    }
    public void loginValidUser(String username, String password){
        driver.findElement(txt_username).sendKeys(username);
        driver.findElement(txt_password).sendKeys(password);
        driver.findElement(btn_login).click();

    }


}
