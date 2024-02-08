package com.metlife.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebUtils
{
   static WebDriver driver;
   static WebDriverWait wait;
   public static void browserInitialize(String browser)
   {
      switch (browser)
      {
          case "Firefox":
           driver=new FirefoxDriver();
           break;
          case "Edge":
              driver=new EdgeDriver();
              break;
          default:
              driver=new ChromeDriver();
              break;
      }
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
      //wait=new WebDriverWait(driver,Duration.ofSeconds(30));
   }
   public static void closeBrowser()
   {
       driver.quit();
   }
   public static void launchBrowser(String url)
   {
       driver.get(url);
   }
   public static void enterInputText(By locator,String value)
   {
    //wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
    WebElement element=driver.findElement(locator);
    element.clear();
    element.sendKeys(value);
   }
   public static void clickAction(By locator)
   {
    //wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    //wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    //wait.until(ExpectedConditions.elementToBeClickable(locator));
    driver.findElement(locator).click();
   }
   public static void errorTextMessage(By locator,String value)
   {
    //wait.until(ExpectedConditions.textToBe(locator,value));
   }
   public static void handlingRandomAlertWindow()
   {
       driver.navigate().refresh();
       driver.switchTo().alert().accept();
   }
}
