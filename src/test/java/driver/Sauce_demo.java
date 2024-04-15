package driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sauce_demo {
    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver","/usr/bin/google-chrome");
        WebDriver driver =  new ChromeDriver();
//        ChromeDriver driver1 = new ChromeDriver();
        driver.get("https://www.saucedemo.com/v1/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
//        driver.findElement(By.xpath("//*[@id=\"user-name\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
//        driver.findElement(By.xpath("//*[@id=\"password\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();

        driver.close();
    }
}
