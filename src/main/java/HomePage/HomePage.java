package HomePage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HomePage {
	public WebDriver driver;


	public HomePage(WebDriver driver ){
		driver = new ChromeDriver();
		this.driver = driver;
	}

	public void loadHomePage(){
		driver.get("https://www2.correios.com.br/sistemas/rastreamento/default.cfm");
		driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
	}

}
