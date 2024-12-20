package mkppl_oqtestcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureScreenshot {

    public static void main(String[] args) throws IOException {
        
        // Setting up ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();
        
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        
        // Full Page Screenshot
        TakesScreenshot tss = (TakesScreenshot)driver;
        File src = tss.getScreenshotAs(OutputType.FILE);
        File trg = new File(".\\Screenshots\\homepage.png");
        FileUtils.copyFile(src, trg);
        
        driver.close();
    }
}
