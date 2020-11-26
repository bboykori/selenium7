package TestyBlokow;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.List;

public class AnnotationTest extends BaseSeleniumTest{

/* //FindBys
    @FindBys({
            @FindBy(tagName = "table"),
            @FindBy(className = "tableHeader")
    })
    private List<WebElement> elements;

    @Test
    public void googleSearchTest()  {
        PageFactory.initElements(driver,this );
        driver.get("file:///C:/pliki_z_kursu/Test.html");

        System.out.println("Eleemnts size is "+elements.size());


    }

 */ // FindBys

     //FindAll
    @FindAll({
            @FindBy(xpath = "//button"),
            @FindBy(xpath = "//input")
    })
    private List<WebElement> elements;

    @Test
    public void googleSearchTest()  {
        PageFactory.initElements(driver,this );
        driver.get("file:///C:/pliki_z_kursu/Test.html");

        System.out.println("Eleemnts size is "+elements.size());


    }

  // FindAll



}
