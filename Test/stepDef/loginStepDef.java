package stepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import org.testng.Assert;





import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginStepDef {
	
	WebDriver driver;
	

	
	@Given("^user is already on Login Page$")
	public void user_already_login_page()
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		driver= new FirefoxDriver();
		driver.get("https://www.monsterindia.com/");
	}
	@When("^title of login page is monster$")
	public void title_of_login_page_is_monster() {
		String title = driver.getTitle();
		 System.out.println(title);
		Assert.assertEquals("Job Vacancy - Latest Job Openings - Job Search Online - Monster India", title);
	  
	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password() {
	
	    driver.findElement(By.xpath("(//a[@class='main-nav-link'])[5]")).click();
	    driver.findElement(By.xpath("//input[@id='signInName']")).sendKeys("chandanavaidya.kg@gmail.com");
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Chanda@2019");
	    
	    
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws InterruptedException  {
	    driver.findElement(By.xpath("//input[@id='signInbtn']")).click();
	    Thread.sleep(3000);
	    String title=driver.getTitle();
	    Assert.assertEquals(title, "Job Vacancy - Latest Job Openings - Job Search Online - Monster India");
	    
	}

	@Then("^user is on home page$")
	public void user_is_on_home_page() {
		
		
			
		
	      
	}

	@Then("^Close the browser$")
	public void close_the_browser() throws InterruptedException{
		
		Thread.sleep(4000);
		WebElement ele = driver.findElement(By.xpath("//span[@class='profile-img-holder']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[.='Logout']")).click();
		driver.close();
	   	    
	}



}
