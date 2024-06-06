package StepPack;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import BasePack.BaseClass;
import PomPack.BegVeg;
import PomPack.CheckOut;
import PomPack.DecreseBegVegPepsi;
import PomPack.DecreseVegPizza;
import PomPack.HomePage;
import PomPack.TotalPrice;
import PomPack.VegPizza;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepClass extends BaseClass {

	HomePage hp = new HomePage();

	CheckOut ck = new CheckOut();

	DecreseBegVegPepsi ps = new DecreseBegVegPepsi();

	DecreseVegPizza dp = new DecreseVegPizza();

	BegVeg bg = new BegVeg();

	TotalPrice t = new TotalPrice();

	VegPizza p = new VegPizza();

	@Given("User launch the {string} Browser")
	public void user_launch_the_browser(String Browser) throws IOException {


          
		if (Browser.equalsIgnoreCase("Chrome")) {			

			   driver = new ChromeDriver();
			   

		 } else if (Browser.equalsIgnoreCase("edge")) {

		         driver = new EdgeDriver();
     
		 } 
		 else if (Browser.equalsIgnoreCase("FireFox")) {
			 driver = new FirefoxDriver();
			
		}
		 else {
			 System.out.println("No browsers were found");
		}
		
		driver.manage().window().maximize();
		
	}

	@When("User Launch Url")
	public void user_launch_url() throws IOException {

		geturl("https://www.dominos.co.in/");

		ScreenShort(driver, "Screen1");
	}

	@When("User click the online order")
	public void user_click_the_online_order() throws IOException {

		hp.OrderOnline();

		ScreenShort(driver, "Screen2");
	}

	@When("User select the delivery loaction")
	public void user_select_the_delivery_loaction() throws IOException {

		hp.PinCode();

		ScreenShort(driver, "Screen3");

		hp.clickonLocateButton();

	}

	@When("User add the {string}")
	public void user_add_the(String GouurmentPizza) {

		implicitWait();

		p.GouurmentPizza();

		p.increseGourmentPizza();
	}

	@When("User2 add the {string}")
	public void user2_add_the(String MargaitaPizza) {

		implicitWait();

		p.MargaitaPizza();

		p.AddMargaitaPizza();
	}

	@When("user3 add the {string}")
	public void user3_add_the(String PeppyPannerPizza) {

		implicitWait();

		p.PeppyPannerPizza();

		p.IncreasePeppyPanner();
	}

	@When("User checking the cart total")
	public void user_checking_the_cart_total() {

		implicitWait();

		t.GourmemtPizzaPrice();

		t.MarginataPizzaPrice();

		t.PeppyPannerprice();
	}

	@When("User4 add the {string}")
	public void user4_add_the(String string) throws IOException {

		implicitWait();

		bg.pepsi();

		bg.incresePepsi();

		ScreenShort(driver, "Screen4");
	}

	@When("User5 removing the {string}")
	public void user5_removing_the(String string) {

		implicitWait();

		ps.Decresepepsi();
	}

	@When("User6 removing the {string}")
	public void user6_removing_the(String string) {

		dp.DecreseMagaritaPizza();
	}

	@Then("User checking the cart total and click the checkout")
	public void user_checking_the_cart_total_and_click_the_checkout() throws IOException {

		CheckOut ck = new CheckOut();

		ck.CheckOutbn();

		ScreenShort(driver, "Screen5");
	}
}
