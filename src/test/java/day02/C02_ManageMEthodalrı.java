package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_ManageMEthodalrı {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //amazon sayfasına gidelim
        driver.get("https://www.amazon.com");

        //sayfanın konumunu ve boyutlarını yazdırın
        System.out.println("Pencere konumu :" + driver.manage().window().getPosition());//acılan browser ın konumunu verir
        System.out.println("pencere olculerı = " + driver.manage().window().getSize());//pencere olculerıni verir

        // sayfayı sımge durumuna getirin
        driver.manage().window().minimize();


//simge durumunda 3 sn bekleyip sayfayı maximize yapın
        Thread.sleep(3000);
        driver.manage().window().maximize();

        //sayfayı konumu ve boyutlarını maximize  durumda yazdırın
        System.out.println("Pencere konumu :" + driver.manage().window().getPosition());//acılan browser ın konumunu verir
        System.out.println("pencere olculerı = " + driver.manage().window().getSize());

        Thread.sleep(3000);
        driver.manage().window().fullscreen();

//sayfayı tam ekran yaptıktan sonra konumunu ve olculerı yazdırın
        System.out.println("Fullscreen Pencere konumu :" + driver.manage().window().getPosition());//acılan browser ın konumunu verir
        System.out.println("full screnn pencere olculerı = " + driver.manage().window().getSize());

        //sayfayı kapatın
        driver.close();
        driver.quit();//birden fazla sayfayı kapatma komutudur.acık olan tüm browserlerı kapatır


    }
}
