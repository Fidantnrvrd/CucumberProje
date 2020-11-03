package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.EbayPage;
import utilities.Driver;

public class EbayStepDefinitions {

    EbayPage ebayPage = new EbayPage();


    public void kullanici_sayfasina_gider(String string) {
        // string => http://ebay.com
        Driver.getDriver().get(string);
    }

    public void kullanici_arama_kutusuna_yazar(String string) {
        ebayPage.aramaKutusu.sendKeys(string + Keys.ENTER);
    }

    @Then("kullanici ebaydaki sonuc sayisini ekrana yazar")
    public void kullanici_ebaydaki_sonuc_sayisini_ekrana_yazar() {
        String sonucSayisi = ebayPage.sonucSayisi.getText();
        System.out.println(sonucSayisi);
    }
}
