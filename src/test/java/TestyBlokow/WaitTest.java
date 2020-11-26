package TestyBlokow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WaitTest extends BaseSeleniumTest {

    @Test
    public void waitTest()  {

       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.NANOSECONDS);
        driver.get("file:///C:/pliki_z_kursu/Waits2.html");

        driver.findElement(By.tagName("button")).click();

       // Thread.sleep(4000);

       mySeleniumMethods.waitForWebElementBy(By.tagName("p"),4,driver);


        WebElement paragraph = driver.findElement(By.tagName("p"));

        Assert.assertEquals(paragraph.getText(),"Dopiero się pojawiłem!");

    }

//    private void waitForWebElementBy(By locator,int timeout){
//        Wait<WebDriver> wait = new WebDriverWait(driver,timeout);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
//
//    }

}
