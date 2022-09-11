package day02;

import io.opentelemetry.api.baggage.propagation.W3CBaggagePropagator;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_ManegeMethodları {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com");
        System.out.println("sayfanın konumu = " + driver.manage().window().getPosition());
        System.out.println("sayfanın boyutları= " + driver.manage().window().getSize());

//sayfanın konumunu ve boyutunu ıstediğiniz sekilde ayarlayın
        driver.manage().window().setPosition(new Point(20,20));//sayfanın konumunu istediğimiz sekilde AYARLAR
        driver.manage().window().setSize(new Dimension(600,300));//SAYFANIN OLCULERINI İSTEDİİĞİMİZ DSEKİLDE AYARLAR

//sayfamın sizin istediğiniz boyut ve konuma geldiğini test edin
        System.out.println("sayfanın yeni konumu = " + driver.manage().window().getPosition());
        System.out.println("sayfanın yeni boyutları= " + driver.manage().window().getSize());
        Thread.sleep(2000);
        driver.close();




    }
}
