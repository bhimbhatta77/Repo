package Code.Table;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.sql.Driver;

public class _newProject {
    WebDriver driver;

    @Before
    public void setup (){
        System.setProperty("webdriver.chome.driver", "chromedriver" );
        driver = new ChromeDriver();
        driver.get("https://www.toolsqa.com/automation-practice-form/");
        driver.manage().window().maximize();
    }
//    //@Test
//    public void verifyPartialLink() throws InterruptedException{
//        String expectedPartialLink = "Partial Link Test";
//        String actualText = driver.findElement(By.partialLinkText("Partial")).getText();
//        Thread.sleep(3000);
//        System.out.println(actualText);
//        Assert.assertEquals(expectedPartialLink,actualText);
//
//    }
//        @Test
//     public void verifyLinkTest() throws InterruptedException {
//            String expectedTextlink = "Link Test";
//            String actualTextlink = driver.findElement(By.linkText("Link Test")).getText();
//            Thread.sleep(3000);
//            System.out.println(actualTextlink);
//            Assert.assertEquals(expectedTextlink, actualTextlink);
//
//            driver.findElement(By.name("firstname")).sendKeys("Bhim");
//            Thread.sleep(3000);
//
//            driver.findElement(By.id("lastname")).sendKeys("Bhattarai");
//            Thread.sleep(3000);
//
//            driver.findElement(By.id("sex-0")).click();
//            Thread.sleep(3000);
//
//             driver.findElement(By.id("datepicker")).sendKeys("02.22.2020");
//             Thread.sleep(3000);
//
//             driver.findElement(By.id("profession-1")).click();
//             Thread.sleep(3000);
//        }


        @Test
         public void YearsOfExperience () throws InterruptedException  {
             JavascriptExecutor js = (JavascriptExecutor) driver;
             WebElement radio = driver.findElement(By.xpath("")  ;
             js.executeScript("window.scrollby(0,1000))");
             Actions actions = new Actions(driver);
            actions.moveToElement(radio).click().build().perform();
            Thread.sleep(3000);


            //driver.findElement(By.id("datepicker")).sendKeys("02.22.2020");
            }




        





    }





