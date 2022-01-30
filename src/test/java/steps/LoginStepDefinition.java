package steps;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.BackgroundColorPage;
import pages.TestBase;

public class LoginStepDefinition extends TestBase {

	BackgroundColorPage backgroundcolorpage;

	@Before
	public void beforeRun() {

		initDriver();
		backgroundcolorpage = PageFactory.initElements(driver, BackgroundColorPage.class);
	}

	@Given("Set SkyBlue Background button exists")
	public void Set_SkyBlue_Background_button_exists() throws InterruptedException {
		backgroundcolorpage.validateSetSkyBlueBackgroundButton();
		Thread.sleep(3000);
	}

	@Given("Set SkyWhite Background button exists")
	public void Set_SkyWhite_Background_button_exists() throws InterruptedException {
		backgroundcolorpage.validateSetWhiteBackgroundButton();
		Thread.sleep(3000);
	}

	@When("^User click on the \"([^\"]*)\" button$")
	public void user_click_on_the_button(String button) throws InterruptedException {
		switch (button) {
		case "Set SkyBlue Background":
			backgroundcolorpage.ClickOnSetBlueBackgroundColorButton();
			Thread.sleep(3000);
			break;
		case "Set SkyWhite Background":
			backgroundcolorpage.ClickOnSetWhiteeBackgroundColorButton();
			Thread.sleep(3000);
			break;
		default:
			System.out.println("unable to click");
			break;
		}
	}

	@Then("the background color will change to sky blue")
	public void the_background_color_will_change_to_sky_blue() throws IOException {
		backgroundcolorpage.verifySkyBlueBackgroundColor();
		takeScreenShot(driver);
	}

	@Then("the background color will change to white")
	public void the_background_color_will_change_to_white() throws IOException {
		backgroundcolorpage.verifyWhiteBackgroundColor();
		takeScreenShot(driver);
	}

	@After
	public void tearDown() {
		driver.close();
		// driver.quit();
	}

}
