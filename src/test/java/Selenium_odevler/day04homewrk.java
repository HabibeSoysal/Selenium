package Selenium_odevler;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class day04homewrk {
    public static void main(String[] args) throws InterruptedException {
     /*   1-C01_TekrarTesti isimli bir class olusturun
        2- https://www.amazon.com/ adresine gidin
        3- Browseri tam sayfa yapin
        4- Sayfayi “refresh” yapin
        5 Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        6 Gift Cards sekmesine basin
        7 Birthday butonuna basin
        8 Best Seller bolumunden ilk urunu tiklayin
        9- Gift card details’den 25 $’i secin
        10-Urun ucretinin 25$ oldugunu test edin
        10-Sayfayi kapatin
    }*/
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//        2- https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");

//        3- Browseri tam sayfa yapin
        driver.manage().window().maximize();

//        4- Sayfayi “refresh” yapin
        driver.navigate().refresh();

//        5 Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        String actualTitle = driver.getTitle();
        String arananKelime = "Spend less";
        if (actualTitle.contains(arananKelime)) {
            System.out.println("PAssed");
        } else System.out.println("Failed");

//        6 Gift Cards sekmesine basin
        WebElement giftCards = driver.findElement(By.xpath("//*[@data-csa-c-content-id='nav_cs_gc']"));
        giftCards.click();

//        7 Birthday butonuna basin
        WebElement birthdayButton = driver.findElement(By.xpath("//*[@alt='Birthday gift cards']']"));
        birthdayButton.click();
//        8 Best Seller bolumunden ilk urunu tiklayin
        driver.findElement(By.xpath("(//img[@alt='Amazon.com eGift Card'])[1]")).click();

        //9- Gift card details’den 25 $’i secin
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//*[@id='gc-mini-picker-amount-1'])[1]")).click();
        //10-Urun ucretinin 25$ oldugunu test edin
        WebElement urunUcreti = driver.findElement(By.xpath("(//*[@id='gc-live-preview-amount'])[1]"));
        if (urunUcreti.getText().contains("$25.00")) {
            System.out.println("Ürün fiyatı değişti");
        } else System.out.println("Ürün fiyatı değişmedi");
        //10-Sayfayi kapatin
        Thread.sleep(2000);
        driver.quit();
    }
}