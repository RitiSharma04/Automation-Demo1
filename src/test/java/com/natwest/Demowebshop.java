package com.natwest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.datatransfer.SystemFlavorMap;

public class Demowebshop {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\Desktop\\Natwest\\AutomationDemo1\\src\\test\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/register");
        driver.manage().window().maximize();
//        driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
//
//        driver.findElement(By.xpath("//input[@id='gender-male']")).click();
//        driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Mayank");
//        driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Bhardwaj");
//        driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("mayank23@namvgurukul.org");
//        driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("Riti@76546");
//        driver.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys("Riti@76546");
//        driver.findElement(By.xpath("//input[@name='register-button']")).click();
//        driver.findElement(By.xpath("//input[@class='button-1 register-continue-button']")).click();
//        driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
//        driver.findElement(By.xpath("//a[@class='ico-login']")).click();
//        driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("mayank23@namvgurukul.org");
//        driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("Riti@76546");
//        driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
//        driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
//        driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
    }
}
