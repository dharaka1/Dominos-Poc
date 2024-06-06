package PomPack;

import org.openqa.selenium.By;

import BasePack.BaseClass;

public class HomePage extends BaseClass {
	public By OrderOnline = By.xpath("//button[text()='ORDER ONLINE NOW']");

	public By PinCode = By.xpath("//input[@placeholder=\"Enter your delivery address\"]");

	public By clickonLocateButton = By.xpath("//span[text()='Locate Me']");



	public void OrderOnline() {
		driver.findElement(OrderOnline).click();

	}

	public void PinCode() {
		driver.findElement(PinCode).sendKeys("600078");
		implicitWait();
	}

	public void clickonLocateButton() {
		driver.findElement(clickonLocateButton).click();

	}

}


