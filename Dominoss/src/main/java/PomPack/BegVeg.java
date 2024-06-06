package PomPack;


import org.openqa.selenium.By;

import BasePack.BaseClass;


public class BegVeg extends BaseClass {

	public By pepsi = By
			.xpath("//div[@data-label=\"Beverages\"]//div[@data-label=\"Pepsi 475ml\"]//span[text()='ADD TO CART']");

	public By IncreasePepsi = By.xpath("//div[@data-label=\"Pepsi 475ml\"]//div[@data-label=\"increase\"]");

	public By Popup = By.xpath("//button[text()='Allow']");

	public void pepsi() {
		driver.findElement(pepsi).click();
	}

	public void incresePepsi() {
		for (int a = 1; a < 12; a++) {
			driver.findElement(IncreasePepsi).click();
		}
	}
}