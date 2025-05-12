package MyPackage;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parameters {

	WebDriver driver = new ChromeDriver();
	String website = "https://smartbuy-me.com/account/register";

	Connection con;

	Statement stmt;

	ResultSet rs;

	Random rand = new Random();

	String password = "123!@#asdD";
	String randomIndex = Integer.toString(rand.nextInt(500, 900));

	String QueryToAdd = "insert into customers (customerNumber,customerName, contactLastName, contactFirstName, phone, addressLine1, city, country) values ("
			+ randomIndex
			+ ",'TechCorp', 'soso', 'w hay roro', '+1-555-1234567', '123 Tech Ave', 'Silicon Valley', 'USA')";

	String QueryToUpdate = "update customers set contactFirstName ='mahmoud' where customerNumber =" + randomIndex;

	String ReadQuery = "select * from customers where customerNumber = " + randomIndex;

	String DeleteQuery = "delete from customers where customerNumber = " + randomIndex;

	public void TakeScreenShot() throws IOException {

		Date mynewDate = new Date(); 
		
		System.out.println(mynewDate.toString().replace(":", "-"));
		String fileName = mynewDate.toString().replace(":", "-"); 

		TakesScreenshot ts = (TakesScreenshot) driver;

		File myScreenShot = ts.getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(myScreenShot, new File("./ScreenShotfolder/",fileName+ ".jpg"));

	}
	

}
