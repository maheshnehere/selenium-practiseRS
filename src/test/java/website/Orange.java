package website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.time.Duration;

public class Orange {
    public static void main(String[] args) {

        System.setProperty("Webdriver.edge.driver","/usr/bin/microsoft-edge");
        EdgeOptions opt = new EdgeOptions();
        opt.addArguments("--guest");
        WebDriver driver = new EdgeDriver(opt);

        driver.manage().deleteAllCookies();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));

        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();


    }
}
