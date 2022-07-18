package test;

import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExerciseOneWikipediaTest {
	
	private WebDriver driver;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://en.wikipedia.org/wiki/Main_Page");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void searchingWikipediaTest() {
		WebElement searchBox =  driver.findElement(By.id("searchInput"));
		searchBox.sendKeys("Voyager 1");
		searchBox.submit();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement title = driver.findElement(By.xpath("/html/body/div[3]/h1"));
		Assert.assertTrue(title.getText().contains("Voyager 1"));
	}
	
	@After
	public void breakDown() {
		driver.close();
	}

}
