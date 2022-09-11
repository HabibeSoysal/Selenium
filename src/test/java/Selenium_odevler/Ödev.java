package Selenium_odevler;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ödev {
    public static void main(String[] args) {
        // Yeni bir package olusturalim : day01
        //Yeni bir class olusturalim : C03_GetMethods

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        //Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com");

//        Sayfa basligini(title) yazdirin
        System.out.println("Actual title :" + driver.getTitle());

//        Sayfa basliginin “Amazon” icerdigini test edin
        String actualTitle = driver.getTitle();
        String expectedWord = "Amazon";

        if (actualTitle.contains(expectedWord)) {
            System.out.println("Expected Word is PASSED");
        } else System.out.println("Expected Word is FAILED");

//     Sayfa adresini(url) yazdirin

        System.out.println("Url: " + driver.getCurrentUrl());

//        Sayfa url’inin “amazon” icerdigini test edin.

        String actualUrl = driver.getCurrentUrl();
        String wantedWord = "amazon";
        if (actualUrl.contains(wantedWord)) {
            System.out.println("Wanted Word is PASSED");
        } else System.out.println("Wanted Word is FAILED");

//                Sayfa handle degerini yazdirin
        System.out.println("HAndle:" + driver.getWindowHandle());

//        Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
        String html = driver.getPageSource();
        String kaynakKodName = "Gateway";

        if (html.contains(kaynakKodName)) {
            System.out.println("kaynakKodName is FIND");
        } else System.out.println("kaynakKodName is not FIND");

//        Sayfayi kapatin.*/
        driver.close();


    }

    public static class Ödev02 {
        public static void main(String[] args) throws InterruptedException {

    //        Yeni bir Class olusturalim.C05_NavigationMethods

            System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");

            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();
    //        Youtube ana sayfasina gidelim . https://www.youtube.com/
            driver.get("https://www.youtube.com");
            Thread.sleep(2000);
    //        Amazon soyfasina gidelim. https://www.amazon.com/
            driver.get("https://www.amazon.com");
            Thread.sleep(2000);
    //        Tekrar YouTube’sayfasina donelim
            driver.navigate().back();
            Thread.sleep(2000);
    //        Yeniden Amazon sayfasina gidelim
            driver.navigate().forward();
            Thread.sleep(2000);
    //        Sayfayi Refresh(yenile) yapalim
            driver.navigate().refresh();
    //        Sayfayi kapatalim / Tum sayf0
    //        Thread.sleep(2000);
            driver.close();
            driver.quit();//

        }
    }
}
