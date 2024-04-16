package limeroad;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_1 {
    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver", "/usr/bin/google-chrome");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.limeroad.com");
        System.out.println("Website title is : "+driver.getTitle()+" And URL is : "+ driver.getCurrentUrl());
        driver.findElement(By.xpath("//*//*[local-name()='svg'] [@width='41']")).click();





    }
}
