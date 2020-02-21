package Code.Table;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.lang.reflect.Array;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

public class _1sumMarks {
    WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/sql/sql_count_avg_sum.asp");
        driver.manage().window().maximize();
    }
    //@Test
    public void sumTable() {

        double sum = 0.00;
        double expectedSum = 90.35;

        List<WebElement> elem1 = driver.findElements(By.xpath("//*[@id=\"main\"]/div[6]/table/tbody/tr/td[6]"));
        for (WebElement row: elem1)
        {
            double no = Double.parseDouble(row.getText());
            sum= sum + no;
        }
        Assert.assertEquals(sum,expectedSum,2);
    }
    @Test

    public void printNames()throws InterruptedException{

        ArrayList<String>expectedList = new ArrayList<String>();
        expectedList.add("Cha");
        expectedList.add("cha");
        expectedList.add("Aniseed Syr");
        expectedList.add("Chef Anton's Can Seasoning");
        expectedList.add("chef Anto's guo Mix");

        List<WebElement>productName = driver.findElements(By.xpath("//*[@id=\"main\"]/div[6]/table/tbody/tr/td[2]"));
        ArrayList<String>acutalResult = new ArrayList<>();
        for ( int i =0; i<=productName.size(); i++) {
            String listText = productName.get(i).getText();
            acutalResult.add(listText);
        }
        Assert.assertEquals(expectedList,acutalResult);
    }

    @After
    public void exit(){driver.quit();}
}

