package driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sauce_demo_1 {
    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver","/usr/bin/google-chrome");
        WebDriver driver1 =  new ChromeDriver();
//        ChromeDriver driver1 = new ChromeDriver();
        driver1.get("https://www.saucedemo.com/v1/");
        driver1.findElement(By.cssSelector("#user-name")).click();
        driver1.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
        driver1.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
        driver1.findElement(By.cssSelector("#login-button")).click();

        driver1.findElement(By.cssSelector("button.btn__primary--large from__button--floating")).click();


    }
}
