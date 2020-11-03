package stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.KoalaPalacePage;
import utilities.Driver;
public class KoalaPalaceStepDef {
    KoalaPalacePage page = new KoalaPalacePage();

    public void kullanici_koalapalace_admin_sayfasina_gider() {
        Driver.getDriver().get("http://www.kaolapalace-qa-environment2.com/Account/LogOn?ReturnUrl=%2FAdmin%2FUserAdmin");
    }
    public void kullanici_kullaniciadi_ve_sifresini_girer() {
        page.userNameKutusu.sendKeys("manager2");
        page.passwordKutusu.sendKeys("Man1ager2!");
    }
    @Then("kullanici giris islemini gerceklestirir")
    public void kullanici_giris_islemini_gerceklestirir() {
        page.girisButonu.click();
    }
    public void kullanici_hotelcreate_sayfasina_gider() {
        Driver.getDriver().get("http://www.kaolapalace-qa-environment2.com/admin/HotelAdmin/Create");
    }
    public void kullanici_hotelcreate_code_bolumune_girer(String string) {
        page.hotelCreateCodeKutusu.sendKeys(string);
    }
    public void kullanici_hotelcreate_name_bolumune_girer(String string) {
        page.hotelCreateNameKutusu.sendKeys(string);
    }
    public void kullanici_hotelcreate_adress_bolumune_girer(String string) {
        page.hotelCreateAddressKutusu.sendKeys(string);
    }
    public void kullanici_hotelcreate_phone_bolumune_girer(String string) {
        page.hotelCreatePhoneKutusu.sendKeys(string);
    }
    public void kullanici_hotelcreate_email_bolumune_girer(String string) {
        page.hotelCreateEmailKutusu.sendKeys(string);
    }
    public void kullanici_hotelcreate_idgroup_bolumunde_secer(String string) {
        Select select = new Select(page.hotelCreateIDGroupDropdown);
        select.selectByVisibleText(string);
    }
    public void kullanici_hotelcreate_save_butonuna_tiklar() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        page.hotelCreateSaveButonu.click();
    }
    @Then("kullanici hotelcreate kayit islemini assert eder")
    public void kullanici_hotelcreate_kayit_islemini_assert_eder() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(page.hotelCreateBasariliYazisi.getText());
    }
    public void kullanici_hotelroomcreate_sayfasina_gider() {
        Driver.getDriver().get("http://www.kaolapalace-qa-environment2.com/admin/HotelroomAdmin/Create");
    }
    public void kullanici_hotelroomcreate_idhotel_bolumunde_secer(String string) {
        Select select = new Select(page.hotelRoomCreateIDHotelDropdown);
        select.selectByVisibleText(string);
    }
    public void kullanici_hotelroomcreate_code_bolumune_girer(String string) {
        page.hotelRoomCreateCodeKutusu.sendKeys(string);
    }
    public void kullanici_hotelroomcreate_name_bolumune_girer(String string) {
        page.hotelRoomCreateNameKutusu.sendKeys(string);
    }
    public void kullanici_hotelroomcreate_location_bolumune_girer(String string) {
        page.hotelRoomCreateLocationKutusu.sendKeys(string);
    }
    public void kullanici_hotelroomcreate_description_bolumune_girer(String string) {
        page.hotelRoomCreateDescriptionKutusu.sendKeys(string);
    }
    public void kullanici_hotelroomcreate_price_bolumune_fiyat_girer() {
        // actions class'tan nesne bu şekilde üretiliyor.
        Actions actions = new Actions(Driver.getDriver());
        actions.dragAndDrop(page.hotelRoomCreatePrice500 , page.hotelRoomCreatePriceKutusu)
                .perform();
    }
    public void kullanici_hotelroomcreate_roomtype_bolumunde_secer(String string) {
        Select select = new Select(page.hotelRoomCreateIDGroupRoomTypeDropDown);
        select.selectByVisibleText(string);
    }
    public void kullanici_hotelroomcreate_maxadult_bolumune_girer(String string) {
        page.hotelRoomCreateMaxAdultKutusu.sendKeys(string);
    }
    public void kullanici_hotelroomcreate_maxchildren_bolumune_girer(String string) {
        page.hotelRoomCreateMaxChildKutusu.sendKeys(string);
    }
    public void kullanici_hotelroomcreate_save_butonuna_tiklar() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        page.hotelRoomCreateSaveButonu.click();
    }
    @Then("kullanici hotelroomcreate kayit islemini assert eder")
    public void kullanici_hotelroomcreate_kayit_islemini_assert_eder() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(page.hotelRoomCreateBasariliYazisi.getText());
    }

    public void kullanici_hotelroomreservation_sayfasina_gider() {
        Driver.getDriver().get("http://www.kaolapalace-qa-environment2.com/admin/RoomReservationAdmin/Create");
    }
    public void kullanici_roomreservation_iduser_bolumunde_secer(String string) {
        Select select = new Select(page.hotelRoomReservationCreateIDUserDropdown);
        select.selectByVisibleText(string);
    }
    public void kullanici_roomreservation_idhotelroom_bolumunde_secer(String string) {
        Select select = new Select(page.hotelRoomReservationCreateIDHotelRoomDropdown);
        select.selectByVisibleText(string);
    }
    public void kullanici_roomreservation_price_bolumune_girer(String string) {
        page.hotelRoomReservationCreatePriceKutusu.sendKeys(string);
    }
    public void kullanici_roomreservation_datestart_bolumune_girer(String string) {
        page.hotelRoomReservationCreateDateStartKutusu.sendKeys(string);
    }
    public void kullanici_roomreservation_dateend_bolumune_girer(String string) {
        page.hotelRoomReservationCreateDateEndKutusu.sendKeys(string);
    }
    public void kullanici_roomreservation_adultamaount_bolumune_girer(String string) {
        page.hotelRoomReservationCreateAdultAmountKutusu.sendKeys(string);
    }
    public void kullanici_roomreservation_childrenamount_bolumune_girer(String string) {
        page.hotelRoomReservationCreateChildrenAmountKutusu.sendKeys(string);
    }
    public void kullanici_roomreservation_namesurname_bolumune_girer(String string) {
        page.hotelRoomReservationCreateNameSurnameKutusu.sendKeys(string);
    }
    public void kullanici_roomreservation_phone_bolumune_girer(String string) {
        page.hotelRoomReservationCreatePhoneKutusu.sendKeys(string);
    }
    public void kullanici_roomreservation_email_bolumune_girer(String string) {
        page.hotelRoomReservationCreateEmailKutusu.sendKeys(string);
    }
    public void kullanici_roomreservation_notes_bolumune_girer(String string) {
        page.hotelRoomReservationCreateNotesKutusu.sendKeys(string);
    }
    public void kullanici_roomreservation_save_butonuna_tiklar() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        page.hotelRoomReservationCreateSaveButonu.click();
    }
    @Then("kullanici roomreservation kayit islemini assert eder")
    public void kullanici_roomreservation_kayit_islemini_assert_eder() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(page.hotelRoomReservationCreateBasariliYazisi.getText());
    }


    @Then("kullanici roomreservation kayit isleminin basarisiz oldugunu assert eder")
    public void kullanici_roomreservation_kayit_isleminin_basarisiz_oldugunu_assert_eder() {

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(page.hataMesaji.getText());
        Assert.assertTrue(page.hataMesaji.isDisplayed());

    }
    public void kullanici_hotellist_sayfasina_gider() {
        Driver.getDriver().get("http://www.kaolapalace-qa-environment2.com/admin/HotelAdmin");
    }
    public void kullanici_hotellist_code_bolumune_girer(String string) {
        page.hotelListCodeKutusu.sendKeys(string);
    }
    public void kullanici_hotellist_search_butonuna_tiklar() {
        page.hotelListSearchButonu.click();
    }
    @Then("kullanici hotellist bolumunundeki kayitlari inceler")
    public void kullanici_hotellist_bolumunundeki_kayitlari_inceler() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String sonucSayisi = page.hotelListToplamSonucSayisi.getText();
        System.out.println(sonucSayisi);
        String ilkSatir = page.hotelListIlkSatir.getText();
        System.out.println(ilkSatir);
        String ilkSatirCodeSutunu = page.hotelListIlkSatirCodeSutunu.getText();
        System.out.println(ilkSatirCodeSutunu);
    }
    public void kullanici_hotelroomlist_sayfasina_gider() {
        Driver.getDriver().get("http://www.kaolapalace-qa-environment2.com/admin/HotelRoomAdmin");
    }
    public void kullanici_hotelroomlist_idhotelbolumunde_secer(String string) {
        Select select = new Select(page.hotelRoomListIDHotelDropdown);
        select.selectByVisibleText(string);
    }
    public void kullanici_hotelroomlist_code_bolumune_girer(String string) {
        page.hotelRoomListCodeKutusu.sendKeys(string);
    }
    public void kullanici_hotelroomlist_name_bolumune_girer(String string) {
        page.hotelRoomListNameKutusu.sendKeys(string);
    }
    public void kullanici_hotelroomlist_location_bolumune_girer(String string) {
        page.hotelRoomListLocationKutusu.sendKeys(string);
    }
    public void kullanici_hotelroomlist_search_butonuna_tiklar() {
        page.hotelRoomListAramaKutusu.click();
    }
    @Then("kullanici hotelroomlist bolumundeki kayitlari inceler")
    public void kullanici_hotelroomlist_bolumundeki_kayitlari_inceler() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String sonucSayisi = page.hotelRoomListSonucSayisi.getText();
        System.out.println(sonucSayisi);
        String ilkSatir = page.hotelRoomListIlkSatir.getText();
        System.out.println(ilkSatir);

    }
    @Then("kullanici hotellist sonuc bolumunde kayit bulunamdi yazisi gorur")
    public void kullanici_hotellist_sonuc_bolumunde_kayit_bulunamdi_yazisi_gorur() {
        Assert.assertTrue(page.hotelCreateKayitBulunamadiYazisi.isDisplayed());

    }
    public void kullanici_hotelroomreservationlist_sayfasina_gider() {
        Driver.getDriver().get("http://www.kaolapalace-qa-environment2.com/admin/RoomReservationAdmin");
    }

    public void kullanici_hotelroomreservationlist_hotelroomid_bolumunde_secer(String string) {
        Select select = new Select(page.hotelReservationListHotelRoomIdDropdown);
        select.selectByVisibleText(string);
    }

    public void kullanici_hotelroomreservationlist_arama_kutusuna_tiklar() {
        page.hotelReservationListAramaKutusu.click();
    }

    @Then("kullanici hotelroomreservationlist kayitlarini inceler")
    public void kullanici_hotelroomreservationlist_kayitlarini_inceler() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for(WebElement w : page.hotelReservationListIlkSayfaSonuclari){
            System.out.println(w.getText());
        }
    }
    public void kullanici_hoteledit_sayfasina_gider(String string) {
        Driver.getDriver().get(string);
    }
    public void kullanici_hoteledit_code_bolumunu_ile_gunceller(String string) {
        page.hotelEditCodeKutusu.clear();
        page.hotelEditCodeKutusu.sendKeys(string);
    }
    public void kullanici_hoteledit_name_bolumunu_ile_gunceller(String string) {
        page.hotelEditNameKutusu.clear();
        page.hotelEditNameKutusu.sendKeys(string);
    }
    public void kullanici_hoteledit_adress_bolumunu_ile_gunceller(String string) {
        page.hotelEditAdressKutusu.clear();
        page.hotelEditAdressKutusu.sendKeys(string);
    }
    public void kullanici_hoteledit_phone_bolumunu_ile_gunceller(String string) {
        page.hotelEditPhoneKutusu.clear();
        page.hotelEditPhoneKutusu.sendKeys(string);
    }
    public void kullanici_hoteledit_mail_bolumunu_ile_gunceller(String string) {
        page.hotelEditEmailKutusu.clear();
        page.hotelEditEmailKutusu.sendKeys(string);
    }
    public void kullanici_hoteledit_save_butonuna_tiklar() {
        page.hotelEditSaveButonu.click();
    }
    @Then("kullanici hoteledit {string} yazisini dogrular")
    public void kullanici_hoteledit_yazisini_dogrular(String string) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),20);
        boolean yaziDogruMu = wait.until(ExpectedConditions.textToBe(By.className("bootbox-body") , "Hotel was updated successfully"));
        Assert.assertTrue(yaziDogruMu);
    }
    public void kullanici_hotelroomedit_sayfasina_gider(String string) {
        Driver.getDriver().get(string);
    }
    public void kullanici_hotelroomedit_sayfasinda_properties_bolumune_tiklar() {
        page.hotelRoomEditPropertiesLinki.click();
    }
    public void kullanici_hotelroomedit_sayfasinda_tip_olarak_secer(String string) {
        Select select = new Select(page.hotelRoomEditPropertiesTipDropdown);
        select.selectByVisibleText(string);
    }
    public void kullanici_hotelroomedit_sayfasinda_code_olarak_girer(String string) {
        page.hotelRoomEditPropertiesCodeKutusu.sendKeys(string);
    }
    public void kullanici_hotelroomedit_sayfasinda_value_olarak_girer(String string) {
        page.hotelRoomEditPropertiesValueKutusu.sendKeys(string);
    }
    public void kullanici_hotelroomedit_sayfasinda_save_butonuna_tiklar() {
        page.hotelRoomEditPropertiesSaveButonu.click();
    }
    @Then("kullanici hotelroomedit sayfasinda properties bolumunde yeni kayit oldugunu assert eder")
    public void kullanici_hotelroomedit_sayfasinda_properties_bolumunde_yeni_kayit_oldugunu_assert_eder() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        boolean gorunuyorMu = page.hotelRoomEditPropertiesIlkKayitRemoveButonu.isDisplayed();
        Assert.assertTrue(gorunuyorMu);
    }




}






