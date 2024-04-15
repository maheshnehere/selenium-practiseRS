package website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Linked_in {
    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver", "/usr/bin/google-chrome");
        WebDriver driver = new ChromeDriver();
        //wait for error message as it takes few seconds to display
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.linkedin.com/uas/login?session_redirect=https%3A%2F%2Fwww.linkedin.com%2Ffeed%2F");

        driver.findElement(By.cssSelector("input#username")).sendKeys("maheshnehere");
        driver.findElement(By.cssSelector("input#password")).sendKeys("12345667");
        driver.findElement(By.xpath("//*[@id=\"organic-div\"]/form/div[3]/button")).click();
        //error message display
        System.out.println(driver.findElement(By.id("error-for-username")).getText());

        driver.close();


    }
}
