package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		//Launch the Browser
		ChromeDriver driver = new ChromeDriver();
		
		//Load the URL
		driver.get("http://leaftaps.com/opentaps");
		
		//Maximize the Browser
		driver.manage().window().maximize();
		
		//Get the title
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Anu");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Baala");
		
		//To select the Source by its Text
		WebElement eleDropDown= driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		Select select = new Select(eleDropDown);
		
		select.selectByVisibleText("Employee");
		
		
		driver.findElement(By.className("smallSubmit")).click();
		
		// print the sourcetext
		String text = driver.findElement(By.id("viewLead_dataSources_sp")).getText();
		//Print Text
		System.out.println("SourceText is " +text);
		
		String title1 = driver.getTitle();
		System.out.println("The Current Window's Title is " +title1);
		
		//driver.close();
		
		
	}

}
