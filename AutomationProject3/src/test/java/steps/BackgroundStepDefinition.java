package steps;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.BackgroundPage;
import pages.TestBase;


public class BackgroundStepDefinition extends TestBase {

	BackgroundPage backgroundPage;


	@Given("^User is on the Automation Project website page$")
	public void User_is_on_the_Automation_Project_website_page() {
		initDriver();
		driver.get("https://techfios.com/test/101/");
	}

	@And("^Skyblue Button exists$")
	public void Skyblue_Button_exists() throws InterruptedException   {
		backgroundPage = PageFactory.initElements(driver, BackgroundPage.class);
		backgroundPage.skyblueButtonIsDisplayed();
		Thread.sleep(2000);
	}

	@When("^User clicks on the set sky blue background button$")
	public void User_clicks_on_the_set_sky_blue_background_button() throws InterruptedException   {
		backgroundPage.clickSkyblueButton();
		Thread.sleep(2000);
	}

	@Then("^The background color should change to sky blue$")
	public void The_background_color_should_change_to_sky_blue()  {
		System.out.println("The Background has changed to Skyblue");
	}

	@Given("^White Button exists$")
	public void White_Button_exists() throws InterruptedException  {
		backgroundPage = PageFactory.initElements(driver, BackgroundPage.class);
		backgroundPage.whiteButtonIsDisplayed();
		Thread.sleep(2000);
	}

	@When("^User clicks on the set white background button$")
	public void User_clicks_on_the_set_white_background_button() {
		backgroundPage.clickWhiteButton();
	}

	@Then("^The background color should change to white$")
	public void The_background_color_should_change_to_white()  {
		System.out.println("The Background has changed to White");
	}
	
	
}
