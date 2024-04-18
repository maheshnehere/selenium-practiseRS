package website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Facebook {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver","/usr/bin/google-chrome");
        WebDriver driver =  new ChromeDriver();
//        ChromeDriver driver1 = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//input[@name='firstname'][@id='u_2_b_Pi']")).sendKeys("mahesh");
        driver.findElement(By.xpath("//input[@name='lastname'][@id='u_2_d_Z9']")).sendKeys("demo");
        driver.findElement(By.xpath("//*[contains(@id,'u_2_g_Mn')]")).sendKeys("mahesh@gmail.com");
        driver.findElement(By.xpath("//*[contains(@id,'password_step_input')]")).sendKeys("admin@134");


        WebElement birthday = driver.findElement(By.xpath("//select[@name='birthday_day'][@id='day']"));
        Select selectbirthday = new Select(birthday);
        selectbirthday.selectByValue("value='27'"); // select by value
        Thread.sleep(2000);
        selectbirthday.selectByIndex(26);
        Thread.sleep(2000);
        selectbirthday.selectByVisibleText("value='27'");
        Thread.sleep(2000);




    }
}
