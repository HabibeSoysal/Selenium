package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class getMethodları {
    public static void main(String[] args) {
        /*amazon sayfasına gidiniz
        arama kutusunu locat ediniz
        arama kutusunun tag name İNİN input oldugunu test ediniz
        arama kjutusunun name attrıbute unun degerının field - keywords oldugunu test ediniz
        arama kutusunun konumunu yazdırınız
        ayfayı kapatınız
*/
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        amazon sayfasına gidiniz
        driver.get("https://www.amazon.com");
//        arama kutusunu locate ediniz
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        //arama kutusunun tag name inin input oldugunu test ediniz
        String expectedTagName = "input";
        String actualTagName = "aramaKutusu.getTagName";

        if (actualTagName.equals(expectedTagName)) {
            System.out.println("tagname tessti PASSED");
        } else System.out.println("tagname Testi FAILED");
        //    arama kjutusunun name attrıbute unun degerının field - keywords oldugunu test ediniz
        String istenenAttributeName = "field - keywords ";
        String gercekAttributeName = "driver.getAttribute(name) ";

        if (gercekAttributeName.equals(istenenAttributeName)) {
            System.out.println("Attribute testi PASSED");
        } else System.out.println("Attribute Testi FAILED");
        // arama kutusunun konumunu yazdırınız
        System.out.println("aramaKutusu.getLocation() = " + aramaKutusu.getLocation());

        //sayfayı kapatınız
        driver.close();

    }
}





