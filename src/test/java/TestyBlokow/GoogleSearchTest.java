package TestyBlokow;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleSearchTest extends BaseSeleniumTest {

    @Test
    public void googleSearchTest()  {
//       driver.get("C:\\pliki_z_kursu\\Test.html");
//        WebElement firstNameInput = driver.findElement(By.id("fname"));
//        WebElement clickOnMeButton = driver.findElement(By.id("clickOnMe"));
//       // WebElement clickOnMeButton2 = ((ChromeDriver) driver).findElementById("clickOnMe");
//        WebElement firstNameInput = driver.findElement(By.name("fname"));
//        WebElement w3SchoolsLink = driver.findElement(By.linkText("Visit W3Schools.com!"));
//        WebElement googlelink = driver.findElement(By.partialLinkText("Weird"));
//        WebElement topSecretParagraph = driver.findElement(By.className("topSecret"));
//        WebElement firstInput = driver.findElement(By.tagName("input"));
//
//        WebElement clickOnMeCssButton = driver.findElement(By.cssSelector("#clickOnMe"));
//
////        WebElement topSecretCss = driver.findElement(By.cssSelector(".topSecret"));
////        WebElement tdFirstChild = driver.findElement(By.cssSelector("td:first-child"));
//
//        WebElement clickOnMeXPathButton = driver.findElement(By.xpath("/html/body/button"));
//        WebElement clickOnMeXPathButton2 = driver.findElement(By.xpath("//button"));
//        WebElement linksXPtah = driver.findElement(By.xpath("//a"));
//        WebElement topSecretXPath = driver.findElement(By.xpath("//p[@class='topSecret']"));
//        WebElement topSecretXPath2 = driver.findElement(By.xpath("//*[@class='topSecret']"));
//        WebElement linkTextXPtah = driver.findElement(By.xpath("//a[text()='Visit W3Schools.com!']"));
//
//        List<WebElement> links = driver.findElements(By.cssSelector("abb"));
//        if (links.size()>0){
//            System.out.println("sa linki");
//        } else {
//            System.out.println("niema linkow");
//        }
//
//        WebElement clickOnMeXPathzFF = driver.findElement(By.xpath("//*[@id=\"clickOnMe\"]"));



//        WebElement clickOnMeButton = driver.findElement(By.id("clickOnMe"));
//        clickOnMeButton.click();
//        Alert alert = driver.switchTo().alert();
//        alert.accept();
//
//        WebElement firstNameInput = driver.findElement(By.id("fname"));
//        firstNameInput.sendKeys("Damian");
//        firstNameInput.clear();
//        firstNameInput.sendKeys("Korecki");

//        Select carSelect = new Select(driver.findElement(By.tagName("select")));
//        carSelect.selectByIndex(1);
//        carSelect.selectByVisibleText("Mercedes");
//        carSelect.selectByValue("audi");
//
//        WebElement firstNameInput = driver.findElement(By.id("fname"));
//        firstNameInput.sendKeys("Damian");
//        System.out.println("Teskt w polu input to "+firstNameInput.getAttribute("value"));
//
//
//        WebElement label = driver.findElement(By.xpath("/html/body/label[2]"));
//        System.out.println("Teskt w labelu to "+label.getText());
//
//        driver.quit();


//        WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
//       // Thread.sleep(3000);
//        checkbox.click();
//       // Thread.sleep(3000);
//        checkbox.click();
//
//        WebElement radioButton = driver.findElement(By.xpath("//input[@value='male']"));
//       // Thread.sleep(3000);
//        radioButton.click();
//        driver.quit();

//        WebElement paragraph = driver.findElement(By.className("topSecret"));
//        System.out.println("Text: "+paragraph.getAttribute("textContent"));

//        WebElement smileImg = driver.findElement(By.id("smileImage"));
//        System.out.println(smileImg.getAttribute("naturalHeight"));
//        System.out.println(smileImg.getAttribute("naturalWidth"));

//        WebElement firstNameInput = driver.findElement(By.id("fname"));
//        if (firstNameInput.isEnabled()){
//            System.out.println("Input enabled");
//            } else {
//
//            System.out.println("Input disabled");
//        }

//        WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
//        if (checkbox.isSelected()){
//            System.out.println("Checkbox zaznaczony");
//
//        } else {
//            System.out.println("Checkbox nieznanaczony");
//        }

//        WebElement topSecretElement = driver.findElement(By.className("topSecret"));
//        if (topSecretElement.isDisplayed()){
//            System.out.println("topSeceret wyswietlony");
//            System.out.println(topSecretElement.getText());
//        } else {
//            System.out.println("topSecret niewyswietlony");
//            System.out.println(topSecretElement.getAttribute("textContent"));
//        }


//        mySeleniumMethods.checkIfElementExist(By.tagName("a"),driver);
//        mySeleniumMethods.checkIfElementExist(By.tagName("afghr"),driver);



//        WebElement newPageButton = driver.findElement(By.id("newPage"));
//        newPageButton.click();
//
//        System.out.println("Tytul to "+driver.getTitle());
//        System.out.println("Url to "+driver.getCurrentUrl());
//        System.out.println("Window handle to "+driver.getWindowHandle());
//        System.out.println("\n");
//
//        String primaryWindowHandle = driver.getWindowHandle();
//        mySeleniumMethods.switchToNewWindow(driver);
//
//        System.out.println("Tytul to "+driver.getTitle());
//        System.out.println("Url to "+driver.getCurrentUrl());
//        System.out.println("Window handle to "+driver.getWindowHandle());
//                driver.switchTo().frame(0);
//        WebElement googleButtonAgree = driver.findElement(By.xpath("//span[text()='Zgadzam się']"));
//        googleButtonAgree.click();
//        WebElement searchInput = driver.findElement(By.name("q"));
//        searchInput.sendKeys("Kori");
//        searchInput.sendKeys(Keys.ENTER);
//
//
//        driver.switchTo().window(primaryWindowHandle);
//
//        System.out.println("Tytul to "+driver.getTitle());
//        System.out.println("Url to "+driver.getCurrentUrl());
//        System.out.println("Window handle to "+driver.getWindowHandle());

//        driver.get("https://google.com");
//        driver.switchTo().frame(0);
//        WebElement googleButtonAgree = driver.findElement(By.xpath("//span[text()='Zgadzam się']"));
//        googleButtonAgree.click();
//        WebElement searchInput = driver.findElement(By.name("q"));
//        searchInput.sendKeys("Kori");
//        searchInput.sendKeys(Keys.ENTER);
//        List<WebElement> results = driver.findElements(By.xpath("//div[@class='g']//a"));
//        System.out.println(results.size());
//
//        for (WebElement result:results
//             ) {
//
//            System.out.println(result.getText());
//
//
//        }

      //  WebElement firstResult = driver.findElement(By.xpath("//div[@class='g']["+results.size()+"]//a"));
      //  firstResult.click();

        driver.get("https://google.com");
        driver.switchTo().frame(0);
        WebElement googleButtonAgree = driver.findElement(By.xpath("//span[text()='Zgadzam się']"));
        googleButtonAgree.click();
        WebElement searchInput = driver.findElement(By.name("q"));
        searchInput.sendKeys("Selenium");
        searchInput.sendKeys(Keys.ENTER);
        WebElement firstResult = driver.findElement(By.xpath("//div[@class='g']//a"));
        firstResult.click();
        String expectedTitle = "SeleniumHQ Browser Automation";
        Assert.assertEquals(driver.getTitle(),expectedTitle);

    }

}
