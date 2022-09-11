package Selenium_odevler;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class daysoru02 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com");
        String yoTitle=driver.getTitle();
        String arananKelime = "youtube";
        if (yoTitle.equals(arananKelime)){
            System.out.println("YoutubeTitle is PaSSED");
        }else System.out.println("YoutubeTitle is Failed");

        String yoUrl=driver.getCurrentUrl();
        String wanted= "youtube";
        if (yoUrl.contains(wanted)){
            System.out.println("YouUrl is PaSSED");
        }else System.out.println("YouUrl is Failed");

        driver.get("https://www.amazon.com");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().refresh();

        Thread.sleep(2000);
        driver.navigate().forward();

        Thread.sleep(2000);
        driver.manage().window().fullscreen();

        String sayfaBas=driver.getTitle();
        String say = "Amazon";
        if (sayfaBas.contains(say)){
            System.out.println("sayfaBas is PaSSED");
        }else System.out.println("sayfaBas is Failed");

//9
        String amazonUrl=driver.getCurrentUrl();
        String find= "https://www.amazon.com";
        if (amazonUrl.equals(find)){
            System.out.println("amazon is PaSSED");
        }else System.out.println("amazon is Failed");












    }
}
