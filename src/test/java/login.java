public class login {
    static WebDriver driver;

    public static void main(String[] args) {
        driver.nativgate().to("https://www.kitapyurdu.com/");
        driver.waitBySeconds(3);
        driver.findElement(By.cssSelector(""));
        driver.sendKeys(By.id("login-password"), "hued");
        driver.waitBySeconds(2);
        driver.fındElement(By.İd("login-enter"));


    }


    }

}