package demo1;

import org.openqa.selenium.chrome.ChromeDriver;

public class verifytitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","chromedriver.exe");
ChromeDriver driver = new ChromeDriver();
driver.get("https://www.website.com/sign-in/");
	}

}
