package Code._1OpenBrowser;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.sql.Driver;
import java.sql.SQLRecoverableException;


public class _OpenBrowser {
    WebDriver driver;
    @Test
    public void openChromeBrowser() throws InterruptedException {
        //Set Chrome Browser Driver
        System.setProperty("webdriver.chrome.driver", "chromedriver");

        //Create ChromeDriver instance
        WebDriver driver = new ChromeDriver();

        //Open Browser
        driver.get("http://www.gmail.com");

        //Maximize Broswer
        driver.manage().window().maximize();

        Thread.sleep(5000);


        driver.findElement(By.id("identifierId")).sendKeys("bhimbhatta77@gmail.com");
        driver.findElement(By.cssSelector("#identifierNext")).click();

        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("123122");

        driver.findElement(By.cssSelector("#identifierNext")).click();
        Thread.sleep(5000);

        driver.quit();

    }
    @Test
    public void validGmailLogin() throws InterruptedException {
        //Set Chrome Browser Driver
        System.setProperty("webdriver.chrome.driver", "chromedriver");

        //Open Browser
        driver.get("http://gmail.com");

        //Maximize Broswer
        driver.manage().window().maximize();
        Thread.sleep(3000);


        driver.findElement(By.id("identifierId")).sendKeys("qatesting00567@gmail.com");
        driver.findElement(By.cssSelector("#identifierNext")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("Test@123");
        Thread.sleep(3000);

        driver.findElement(By.id("passwordNext")).click();
        Thread.sleep(5000);

        driver.quit();

    }
    @Test
    public void inValidGmailLogin() throws InterruptedException {
        //Set Chrome Browser Driver
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        //Open Browser
        driver.get("http://www.gmail.com");

        //Maximize Broswer
        driver.manage().window().maximize();
        Thread.sleep(3000);

        driver.findElement(By.id("identifierId")).sendKeys("qatesting00567@gmail.com");
        driver.findElement(By.cssSelector("#identifierNext")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("Test@122");
        Thread.sleep(3000);

        driver.findElement(By.id("passwordNext")).click();
        Thread.sleep(5000);

        WebElement text = driver.findElement(By.xpath("//*[text()= 'Wrong password. Try again or click Forgot password to reset it.']"));
        String expectedString = "Wrong password. Try again or click Forgot password to reset it.";

        Assert.assertEquals(expectedString,text.getText());

        driver.quit();

    }

    //@Test
    //public void validUserPassword() throws IOException{
        //Read
       // String gmailUser= getProperty("GMAIL USER");
       // String gmailPassword= getPropertyValue("FACEBOOK_PASSWORD");

       // WebElement email = driver.findElement(By.name("identifier"));
       // email.sendKeys(gmailUser);

       // WebElement bnNext = driver.findElement(By.id("identifierNext"));
       // bnNext.click();

       // WebDriverWait wait = new WebDriverWait(driver,30);
       // WebDriverWait txtpwd = wait.until(ExpectedConditions.visiblityOfElementLocated(by.name("password")));
       // txtpwd.sendKeys(gmailPassword);








    //@Test
    public void openFirefoxbrowser() throws InterruptedException {
        //Set Chrome Browser Driver
        System.setProperty("webdriver.gecko.driver", "geckodriver");

        //Create ChromeDriver instance
        WebDriver driver= new FirefoxDriver();

        //Open Browser
        driver.get("http://www.gmail.com");

        //Maximize Broswer
        driver.manage().window().maximize();

        Thread.sleep(5000);


        driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("bhimbhatta77@gmail.com");
        driver.findElement(By.cssSelector("#identifierNext")).click();

        Thread.sleep(5000);

        driver.quit();

    }

        }


