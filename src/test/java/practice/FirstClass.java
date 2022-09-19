package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FirstClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get(" ");
        driver.getCurrentUrl();
        driver.manage().window().maximize();
        driver.getTitle();
        driver.getPageSource();
        //manage:yönetmek demek
        driver.navigate();//ileri geri seklinde komut verebildiğimiz kelimemiz


    }
}