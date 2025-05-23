package com.worldline.selinium.javascript.assessment1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptAlertsTest {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://the-internet.herokuapp.com/javascript_alerts");

            driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
            Alert alert1 = driver.switchTo().alert();
            alert1.accept();
            String result1 = driver.findElement(By.id("result")).getText();
            if (result1.equals("You successfully clicked an alert")) {
                System.out.println("Simple alert accepted and verified.");
            } else {
                System.out.println("Simple alert verification failed.");
            }

            driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
            Alert alert2 = driver.switchTo().alert();
            alert2.dismiss();
            String result2 = driver.findElement(By.id("result")).getText();
            if (result2.equals("You clicked: Cancel")) {
                System.out.println("Confirmation alert dismissed and verified.");
            } else {
                System.out.println("Confirmation alert verification failed.");
            }

            driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
            Alert alert3 = driver.switchTo().alert();
            alert3.sendKeys("AutomationTest");
            alert3.accept();
            String result3 = driver.findElement(By.id("result")).getText();
            if (result3.equals("You entered: AutomationTest")) {
                System.out.println("Prompt alert input submitted and verified.");
            } else {
                System.out.println("Prompt alert verification failed.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
