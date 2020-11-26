package TestyBlokow;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class BaseSeleniumTest {

    protected WebDriver driver;
    protected MySeleniumMethods_old mySeleniumMethods = new MySeleniumMethods_old();

    @BeforeClass
    public void setUp()
    {
        System.out.println("Before test");
        String driverPath = "C:\\Users\\Administrator\\IdeaProjects\\selenium\\src\\test\\resources\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",driverPath);
        Dimension dimension = new Dimension(1800,900);
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @AfterClass
    public void tearDown()
    {
        System.out.println("After test");
        driver.quit();
    }
}
