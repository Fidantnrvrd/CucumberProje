package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import pages.AmazonPage;
import utilities.Driver;

public class AmazonStepDefinitions {
    AmazonPage amazonPage = new AmazonPage();
    private Object String;

    public void kullanici_amazon_sayfasina_gider() {
        Driver.getDriver().get("http://amazon.com");
    }

    public void kullanici_aramakutusuna_headphones_yazar_va_arar() {
        amazonPage.aramaKutusu.sendKeys("headphones" + Keys.ENTER);
    }

    @Then("kullanici sonuc sayisini ekrana yazdirir")
    public void kullanici_sonuc_sayisini_ekrana_yazdirir() {
        System.out.println(amazonPage.sonucSayisi.getText());
    }

    public void kullanici_aramakutusuna_camera_yazar_ve_arar() {
        amazonPage.aramaKutusu.sendKeys("camera" + Keys.ENTER);
    }

    public void kullanici_aramakutusuna_yazar_ve_arar(String string) {
        amazonPage.aramaKutusu.sendKeys(string + Keys.ENTER);
    }

    public void kullanici_dropdownda_secer(String string) {
        Select select = new Select(amazonPage.dropDown);
        select.selectByVisibleText(string);
    }

    }

