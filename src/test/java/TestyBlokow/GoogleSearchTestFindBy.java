package TestyBlokow;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class GoogleSearchTestFindBy extends BaseSeleniumTest {


/*  //Adnotacja FindBy z jednym elementem
    @FindBy (name = "q")
    private WebElement searchInput;

    @Test
    public void googleSearchTest()  {
        PageFactory.initElements(driver,this );

        driver.get("https://google.com");
        driver.switchTo().frame(0);
        WebElement googleButtonAgree = driver.findElement(By.xpath("//span[text()='Zgadzam się']"));
        googleButtonAgree.click();
        //WebElement searchInput = driver.findElement(By.name("q"));
        searchInput.sendKeys("Selenium");
        mySeleniumMethods.takeScreenShot(driver);
        searchInput.sendKeys(Keys.ENTER);
        mySeleniumMethods.takeScreenShot(driver);
        WebElement firstResult = driver.findElement(By.xpath("//div[@class='g']//a"));
        firstResult.click();
        String expectedTitle = "SeleniumHQ Browser Automation";
        Assert.assertEquals(driver.getTitle(),expectedTitle);
*/ //Adnotacja FindBy z jednym elementem

    // Adnotacja FindBY z Lista
    @FindBy (name = "q")
    private List<WebElement> searchInput;

    @Test
    public void googleSearchTest()  {
        PageFactory.initElements(driver,this );

        driver.get("https://google.com");
        driver.switchTo().frame(0);
        WebElement googleButtonAgree = driver.findElement(By.xpath("//span[text()='Zgadzam się']"));
        googleButtonAgree.click();
        //WebElement searchInput = driver.findElement(By.name("q"));
        searchInput.get(0).sendKeys("Selenium");
        mySeleniumMethods.takeScreenShot(driver);
        searchInput.get(0).sendKeys(Keys.ENTER);
        mySeleniumMethods.takeScreenShot(driver);
        WebElement firstResult = driver.findElement(By.xpath("//div[@class='g']//a"));
        firstResult.click();
        String expectedTitle = "SeleniumHQ Browser Automation";
        Assert.assertEquals(driver.getTitle(),expectedTitle);

    }

    // Adnotacja FindBY z Lista
}
