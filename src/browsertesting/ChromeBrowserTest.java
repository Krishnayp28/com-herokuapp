package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {

    public static void main(String[] args) {

        String  baseUrl = "http://the-internet.herokuapp.com/login";
        // launch the Chrome browser
        WebDriver driver = new ChromeDriver();
        // open the URL into Browser
        driver.get(baseUrl);
        // Maximise the Browser
        driver.manage().window().maximize();
        // We give Implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        // Get the Tittle of the page
        String tittle = driver.getTitle();
        System.out.println(tittle);
        //Get the current URL
        System.out.println("Current URL :" +driver.getCurrentUrl());
        // Get page Source
        System.out.println("Page Source :" + driver.getPageSource());
        // Find the UserName field element and type the Username
        driver.findElement(By.id("username")).sendKeys("Jigna");
        // Fine the Password field element and type the Password
        driver.findElement(By.name("password")).sendKeys("jigna123");

        // Close the Browser
        driver.close();














    }
}
