package pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_PF {
    public static void main(String[] args) {
        System.out.println("new changes in rms-123");
        System.out.println("New changes in Master remote");
    }

    @FindBy(id= "logout_sidebar_link")
    WebElement btn_logout;
    WebDriver driver;
    public HomePage_PF(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public boolean checkLogoutIsDisplayed(){
        driver.findElement(By.id("react-burger-menu-btn")).click();
        return btn_logout.isDisplayed();
    }
}
