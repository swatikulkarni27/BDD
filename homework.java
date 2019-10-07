package homework_argos;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class homework {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:/Users/paipr/Desktop/geckodriver-v0.25.0-win64/geckodriver.exe");
		driver = new FirefoxDriver();

		launchurl();
		christmasoffer();
		under20();
		customerrating();
		relevance();
		item();

	}

	public static void launchurl() {
		driver.get("https://www.argos.co.uk");
	}

	public static void christmasoffer() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,500)");
		WebElement gotit = driver.findElement(By.className("privacy-prompt-footer"));
		gotit.click();
		WebElement christmasoffer = driver.findElement(By.xpath(
				"//a[@class='HomepageComponents__homepage-component__1Eq9N HomepageComponents__homepage-component-12__1BlWL']//picture//img"));
		christmasoffer.click();
		System.out.println("Passed1");
	}

//public static void gotit() throws InterruptedException
//{
	// WebElement gotit = driver.findElement(By.className("privacy-prompt-footer"));
	// gotit.click();
	// Thread.sleep(100);
//}
	public static void under20() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(1000);
		WebElement under20 = driver.findElement(By.xpath("//button[contains(text(),'Under £20')]"));
		under20.click();
		System.out.println("Passed2");
	}

	public static void customerrating() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,1000)");// scroll down
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(-500,0)");
		// WebElement customerrating = driver.findElement(By.className("ac-facet__label
		// ac-facet__label--rating radio__label"));
		WebElement customerrating = driver
				.findElement(By.xpath("//ul[@class='ac-facet__filters ac-facet__filters--rating']//li[2]//label[1]"));
		customerrating.click();
		System.out.println("Passed3");
	}

	public static void relevance() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,-1000)");// scroll up
		((JavascriptExecutor) driver).executeScript("window.scrollBy(-200,0)");// scroll to left
		WebElement relevance = driver.findElement(By.xpath("//select[@class='form-control sort-select']"));
		Select dropdown = new Select(relevance);
		dropdown.selectByVisibleText("Price: High - Low");
		System.out.println("Passed4");
	}

	public static void item() throws InterruptedException {
		Thread.sleep(300);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(-100,0)");
		WebElement item = driver.findElement(By.xpath(
				"//div[contains(@class,'xs-row xs-auto--negative search__content')]//div[1]//div[1]//a[1]//div[1]//div[2]//picture[1]//img[1]"));
		item.click();
		System.out.println("Passed5");
	}

}
