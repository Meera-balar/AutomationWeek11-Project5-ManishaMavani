package utimateqatest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class MicrosoftEdgeBrowserTest {
    //Main method declaration
    public static void main(String[] args) {
        // ultimateqa Url stored in variable baseUrl
        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        //setup key-value for edge browser
        System.setProperty("webdriver.edge.driver" , "drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        //Launch the Url
        driver.get(baseUrl);
        //Maximize window
        driver.manage().window().maximize();
        //We give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // get the page title
        System.out.println("Page title is :  " + driver.getTitle());
        //Get the current Url
        System.out.println("Current url is : " + driver.getCurrentUrl());
        //Get the page source
        System.out.println("page ource is : " + driver.getPageSource());

        //Find the email field element
        WebElement usernameField = driver.findElement(By.id("user[email]"));
        //Enter email to email Field
        usernameField.sendKeys("Manishamavani25@gmail.com");
        //Find the password field element
        WebElement passwordField = driver.findElement(By.id("user[password]"));
        //Enter password to password field
        passwordField.sendKeys("123456Mani");
        //close the browser
        driver.quit();

    }
}
