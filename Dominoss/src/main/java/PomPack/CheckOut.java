package PomPack;

import org.openqa.selenium.By;

import BasePack.BaseClass;

public class CheckOut extends BaseClass {
	public By CheckOutbn = By.xpath("//button[@data-label=\"miniCartCheckout\"]");

	public By price1 = By.xpath("(//div[@class=\"price--fnl\"]//span[@class=\"rupee\"])[1]");
	public By price2 = By.xpath("(//div[@class=\"price--fnl\"]//span[@class=\"rupee\"])[2]");
	public By price3 = By.xpath("(//div[@class=\"price--fnl\"]//span[@class=\"rupee\"])[3]");
	public By price4 = By.xpath("(//span[@class=\"rupee\"])[4]");
	public By price5 = By.xpath("(//span[@class=\"rupee\"])[5]");
	public By price6 = By.xpath("(//span[@class=\"rupee\"])[6]");
	public By price7 = By.xpath("(//span[@class=\"rupee\"])[7]");

	public By Popup = By.xpath("//button[text()=\"Don't Allow\"]");

	public void CheckOutbn() {

		implicitWait();
		driver.findElement(CheckOutbn).click();
		driver.findElement(Popup).click();
		String text = driver.findElement(price1).getText();

		System.out.println(text);
		String text2 = driver.findElement(price2).getText();

		System.out.println(text2);
		String text3 = driver.findElement(price3).getText();

		System.out.println(text3);
		String text4 = driver.findElement(price4).getText();

		System.out.println(text4);
		String text5 = driver.findElement(price5).getText();

		System.out.println(text5);
		String text6 = driver.findElement(price6).getText();

		System.out.println(text6);

		String text7 = driver.findElement(price7).getText();

		System.out.println(text7);

	}

}
