package pages;

import java.util.NoSuchElementException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BackgroundColorPage {

	WebDriver driver;

	public BackgroundColorPage(WebDriver driver) {
		this.driver = driver;
	}

	// Element Library
	@FindBy(how = How.CSS, using = "button[onclick=\"myFunctionSky()\"]")
	WebElement SET_SKYBLUE_BACKGROUND_BUTTON;
	@FindBy(how = How.CSS, using = "button[onclick=\"myFunctionWhite()\"]")
	WebElement SET_WHITE_BACKGROUND_BUTTON;
	@FindBy(how = How.CSS, using = "body[style='background-color: skyblue;']")
	WebElement BACKGROUND_BLUEBODY_ELEMENT;
	@FindBy(how = How.CSS, using = "body[style=\"background-color: white;\"]")
	WebElement BACKGROUND_WHITEBODY_ELEMENT;

	// Methods

	public void validateSetSkyBlueBackgroundButton() {
		if (SET_SKYBLUE_BACKGROUND_BUTTON.isDisplayed()) {
			System.out.println("SetSkyBlueBackgroundButton is displayed");
		} else {
			System.out.println("SetSkyBlueBackgroundButton is not displayed");
		}
		Assert.assertTrue(SET_SKYBLUE_BACKGROUND_BUTTON.isDisplayed());
	}

	public void validateSetWhiteBackgroundButton() {
		if (SET_WHITE_BACKGROUND_BUTTON.isDisplayed()) {
			System.out.println("SetWhiteBackgroundButton is displayed");
		} else {
			System.out.println("SetWhiteBackgroundButton  is not displayed");
		}
		Assert.assertTrue(SET_WHITE_BACKGROUND_BUTTON.isDisplayed());
	}

	public void ClickOnSetBlueBackgroundColorButton() {
		SET_SKYBLUE_BACKGROUND_BUTTON.click();
	}

	public void ClickOnSetWhiteeBackgroundColorButton() {
		SET_WHITE_BACKGROUND_BUTTON.click();
	}

	public void verifySkyBlueBackgroundColor() {

		String expected = "#87ceeb";//SkyBlue
		String bgColor = BACKGROUND_BLUEBODY_ELEMENT.getCssValue("background-color");
		String bgcolorHexa = Color.fromString(bgColor).asHex();
		System.out.println("BackgroundColor of the WebPage is SkyBlue :" + bgcolorHexa);
		String actual = bgcolorHexa;
		Assert.assertEquals(expected, actual);

	}

	public void verifyWhiteBackgroundColor() {

		String expected = "#ffffff";//White Color
		String bgColor = BACKGROUND_WHITEBODY_ELEMENT.getCssValue("background-color");
		System.out.println("BackgroundColor:" + bgColor);
		String bgcolorHexa = Color.fromString(bgColor).asHex();
		System.out.println("BackgroundColor of the WebPage is White :" + bgcolorHexa);
		String actual = bgcolorHexa;
		Assert.assertEquals(expected, actual);

	}

}
