package Annotation_Test;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;

public class AnnotationTest {
	WebDriver driver;

	@Test(priority = 1)
	public void inscription_test() {
		driver.findElement(By.id("ACCOUNT")).click();
		driver.findElement(By.xpath(
				"//ul[@class='dropdown-menu show']//a[@class='dropdown-item waves-effect'][normalize-space()='Customer Signup']"))
				.click();
	}

	@Test(priority = 2)
	public void remplir_formulaire()  {
		
		driver.findElement(By.name("first_name")).sendKeys("Naimi");
		

	}

	@BeforeTest
	public void ope_browser() {
		
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://phptravels.net/");
		driver.manage().window().maximize();

	}

	@AfterTest
	public void afterTest() {
		System.out.println("Test terminer");
		
	}

}
