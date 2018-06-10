package createLead;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	public static RemoteWebDriver driver;
	@Given ("Invoke LeafTap Application")
	public void invokeapp() {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://leaftaps.com/opentaps/");
	}
	@And ("Enter the UserName as (.*)")
	public void enterUserName (String uName) {
		driver.findElementById("username").sendKeys(uName);	
	}
	@And ("Enter the Password as (.*)")
	public void enterPassword (String password) {
		driver.findElementById("password").sendKeys(password);
	}
	@And ("Click on Login Button")
	public void clickonLogin () {
		driver.findElementByClassName("decorativeSubmit").click();
	}
	@Then ("Verify the Login is Success")
	public void verifyLogin() {
		System.out.println("Login is Success");
	}
	@And ("Click on Crm/Sfa")
	public void clickCrmsfa() {
	driver.findElementByLinkText("CRM/SFA").click();
	}
	@And ("Click on Create Lead")
	public void clickCreateLead() {
	driver.findElementByLinkText("Create Lead").click();
	}
	@And ("Enter the CompanyName")
	public void enterCompanyName() {
	driver.findElementById("createLeadForm_companyName").sendKeys("Springbord");
	}
	@And ("Enter the FirstName")
	public void enterFirstName() {
	driver.findElementById("createLeadForm_firstName").sendKeys("Ram");
	}
	@And ("Enter the LastName")
	public void enterLastName() {
	driver.findElementById("createLeadForm_lastName").sendKeys("Kumar");
	}
	@When ("Click on CreateLead Button")
	public void clickonCreateLead() {
		driver.findElementByName("submitButton").click();
}
	@Then ("Verify the CreateLead is Success")
	public void verifyCreateLead() {
		System.out.println("Lead Created Successfuly");
	}
}
