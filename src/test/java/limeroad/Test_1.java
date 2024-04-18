package limeroad;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test_1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver", "/usr/bin/google-chrome");
        WebDriver driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.get("https://www.limeroad.com");
        System.out.println("Website title is : "+driver.getTitle()+" And URL is : "+ driver.getCurrentUrl());
        driver.findElement(By.xpath("//*//*[local-name()='svg'] [@width='41']")).click();
        Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));






    }
}
