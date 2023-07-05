package stepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	WebDriver driver;
	
	@Given("I want to launch the browser")
	public void i_want_to_launch_the_browser() {
		//WebDriverManager.edgedriver().setup();
		//driver=new EdgeDriver();
	   //ChromeOptions opt=new ChromeOptions();
		//opt.addArguments("--remote-allow-origins=*");
		//driver=new ChromeDriver(opt);
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
	    
	}
	@Given("I want to load the URL")
	public void i_want_to_load_the_url() {
		driver.get("http://localhost:8888/");
		
	    
	}
	@When("Login page is displayed enter UserName and Password")
	public void login_page_is_displayed_enter_user_name_and_password() {
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		
	    
	}
	@When("Click On Login")
	public void click_on_login() {
		driver.findElement(By.id("submitButton")).click();
	   
	}
	@When("homepage is displayed")
	public void homepage_is_displayed() {
	   
	}
	//@Then("validate for homepage")
	//public void validate_for_homepage() {
	   
	}


//login success
