package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BackgroundPage extends TestBase {

	WebDriver driver;

	public BackgroundPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = " //div[@id='header-content']") WebElement HEADER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id='extra']/button[1]") WebElement SKYBLUE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id='extra']/button[2]") WebElement WHITE_ELEMENT;

	public void clickSkyblueButton() {
		SKYBLUE_ELEMENT.click();
	}

	public void skyblueButtonIsDisplayed() {
		SKYBLUE_ELEMENT.isDisplayed();
		if(SKYBLUE_ELEMENT.isDisplayed()) {
			System.out.println("skyblue button exists");
		}else {
			System.out.println("skyblue button does not exists ");
		}
	}

	public void clickWhiteButton() {
		WHITE_ELEMENT.click();
	}

	public void whiteButtonIsDisplayed() {
		WHITE_ELEMENT.isDisplayed();
		if(WHITE_ELEMENT.isDisplayed()) {
			System.out.println("white button exists");
		}else {
			System.out.println("white button does not exists");
		}
	}


}
