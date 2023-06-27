package org.hcl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\eclipse-workspace\\actions\\Driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://www.greenstechnologys.com/");
WebElement course = driver.findElement(By.xpath("//a[text()='COURSES']"));
Actions a = new Actions(driver);
a.moveToElement(course).build().perform();
}
}
