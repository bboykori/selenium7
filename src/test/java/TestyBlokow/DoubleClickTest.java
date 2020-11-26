package TestyBlokow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DoubleClickTest extends  BaseSeleniumTest{

    @Test
    public void doubleClickTest(){
        driver.get("file:///C:/pliki_z_kursu/DoubleClick.html");
        WebElement button = driver.findElement(By.id("bottom"));
        Actions actions = new Actions(driver);
        actions.doubleClick(button).build().perform();
        Assert.assertTrue(driver.getWindowHandles().size()>1);

         mySeleniumMethods.takeScreenShot(driver);




    }
}
