package week2.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadAll {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Amazon");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Anu");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Baala");
		WebElement element = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select select = new Select(element);
		select.selectByVisibleText("Partner");
		WebElement element2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select mar = new Select(element2);
		mar.selectByVisibleText("Car and Driver");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Anu");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Bala");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Ms");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("16/12/1983");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Sr Associate");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Alexa comms");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("9LPA");
		WebElement element5 = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select currency = new Select(element5);
		currency.selectByVisibleText("INR - Indian Rupee");
		WebElement element4 = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select indus = new Select(element4);
		indus.selectByVisibleText("Computer Software");
		WebElement element8 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select owner = new Select(element8);
		owner.selectByValue("OWN_PUBLIC_CORP");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("1111");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Hello this Anu");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Thank you");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("5");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("@@");
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("03");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("641034");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("00001");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("anu.balasubramanian6@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9894716128");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Anu");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("http://www.amazon.com/");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("XXXXX");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("YYYYYYY");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("9/57,VKL Nagar, Thudiyalur");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("9/57,VKL Nagar, Thudiyalur, Coimbatore 641034");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("coimbatore");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("641034");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("6410340");
		
		WebElement element6 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select country = new Select(element6);
		country.selectByVisibleText("United States");
		WebElement element7 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select state = new Select(element7);
		state.selectByVisibleText("Washington");
		driver.findElement(By.name("submitButton")).click();
		//driver.close();

	}

}
