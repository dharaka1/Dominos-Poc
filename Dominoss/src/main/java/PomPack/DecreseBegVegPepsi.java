package PomPack;

import org.openqa.selenium.By;

import BasePack.BaseClass;

public class DecreseBegVegPepsi extends BaseClass {

	public By Decresepepsi = By.xpath("//div[@data-label=\"Pepsi 475ml\"]//div[@data-label=\"decrease\"]");
	public By Popup = By.xpath("//button[text()='Allow']");

	public void Decresepepsi() {
		for (int a = 1; a < 7; a++) {
			driver.findElement(Decresepepsi).click();

		}
	}
}

