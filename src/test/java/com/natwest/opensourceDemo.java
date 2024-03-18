package com.natwest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class opensourceDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\Desktop\\Natwest\\AutomationDemo1\\src\\test\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//        driver.findElement(By.xpath("input[@class='oxd-input oxd-input--active']")).sendKeys("Admin");
//        driver.findElement(By.xpath("input[@type='password']")).sendKeys("admin123");
//        driver.findElement(By.xpath("button[@type=\"submit\"]")).click();
//        driver.findElement(By.xpath())
//        driver.findElement(By.xpath())
//        driver.findElement(By.xpath())
//        driver.findElement(By.xpath())
//        driver.findElement(By.xpath())
//        driver.findElement(By.xpath())
//        driver.findElement(By.xpath())
    }
}
