package database_stepdefinitions;
import io.cucumber.java.en.Given;
import utilities.DBUtils;
public class DbCreateStepDef {
    @Given("kullanici yeni bir hotel olusturur")
    public void kullanici_yeni_bir_hotel_olusturur() {
        String query = "INSERT INTO dbo.tHOTEL (Code, Name, Address, Phone, Email, IDGroup, CreateDate, CreateUser) " +
                "VALUES ('113', 'BATCH 5', 'Cikmaz SK.', '10012', 'batch5@gmail.com', 10012, '2020-11-03 00:00:00.000', 4)";
        DBUtils.executeQuery(query);
    }
}