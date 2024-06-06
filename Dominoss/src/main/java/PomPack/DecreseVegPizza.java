package PomPack;

import org.openqa.selenium.By;

import BasePack.BaseClass;

public class DecreseVegPizza extends BaseClass {


	public By DecreseMagaritaPizza = By.xpath("//*[@id=\"__next\"]/div/div/div[1]/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div/div/div[2]/div/div/div[1]");

	public void DecreseMagaritaPizza() {
		for (int a = 1; a < 2; a++) {
			driver.findElement(DecreseMagaritaPizza).click();
		}

	}
}
