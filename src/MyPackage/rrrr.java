package MyPackage;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rrrr {

	public static void main(String[] args) throws IOException {

		
		 TakeScreenShot();
		
	}

	
	public static void TakeScreenShot() throws IOException {
		WebDriver driver = new ChromeDriver(); 

		Date mynewDate = new Date(); 
		
		System.out.println(mynewDate.toString().replace(":", "-"));
		String fileName = mynewDate.toString().replace(":", "-"); 

		TakesScreenshot ts = (TakesScreenshot) driver;

		File myScreenShot = ts.getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(myScreenShot, new File("./ScreenShotfolder/",fileName+ ".jpg"));

	}
}
