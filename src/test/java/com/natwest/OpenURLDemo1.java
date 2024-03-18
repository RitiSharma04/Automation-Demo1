package com.natwest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenURLDemo1 {
    public static void main(String[] args) throws InterruptedException {
        // Set the system property to locate the ChromeDriver executable file
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\Desktop\\Natwest\\AutomationDemo1\\src\\test\\chromedriver.exe");

        // Initialize a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver .findElement(By.name("password")).sendKeys("admin123");
//        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
//        // Navigate to the first URL
//        driver.get("https://spring.io/quickstart");
//
//        // Wait for 2 seconds
//        Thread.sleep(2000);
//
//        // Navigate to the second URL
//        driver.navigate().to("https://spring.io/why-spring");
//
//        // Wait for 2 seconds
//        Thread.sleep(2000);
//
//        // Navigate back
//        driver.navigate().back();
//
//        // Wait for 2 seconds
//        Thread.sleep(2000);
//
//        // Navigate forward
//        driver.navigate().forward();
//
//        // Wait for 2 seconds
//        Thread.sleep(2000);
//
//        // Refresh the page
//        driver.navigate().refresh();
//
//        // Wait for 2 seconds
//        Thread.sleep(2000);
//
//        // Maximize the window
//        driver.manage().window().maximize();
//
//        // Wait for 2 seconds
//        Thread.sleep(2000);
//
//        driver.close();
//
//        // Quit the browser
////        driver.quit();
//

    }
}
