
package Selenium_odevler;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ödevday02 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        //2
        driver.get("https://www.facebook.com");
        String url= driver.getCurrentUrl();
        String istenenKelime = "facebook";

        if (url.contains(istenenKelime)){
            System.out.println("İstenen Kelime is PASSED");
        }else System.out.println("İstenen Kelime is FAILED");

        //3
        driver.get("https://www.walmart.com");
        String title= driver.getTitle();
        String Kelime = "Walmart.com";

        if (title.contains(Kelime)){
            System.out.println("İstenen Kelime is PASSED");
        }
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(3000);
        driver.manage().window().maximize();
        driver.close();
        /*2.
        Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın
                (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.

*/

        /*odev 2
        1. Yeni bir class olusturun (TekrarTesti)

        3. Sayfa URL’sinin “youtube” içerip içermediğini
        (contains) doğrulayın, içermiyorsa doğru
        URL’yi yazdırın.
        4. Daha sonra
        Amazon sayfasina gidin https://www.amazon.com/
        5. Youtube sayfasina geri donun
        6. Sayfayi yenileyin
        7. Amazon sayfasina donun
        8.
        Sayfayi tamsayfa yapin
        9. Ardından sayfa başlığının “Amazon” içerip içermediğini
        (contains) doğrulayın, Yoksa
        doğru başlığı(Actual Title) yazdırın.
        10.Sayfa URL’sinin
        https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru
        URL’yi yazdırın
        11. Sayfayi kapatin
:white_check_mark:
        2

        7:54
        ödev3
        ClasslassWork : L oginoginTest
        1. Bir class oluşturun: LoginTest
        2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
                a. http://a.testaddressbook.com adresine gidiniz.
        b. Sign in butonuna basin
        c. email textbox,password textbox, and signin button elementlerini locate
        d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        i. Username :
        testtechproed@gmail.com
        ii. Password : Test1234!
                e. Expected user id nin
        testtechproed@gmail.com oldugunu dogrulayin(verify).
                f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        3. Sayfada kac tane link oldugunu bulun.*/
    }
}
