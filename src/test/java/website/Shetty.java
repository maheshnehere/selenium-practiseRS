package website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;

import java.time.Duration;

public class Shetty {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.edge.driver","/usr/bin/microsoft-edge");
        EdgeOptions opt = new EdgeOptions();
        opt.addArguments("--guest");
        WebDriver driver = new EdgeDriver(opt);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://www.rahulshettyacademy.com/locatorspractice/");

        driver.findElement(By.id("inputUsername")).sendKeys("Mahesh");
        driver.findElement(By.name("inputPassword")).sendKeys("Hello123");
        driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();

        System.out.println(driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/form/p")).getText());

        driver.findElement(By.linkText("Forgot your password?")).click();
       Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("sandesh_nehere");
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("hello1234");
        driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("8362728393");


        driver.findElement(By.cssSelector("button[class='reset-pwd-btn']")).click();
        driver.findElement(By.className("infoMsg")).getText();

        driver.findElement(By.cssSelector("button[class='go-to-login-btn'")).click();

        String username = "Rahul";
        String password = "rahulshettyacademy";

        driver.findElement(By.id("inputUsername")).sendKeys(username);
        driver.findElement(By.name("inputPassword")).sendKeys(password);

        driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/form/div[1]/span[1]/label")).click();
        driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/form/div[1]/span[2]/label")).click();

        driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
        driver.findElement(By.xpath("//p[.='You are successfully logged in.']")).getText();
        Assert.assertEquals(driver.findElement(By.xpath("//p[.='You are successfully logged in.']")).getText(),"You are successfully logged in.");
        driver.findElement(By.xpath("//button[contains(text(),'Log Out')]")).click();
        driver.close();


    }
}
