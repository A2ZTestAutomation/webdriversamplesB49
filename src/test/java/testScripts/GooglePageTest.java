package testScripts;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class GooglePageTest {
	
  @Test
  public void seleniumSearch() {
	  
//	  ChromeOptions options = new ChromeOptions();
//	  options.setBrowserVersion("120");
//	  WebDriver driver = new ChromeDriver(options);
	  WebDriver driver = new ChromeDriver();
//	  EdgeDriver driver = new EdgeDriver();
	  driver.manage().window().maximize();
//	  driver.manage().deleteAllCookies();
//	  driver.get("https://the-internet.herokuapp.com/login");
	  driver.navigate().to("https://the-internet.herokuapp.com/login");
	  
//	  WebElement name =  driver.findElement(By.id("username"));
	  WebElement name =  driver.findElement(By.cssSelector("input#firstname"));
	  name.sendKeys("tomsmith");
	  WebElement pwd = driver.findElement(By.name("password"));
	  pwd.sendKeys("SuperSecretPassword!");
//	  WebElement btnLogin = driver.findElement(By.className("radius"));
//	  WebElement btnLogin = driver.findElement(By.cssSelector("button.radius"));
//	  WebElement btnLogin = driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']"));
	  WebElement btnLogin = driver.findElement(By.cssSelector("i.fa.fa-2x.fa-sign-in"));
//	  WebElement btnLogin = driver.findElement(By.tagName("button"));
	  btnLogin.click();
	  
//	  driver.navigate().back();
//	  System.out.println(driver.getTitle());
//	  System.out.println(driver.getCurrentUrl());
//	  driver.navigate().forward();
//	  System.out.println(driver.getCurrentUrl());
	  
//	  driver.findElement(By.linkText("Elemental Selenium")).click();
//	  driver.findElement(By.partialLinkText("Elemental")).click();
	  
	  
	  
  }
}
