package page;

import java.awt.*;

public class method {

  WebDriver driver;
  FluentWait<WebDriver> wait;
  JavascriptExecutor jsdriver;

public static void main (String[] args){
  System.setProperty("chromedriver","test/java/resources/chromedriver");
  Webdriver webdriver =new chromedriver;
}


  public WebElement findElement(By by){
    return wait.until(ExpectedConditions.presenceOfElementLocated(by));
  }

  public void click(By element findElement(by).click();
  public void waitBySeconds(long seconds);
  public void selectByText(By by,String text){getSelect(by).selectByVisibleText(text);
    public void sendKeys(By by, String text){findElement(by).sendKeys(text);}
