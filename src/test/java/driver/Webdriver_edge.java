package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Webdriver_edge {
    public static void main(String[] args) {
        System.setProperty("Webdriver.edge.driver","/usr/bin/microsoft-edge");
        WebDriver driver1 = new EdgeDriver();
        driver1.get("https://www.facebook.com");
        System.out.println(driver1.getTitle());
        System.out.println(driver1.getCurrentUrl());
        driver1.close();
    }
}
