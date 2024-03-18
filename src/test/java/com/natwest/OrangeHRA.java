package com.natwest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRA {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Welcome\\Desktop\\Natwest\\AutomationDemo1\\src\\test\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000);

        // Find the username field and enter the username
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");

        // Wait for 2 seconds
        Thread.sleep(2000);

        // Find the password field and enter the password
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");

        // Wait for 2 seconds
        Thread.sleep(2000);

        // Find and click the submit button
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

        // Wait for 2 seconds
        Thread.sleep(2000);
        driver.manage().window().maximize();

        // Find the element using XPath and click on it
        driver.findElement(By.xpath("//span[text()='PIM']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@name=\"firstName\"]")).sendKeys("Mayank");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@name=\"lastName\"]")).sendKeys("Sharma");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[contains(@class, 'oxd-input')][contains(@class, 'oxd-input--active')]")).sendKeys("0408");
        Thread.sleep(1000);
        // Find the label element with its child input using XPath
        driver.findElement(By.xpath("//span[contains(@class, 'oxd-switch-input')][contains(@class, 'oxd-switch-input--active')][contains(@class, '--label-right')][@data-v-8e4757dc='']"))
                .click();//        driver.findElement(By.xpath())

        // Find the input element by class and autocomplete attribute and send keys to it
        driver.findElement(By.cssSelector("input.oxd-input.oxd-input--active[autocomplete='off']"))
                .sendKeys("Riti___Sharma");

        // Find the input element using the specified attributes
        driver.findElement(By.cssSelector("input.oxd-input.oxd-input--active[type='password'][autocomplete='off']"))
                .sendKeys("Riti__Sharma0408");
        driver.findElement(By.cssSelector("input.oxd-input.oxd-input--active[type='password'][autocomplete='off']")).sendKeys("Riti__Sharma0408");
//        driver.findElement(By.cssSelector("button.oxd-button.oxd-button--medium.oxd-button--secondary.orangehrm-left-space")).click();
////        driver.
//        driver.findElement(By.cssSelector("input.oxd-input.oxd-input--active.toggled")).sendKeys("Mayank Sharma");

        driver.quit();

    }
}
