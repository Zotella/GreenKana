package Ejecuciones;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class BusquedaGoogle {

    WebDriver driver; // now you can use this remoteWebDriver.
    @Test
    public void RealizarConsultaGoogle (){
        System.setProperty("webdriver.chrome.driver","D:/chromedriver/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        driver.get("https://greensqa.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
    }
}
