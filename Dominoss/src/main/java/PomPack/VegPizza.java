package PomPack;

import org.openqa.selenium.By;

import BasePack.BaseClass;

public class VegPizza  extends BaseClass{
	public By GouurmentPizza = By.xpath(
			"//div[@class=\"menu-cnt\"]//child::div[@data-label=\"Veg Pizza\"]//descendant::div[@data-label=\"Primavera Gourmet-Pizza\"]//descendant::button[@data-label=\"addTocart\"]");

	public By IncreseGourmentPizza = By.xpath("//div[@class=\"crt-cntnt\"]//div[@data-label=\"increase\"]");

	public By MargaitaPizza = By.xpath(
			"//div[@class=\"menu-cnt\"]//child::div[@data-label=\"Veg Pizza\"]//descendant::div[@data-label=\"Margherita\"]//descendant::button[@data-label=\"addTocart\"]");

	public By IncreaseMargitaPizza = By.xpath("(//div[@class=\"injectStyles-sc-1jy9bcf-0 gwKvJy\"])[4] ");
	public By PeppyPannerPizza = By.xpath(
			"//div[@class=\"menu-cnt\"]//child::div[@data-label=\"Veg Pizza\"]//descendant::div[@data-label=\"Peppy Paneer\"]//descendant::button[@data-label=\"addTocart\"]");

	public By CheesePopup = By.xpath("//span[text()='ADD']");

	public By IncreasePeppyPanner = By.xpath(
			"//div[@class=\"menu-cnt\"]//div[@data-label=\"Veg Pizza\"]//div[@data-label=\"Peppy Paneer\"]//div[@data-label=\"increase\"]");

	public void GouurmentPizza() {
		implicitWait();
		driver.findElement(GouurmentPizza).click();
	}

	public void increseGourmentPizza() {
		for (int a = 1; a < 2; a++) {
			driver.findElement(IncreseGourmentPizza).click();

		}

	}

	public void MargaitaPizza() {
		implicitWait();
		driver.findElement(MargaitaPizza).click();
		driver.findElement(CheesePopup).click();

	}

	public void AddMargaitaPizza() {
		implicitWait();
		for (int a = 1; a < 2; a++) {
			driver.findElement(IncreaseMargitaPizza).click();
		}

	}

	public void PeppyPannerPizza() {
		implicitWait();
		driver.findElement(PeppyPannerPizza).click();
		driver.findElement(CheesePopup).click();

	}

	public void IncreasePeppyPanner() {
		for (int a = 1; a < 2; a++) {
			driver.findElement(IncreasePeppyPanner).click();

		}
	}
}

