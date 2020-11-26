package TestyBlokow.ReportTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.phptravels.tests.BaseSeleniumTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class ReportTest  {

    public static void main(String[] args) throws IOException {

        ExtentHtmlReporter reporter = new ExtentHtmlReporter("src/test/java/TestyBlokow/ReportTest/index.html");
        ExtentReports reports = new ExtentReports();
        reports.attachReporter(reporter);

        ExtentTest test = reports.createTest("Our First Test");
        test.log(Status.INFO,"First Step");
        test.log(Status.ERROR,"Second Step");
        test.log(Status.DEBUG,"Third Step");
        test.pass("Test passed");
        String testscreenPath = "C:\\Users\\Administrator\\IdeaProjects\\selenium\\src\\test\\resources\\testscreen.png";
         test.pass("Description", MediaEntityBuilder.createScreenCaptureFromPath(testscreenPath).build());
        //test.pass("Description", getScreenShot());
       // test.info("dzsfvg",getScreenShot());
        test.info("info");
        test.fail("fail");
        test.pass("Test passed2");

        reports.flush();
        reporter.flush();


    }
}
