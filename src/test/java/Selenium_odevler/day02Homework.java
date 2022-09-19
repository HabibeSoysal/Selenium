package Selenium_odevler;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class day02Homework {
    public static void main(String[] args) throws InterruptedException {
        /*1. Bir class oluşturun: LoginTest
        2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
                a. http://a.testaddressbook.com adresine gidiniz.
        b. Sign in butonuna basin
        c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        i. Username : testtechproed@gmail.com
        ii. Password : Test1234!
                e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
                f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        3. Sayfada kac tane link oldugunu bulun.*/
System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//                a. http://a.testaddressbook.com adresine gidiniz.
        driver.get("http://a.testaddressbook.com ");
//        b. Sign in butonuna basin
        WebElement signInButton=driver.findElement(By.linkText("Sign in"));
        signInButton .click();
//        c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        WebElement emailTextBox= driver.findElement(By.id("session_email"));
        WebElement password= driver.findElement(By.id("session_password"));
        WebElement signIn= driver.findElement(By.name("commit"));

//        d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
//        i. Username : testtechproed@gmail.com
//        ii. Password : Test1234!
        Thread.sleep(2000);
        emailTextBox.sendKeys("testtechproed@gmail.com");

        Thread.sleep(2000);
        password.sendKeys("Test1234!");

        Thread.sleep(2000);
        signIn.click();

//                e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        WebElement istenenUser=driver.findElement(By.className("navbar-text"));

        Thread.sleep(2000);
        if(istenenUser.isDisplayed()){
            System.out.println("ExpectedUser Testi PASSED "+istenenUser.getText());//gettext consolda yazdırmak için
        }else System.out.println("ExpectedUser Testi FAILED");
//                f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        WebElement addresses = driver.findElement(By.linkText("Addresses"));
        WebElement signOut = driver.findElement(By.linkText("Sign out"));
        if (addresses.isDisplayed()){
            System.out.println("Adresses TESTİ PASSED");
        }else System.out.println("Adresses Testi FAILED");

        if (signOut.isDisplayed()){
            System.out.println("SignOut TESTİ PASSED");
        }else System.out.println("SignOut Testi FAILED");


//        3. Sayfada kac tane link oldugunu bulun.
        List<WebElement>linkSayisi= driver.findElements(By.tagName("a"));
        System.out.println("Linklerin sayısı = "+ linkSayisi.size());

// //5. Linkleri LAMBDA ile yazdırınız

            linkSayisi.stream().forEach(t-> System.out.println(t.getText()));




    }
}
