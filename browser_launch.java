package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class browser_launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		ChromeOptions CO=new ChromeOptions();
		CO.addArguments("--remote-allow-origins=*");
		WebDriver js=new ChromeDriver(CO);
		js.get("https://www.amazon.in/");
		js.manage().window().maximize();
		WebElement login=js.findElement(By.xpath("//*[@id=\"nav-signin-tooltip\"]/a/span"));
		login.click();
		WebElement mobno=js.findElement(By.id("ap_email"));
			mobno.click();
			mobno.sendKeys("9629058515");
			WebElement con=js.findElement(By.id("continue"));
			con.click();
			WebElement pass=js.findElement(By.id("ap_password"));
			pass.click();
			pass.sendKeys("Saibaba+0124");
			
			WebElement sing=js.findElement(By.id("signInSubmit"));
			sing.click();		

	}

}
