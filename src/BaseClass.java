package OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.op

import java.time.Duration;

public class BaseClass {
    public static void click_web(WebDriver driver, By Locator) {
        WebElement element=driver.findElement(Locator);
        wait_element(driver,Locator);
        if(element!=null){
            element.click();
        }
    }

    public static void wait_element(WebDriver driver, By Locator) {
        WebDriverWait wt=new WebDriverWait(driver, Duration.ofSeconds(10));
        wt.until(ExpectedConditions.visibilityOf((driver.findElement(Locator))));

    }

    public static void sendk(WebDriver driver, By Locator, String str) {

        driver.findElement(Locator).sendKeys(str);
    }

    public static void login(WebDriver driver, By Locator , String str) {
        sendk(driver,Locator,str);


    }
}
