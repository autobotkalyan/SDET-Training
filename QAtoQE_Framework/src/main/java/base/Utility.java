package base;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class Utility
{
    public static String getScreenshot(WebDriver driver)
    {
        TakesScreenshot ts=(TakesScreenshot) driver;

        File src=ts.getScreenshotAs(OutputType.FILE);

        String path="target/failed.png";

        File destination=new File(path);

        try
        {
            FileUtils.copyFile(src, destination);
        } catch (IOException e)
        {
            System.out.println("Capture Failed "+e.getMessage());
        }

        return path;
    }
}
