package TestyBlokow;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.File;

public class FileUploadTest extends BaseSeleniumTest {

    @Test
    public void fileUpLoadTest(){

        driver.get("file:///C:/pliki_z_kursu/FileUpload.html");
        String path = new File("src/test/resources/Teskt.txt").getAbsolutePath();
        driver.findElement(By.id("myFile")).sendKeys(path);

    }
}
