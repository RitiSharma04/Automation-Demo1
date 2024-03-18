package com.natwest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenURL {
    public static void main(String[] args) {
// Setting up the system property to locate the ChromeDriver executable file.
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\Desktop\\Natwest\\AutomationDemo1\\src\\test\\chromedriver.exe");

// Initializing a new instance of the ChromeDriver.
        WebDriver driver = new ChromeDriver();

// Navigating to a specific URL.
        driver.get("https://gitlab.stackroute.in/stack_java_newz/newz-step3-boilerplate");

// Printing the current URL of the webpage.
        System.out.println(driver.getCurrentUrl());

// Navigating to another URL.
        driver.navigate().to("https://www.google.com/");

// Navigating forward to the next page in history.
        driver.navigate().forward();

// Navigating back to the previous page in history.
        driver.navigate().back();

// Refreshing the current page.
        driver.navigate().refresh();

// Maximizing the browser window.
        driver.manage().window().maximize();

// Closing the browser window.
        driver.close();

    }
}

