package PomPack;

import org.openqa.selenium.By;

import BasePack.BaseClass;

public class TotalPrice extends BaseClass {

public By GourmemtPizzaPrice = By.xpath("(//div[@class=\"crt-itms\"]//span[@class=\"rupee\"])[1]");

public By MarginataPizzaPrice = By.xpath("(//div[@class=\"crt-itms\"]//span[@class=\"rupee\"])[2]");

public By PeppyPannerprice = By.xpath("(//div[@class=\"crt-itms\"]//span[@class=\"rupee\"])[3]");

public By pepsiPrice = By.xpath("(//div[@class=\"crt-itms\"]//span[@class=\"rupee\"])[4]");

public By TotalAmt = By.xpath("//div[@class='menu-cnt']//div[@class='menu-right']//span[@class='rupee sb-ttl']");

public void GourmemtPizzaPrice() {
	implicitWait();
	driver.findElement(GourmemtPizzaPrice).getText();

}

public void MarginataPizzaPrice() {
	implicitWait();
	driver.findElement(MarginataPizzaPrice).getText();

}

public void PeppyPannerprice() {
	implicitWait();
	driver.findElement(PeppyPannerprice).getText();

}

//public void pepsiPrice()
//{
//	implicitWait();
//	driver.findElement(pepsiPrice).getText();
//	
//}
public void TotalAmt() {
	implicitWait();
//	driver.findElement(TotalAmt).getText();

	String Amt1 = driver.findElement(GourmemtPizzaPrice).getText();
	String Amt2 = driver.findElement(MarginataPizzaPrice).getText();
	String Amt3 = driver.findElement(PeppyPannerprice).getText();
	String Amt4 = driver.findElement(pepsiPrice).getText();
	String total_amt = driver.findElement(TotalAmt).getText();

	float amount1 = Float.parseFloat(Amt1);
	System.out.println(amount1);

	Float amount2 = Float.parseFloat(Amt2);
	System.out.println(amount2);

	Float amount3 = Float.parseFloat(Amt3);
	System.out.println(amount3);

	Float amount4 = Float.parseFloat(Amt4);
	System.out.println(amount4);
	Float TotalAmt = Float.parseFloat(total_amt);

	Float total = amount1 + amount2 + amount3 + amount4;

	System.out.println(TotalAmt + ", " + total);
}
}
