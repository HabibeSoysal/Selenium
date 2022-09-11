package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_IlkTest {
    public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        /*

        2-baslıgın "Amazon" içerdiğini test ediniz
        3-url nin amazon icerdiğini test ediniz
        4-sayfayı kapatınız
        */

        driver.manage().window().maximize();
        //1-amazon sayfasına gidiniz
        driver.get("https://www.amazon.com");
        //2-baslıgın "Amazon" içerdiğini test ediniz
        String istenenKelime="Amazon";
        String actualTitle=driver.getTitle();
        if(actualTitle.contains(istenenKelime)){
            System.out.println("İstenen kelime PASSED");
        }else System.out.println("İstenen kelime FAILED   ");
        // 3-url nin amazon icerdiğini test ediniz
        String actualUrl=driver.getCurrentUrl();
        String arananKelime="amazon";
        if (actualUrl.contains(arananKelime)){
            System.out.println("Url testi PASSED");
        }else System.out.println("Url testi FAILED");
        //4-sayfayı kapatınız
        driver.close();
    }
}
