package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_NavigateMEthodlari {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://amazon.com");
        //driver.navigate().to() methodu sayfada ileri geri yapacaksak kullanılır
        //driver.get()methodu gibi bizi istediğimiz Url'e götürür

        driver.navigate().to("https://techproeducation.com");
        // tekrar amazon sayfasına dönelim
        Thread.sleep(3000);
        driver.navigate().back();//bir önceki sayfaya geri döner
        //takrar techproe sayfasına gidelim
        Thread.sleep(3000);//döndügü sayfaya geri döner
        driver.navigate().forward();

        //tachproed sayfasını yenileyelim
        Thread.sleep(3000);
        driver.navigate().refresh();//sayfayı yeniler

        //son olarak sayfayı kapatın
        driver.close();








    }
}
