package argos	;	
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import java.io.File;
import java.nio.file.Files;
	

/* public class TestAmazon {
	public static WebDriver driver;
	private static Object input;

	public static void main(String[] args)// method
	{
		System.setProperty("webdriver.gecko.driver",
				"C:/Users/paipr/Desktop/geckodriver-v0.25.0-win64/geckodriver.exe");
		driver = new FirefoxDriver();

		/*
		 * driver.get("https://www.amazon.co.uk/"); WebElement searchBox =
		 * driver.findElement(By.id("twotabsearchtextbox"));
		 * searchBox.sendKeys("waterbottle");
		 * 
		 * WebElement searchButton = driver.findElement(By.className("nav-input"));
		 * searchButton.submit();
		 * 
		 * WebElement clickfreeukdelivery = driver.findElement(By.
		 * xpath("//li[@id='p_76/419159031']//i[@class='a-icon a-icon-checkbox']"));
		 * clickfreeukdelivery.click();
		 * 
		 * }
		 * 
		 * boolean AmazonPrime =
		 * driver.findElement(By.className("nav-right")).isDisplayed(); { if
		 * (AmazonPrime) { System.out.println("30 days free trial available"); }
		 * 
		 * else { System.out.println("30 days free trial not available"); } }
		 * 
		 * 
		 */

/*	launchUrl();
	clickAccount();//
	regUser();//
	emailAddress();//
	Continue();//
}//

/*
* public static void launchUrl() { driver.get("https://www.argos.co.uk/"); }
* 
* public static void clickAccount() { WebElement clickAccount =
* driver.findElement(By.xpath("//span[contains(text(),'Account')]"));
* clickAccount.click(); }
* 
* public static void regUser() { WebElement regUser =
* driver.findElement(By.xpath("//a[@class='button-link']")); regUser.click(); }
* 
* public static void emailAddress() {
* driver.findElement(By.xpath("//input[@id='email-address']")).sendKeys(
* "swati.kulkarni27@gmail.com");
* 
* } public static void Continue() { WebElement clickContinue =
* driver.findElement(By.className("button button--secondary"));
* clickContinue.click();
* 
* }
* 
* 
* }
*/
@SuppressWarnings("unused")
public class argos_original {
	//private static final String MainWindow = null;
	//private static final String FileUtils = null;
	public static WebDriver driver;
	//private static Object input;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:/Users/paipr/Desktop/geckodriver-v0.25.0-win64/geckodriver.exe");
		driver = new FirefoxDriver();

		launchurl();
		product();
		click();
		quantity();
		addtotrolley();
		popup();
		wishlist();
		startshopping();
		stores();
		postcode();
		search();
		trolley();
		delivery();
		continuewithdelivery();
		createnewacc();
		emailaddress();
		register();
		title();
		firstname();
		lastname();
		mobileno();
		housename();
		postcode1();
	}

	public static void launchurl()
	{
		driver.get("https://www.argos.co.uk");
	}

	public static void product() {
		driver.findElement(By.xpath("//input[@id='searchTerm']")).sendKeys("6875136");// entering product no in
		// searchbox
		System.out.println("PASSED1");

	}

	public static void click() {
		// WebElement search = driver.findElement(By.className("_2mKac"));//Not working
		// by classname tried :(
		WebElement search = driver.findElement(By.xpath("//button[@class='_2mKaC']"));
		search.click();
		System.out.println("PASSED2");
	}

	public static void quantity() {
		// WebElement number =
		// driver.findElement(By.className("Buttonstyles__Button-q93iwm-2
		// klBGXd"));//selenium cdnt locate the path//
		// driver.findElement(By.xpath("//div[@class='Selectstyles__SelectArrow-oco5qx-"));//
		// WebElement number =
		// driver.findElement(By.className("selectstles_SelectArrow-oco5qx-5bYoldc"));//
		WebElement number = driver.findElement(By.id("add-to-trolley-quantity"));
		number.sendKeys("2");// acc to guru99 site//
		System.out.println("PASSED3");
	}

	public static void addtotrolley() throws InterruptedException {
		// WebElement att =
		// driver.findElement(By.className("//button[@class='Buttonstyles__Button-q93iwm-2
		// klBGXd']"));//no such element exception
		// WebElement att =
		// driver.findElement(By.xpath("//'Buttonstyles__Button-q93iwm-2
		// klBGXd']"));//invalid selector exception
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scrollBy(0, 500)");
		WebElement att = driver.findElement(By.xpath("//button[@class='Buttonstyles__Button-q93iwm-2 klBGXd']"));
		Thread.sleep(2000);
		att.click();
		System.out.println("PASSED4");
	}

	public static void popup() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scrollBy(0,1000)");// adding this to get the page down
		Thread.sleep(2000);// adding this to get some time for the pop up
		WebElement gotit = driver.findElement(By.className("privacy-prompt-footer"));// cookies got it
		gotit.click();
		WebElement gettotrolley = driver.findElement(By.xpath("//a[@class='Buttonstyles__Button-q93iwm-2 klBGXd']"));
		gettotrolley.click();
		System.out.println("PASSED5");
	}

	public static void wishlist() throws InterruptedException {

		// WebElement heart = driver.findElement(By.className("\"_2wsKA\""));
		WebElement heart = driver.findElement(By.xpath("//span[contains(text(),'Wishlist')]"));
		heart.click();
		Thread.sleep(2000);
		System.out.println("PASSED6");
	}

	public static void startshopping() throws InterruptedException {
		Thread.sleep(2000);
		WebElement shop = driver.findElement(By.xpath("//a[@class='button WishlistEmpty__button__MlafK']"));
		// WebElement shop = driver.findElement(By.cssSelector("main.wishlist-container
		// ul:nth-child(1) div:nth-child(2) li:nth-child(1)
		// div.WishlistEmpty__container__2g_i_ >
		// a.button.WishlistEmpty__button__MlafK"));// tried it with classname and
		// xpath didnt work so used CSS
		shop.click();
		System.out.println("PASSED7");
	}

	public static void stores() {
		WebElement store = driver.findElement(By.className("_3l0Ci"));
		store.click();
		System.out.println("PASSED8");
	}

	public static void postcode() throws InterruptedException {
		WebElement zip = driver.findElement(By.id("searchbox"));
		zip.sendKeys("SS142AU");
		zip.click();
		System.out.println("PASSED9");
	}

	public static void search() throws InterruptedException {
		// Object window;
		// ((JavascriptExecutor)driver).executeScript("window.scrollBy(100,0)");//Scroll
		// towards right to click on magnifying glass
		WebElement maglass = driver.findElement(By.xpath("//button[@class='sc-search-bar-btn btn btn-block']"));
		// WebElement maglass =
		// driver.findElement(By.cssSelector("body.js-enabled:nth-child(2)
		// div.container-fluid:nth-child(2) div.store-locator
		// div.store-locator-loading.store-locator-loading-false div.sl-wrapper.clearfix
		// div.sc-container.container.sc-container-search:nth-child(1) div.sc
		// div.sc-panel div.sc-search:nth-child(2) div.search-block
		// form.sc-search-bar.hidden-print.clearfix >
		// button.sc-search-bar-btn.btn.btn-block"));
		Thread.sleep(2000);
		maglass.click();
		System.out.println("PASSED10");
	}

	public static void trolley() throws InterruptedException {
		Object window;
		((JavascriptExecutor) driver).executeScript("window.scrollBy(5000,0)"); // scroll towards right on trolley
		// WebElement basket =
		// driver.findElement(By.xpath("//span[contains(text(),'Trolley')]"));
		WebElement basket = driver.findElement(By.xpath("//span[contains(text(),'Trolley')]"));
		basket.click();
		System.out.println("PASSED11");
	}

	public static void delivery() throws InterruptedException {
		WebElement zip = driver.findElement(By.xpath(
				"//div[@class='xs-hidden sm-hidden md-block lg-block Basket__maxHeight__DpQL8']//input[@id='basket-FulfilmentSelectorForm']"));
		zip.sendKeys("SS142AU");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,500)"); // scroll down to click on delivery button
		Thread.sleep(2000);
		WebElement deliver = driver.findElement(By.xpath(
				"//div[@class='xs-hidden sm-hidden md-block lg-block Basket__maxHeight__DpQL8']//button[@id='basket-FulfilmentSelectorForm-deliverButton']"));
		deliver.click();
		System.out.println("PASSED12");
	}

	public static void continuewithdelivery() throws InterruptedException // Wasnt working now working fine
	{
		Thread.sleep(2000);
		Object window;
		((JavascriptExecutor) driver).executeScript("window.scrollBy(1000,0)");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,250)");
		WebElement cont = driver.findElement(By.xpath("//span[contains(text(),'Continue with delivery')]"));
		cont.click();
		System.out.println("PASSED13");
	}

	public static void createnewacc() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,250)");// scroll down to click on create acc now link
		WebElement link = driver.findElement(By.xpath("//a[contains(text(),'Create an account now')]"));
		link.click();
		System.out.println("PASSED14");
	}

	public static void emailaddress() {
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("swati.kulkarni27@gmail.com");
		System.out.println("PASSED15");
	}

	public static void register() {
		WebElement regcont = driver
				.findElement(By.xpath("//div[@class='Buttonstyles__ContentContainer-q93iwm-0 bOYfbv']"));
		regcont.click();
		System.out.println("PASSED16");
	}
 	public static void title() throws InterruptedException 
{
	// select the first operator using "select by value"
                  Thread.sleep(5000);
	              WebElement dropdown = driver.findElement(By.id("delivery_personTitle"));
	              dropdown.sendKeys("Mr");
	              System.out.println("PASSED17");
}
 	public static void firstname()
 	{ 
 	//	WebElement firstname = driver.findElement(By.id("delivery_firstname"));//
 		WebElement firstname = driver.findElement(By.xpath("//input[@id='delivery_firstName']"));
		firstname.sendKeys("Swati");
        System.out.println("PASSED18");
 	}
 	public static void lastname()
 	{ 
 		//WebElement lastname = driver.findElement(By.id("delivery_lastName"));//
 		WebElement lastname = driver.findElement(By.xpath("//input[@id='delivery_lastName']"));
		lastname.sendKeys("Kulkarni");
        System.out.println("PASSED19");
 	}
 	public static void mobileno()
 	{ 
 		//WebElement mobileno = driver.findElement(By.id("delivery_phone"));//
 		WebElement mobileno = driver.findElement(By.xpath("//input[@id='delivery_phone']"));
		mobileno.sendKeys("123456789");
        System.out.println("PASSED20");
 	}
 	public static void housename()
 	{ 
 	//	WebElement housename = driver.findElement(By.id("lookupHouseNo"));//
 		WebElement housename = driver.findElement(By.xpath("//input[@id='lookupHouseNo']"));
	    housename.sendKeys("41");
        System.out.println("PASSED19");
 	}
 	public static void postcode1()
 	{ 
 		//WebElement postcode1 = driver.findElement(By.id("lookupPostcode"));//
 		WebElement postcode1 = driver.findElement(By.xpath("//input[@id='lookupPostcode']"));
		postcode1.sendKeys("SS142AU");
        System.out.println("PASSED20");
 	}
 	}
