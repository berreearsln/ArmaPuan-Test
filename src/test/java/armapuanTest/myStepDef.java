package armapuanTest;

import PageObjectModel.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

import java.util.concurrent.TimeUnit;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class myStepDef {


    private WebDriver driver = null;

    LoginPage loginPage = new LoginPage();
    CreateEmployeePage createEmployeePage = new CreateEmployeePage();
    CreateManagerPage createManagerPage = new CreateManagerPage();
    CreateProductPage createProductPage = new CreateProductPage();
    SendArmaPuanPage sendArmaPuanPage = new SendArmaPuanPage();
    SpendArmaPuanPage spendArmaPuanPage = new SpendArmaPuanPage();
    AnasayfaPage anasayfaPage = new AnasayfaPage();
    ContactUsPage contactUsPage = new ContactUsPage();
    InquiryRequestPage inquiryRequestPage = new InquiryRequestPage();


    @Given("ArmaPuan sitesine git")
    public void armaPuanSitesineGit() {
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:4200/login");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("ArmaPuan sitesine gidildi.");
    }



    @And("Admin girisine tikla")
    public void adminGirisineTikla() {
        loginPage.clickAdminButton();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("Admin girisine tiklandi.");
    }



    @And("Employee kutusuna tikla")
    public void employeeKutusunaTikla() {
        createEmployeePage.clickEmployeeButton();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("Employee'e tiklandi");
    }
    @When("Ayni employee ID'yi gir")
    public void employeeIDGir() {
        createEmployeePage.writeSameEmployeeID();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("Ayni employee ID girildi.");
    }
    @Then("Ayni employee ID hatasini yakala")
    public void sameIDHatasiniYakala() {
        createEmployeePage.employeeIDAlert();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    @When("Employee bilgilerini gir")
    public void employeeBilgileriniGir() {
        createEmployeePage.writeSampleEmployee();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("Employee bilgileri girildi.");
    }
    @Then("Employee add butonuna bas")
    public void employeAddButonunaBas() {
        createEmployeePage.addEmployee();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("Employee eklendi.");
    }
    @When("Employee aramasi yap")
    public void employeeAramasiYap() {
        createEmployeePage.employeeNameSearch();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("Employee aramasi yapıldı.");
    }
    @Then("Employee aramasini kontrol et")
    public void employeeAramasiniKontrolEt() {
        WebElement findName = driver.findElement(By.xpath("/html/body/app-root/app-employee/div/form/div[2]/table/tbody/tr[1]/td[1]"));
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("Aranan product: " + findName.getText() + " bulundu" );
    }


    @And("Manager kutusuna tikla")
    public void managerKutusunaTikla() {
        createManagerPage.clickManagerButton();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("Manager kutusuna tiklandi.");
    }
    @When("Ayni manager ID'yi gir")
    public void managerIDYiGir() {
        createManagerPage.writeSameManagerID();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("Ayni manager ID girildi.");
    }
    @Then("Ayni manager ID hatasini yakala")
    public void ayniManagerIDHatasiniYakala() {
        createManagerPage.managerIDAlert();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    @When("Manager bilgilerini gir")
    public void managerBilgileriniGir() {
        createManagerPage.writeSampleManager();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("Manager bilgileri girildi.");
    }
    @Then("Manager add butonuna bas")
    public void managerAddButonunaBas() {
        createManagerPage.addManager();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("Manager eklendi.");
    }
    @When("Manager aramasi yap")
    public void managerAramasiYap() {
        createManagerPage.searchManagerName();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("Manager aramasi yapildi.");
    }
    @Then("Manager aramasini kontrol et")
    public void managerAramasiniKontrolEt() {
        WebElement findManagerName = driver.findElement(By.xpath("/html/body/app-root/app-manager/div/form/div[2]/table/tbody/tr[1]/td[1]"));
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("Aranan manager: " + findManagerName.getText() + " bulundu" );
    }


    @And("Product kutusuna tikla")
    public void productKutusunaTikla() {
        createProductPage.clickProductButton();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("Product kutusuna tiklandi.");
    }
    @When("Ayni product ID'yi gir")
    public void ayniProductIDYiGir() {
        createProductPage.writeSameProductID();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("Ayni product id girildi.");
    }
    @Then("Ayni product ID hatasini yakala")
    public void ayniProductIDHatasiniYakala() {
        createProductPage.productIDAlert();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    @When("Product bilgilerini gir")
    public void productBilgileriniGir() {
        createProductPage.writeSampleProduct();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("Product bilgileri girildi.");
    }
    @Then("Product add butonuna bas")
    public void productAddButonunaBas() {
        createProductPage.addProduct();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("Product eklendi.");
    }
    @When("Product aramasi yap")
    public void productAramasiYap() {
        createProductPage.searchProductName();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("Product aramasi yapildi.");
    }
    @Then("Product aramasini kontrol et")
    public void productAramasiniKontrolEt() {
        WebElement findProductName = driver.findElement(By.xpath("/html/body/app-root/app-product/form/div[2]/table/tbody/tr[3]/td[1]"));
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("Aranan product: " + findProductName.getText() + " bulundu" );
    }
    @When("Product point binden fazla girildiğinde")
    public void productPointFazla() {
        createProductPage.fazlaPuan();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    @Then("Fazla puan uyarısı ver")
    public void fazlaPuanUyarisi() throws InterruptedException {
        //Thread.sleep(2000);
        createProductPage.fazlaPuanAlert();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    @When("Product point yüzden az girildiğinde")
    public void productPointAz() {
        createProductPage.azPuan();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    @Then("Az puan uyarısı ver")
    public void azPuanUyarisi() throws InterruptedException {
        //Thread.sleep(2000);
        createProductPage.azPuanAlert();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    @When("Product rate yüzden büyük girildiğinde")
    public void productRateKucuk() {
        createProductPage.maxRate();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    @Then("Yüksek rate hatası ver")
    public void yuksekRate() throws InterruptedException {
        //Thread.sleep(2000);
        createProductPage.maxRateAlert();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }



    @And("Inquiry logosuna tikla")
    public void inquiryLogosunaTikla() {
        inquiryRequestPage.clickInquiryRequestLogo();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("Inquiry logosuna basildi.");
    }
    @And("Answer kutusunu sec")
    public void answerKutusunuSec() {
        inquiryRequestPage.clickControlButton();
        inquiryRequestPage.selectAnswerButton();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("Answer seçeneği seçildi.");
    }
    @When("Answer yaz")
    public void answerYaz() {
        inquiryRequestPage.writeSampleAnswer();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("Answer yazıldı.");
    }
    @Then("Send butonuno bas")
    public void sendButonunoBas() {
        inquiryRequestPage.sendAnswer();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("Answer gönderildi.");
    }


    //5. ekran



    @When("Employee sayfasında ArmaPuan logosuna tikladiginda")
    public void employeeSayfadaArmaPuanLogosunaTikladiginda() {
        anasayfaPage.employeeAnasayfa();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("ArmaPuan logosuna tiklandi" );
    }
    @Then("Employee anasayfasına dön")
    public void employeeAnasayfayaDon() {
        WebElement findEmployeePage = driver.findElement(By.xpath("/html/body/app-root/app-homepage-employee/div/div/div/p"));
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("Employee anasayfasina gelindi. Employe bilgileri: " + findEmployeePage.getText());
    }

    @When("Select employee sayfasında ArmaPuan logosuna tikladiginda")
    public void selectEmployeeSayfasindaArmaPuanLogosunaTikladiginda() {
        anasayfaPage.selectEmployeeManagerAnasayfa();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("ArmaPuan logosuna tiklandi" );
    }
    @When("Select ArmaPuan sayfasında logoya tikladiginda")
    public void selectArmaPuanSayfasindaLogoyaTikladiginda() {
        anasayfaPage.selectArmaPuanManagerAnasayfa();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("ArmaPuan logosuna tiklandi" );
    }
    @Then("Manager anasayfasına dön")
    public void managerAnasayfayaDon() {
        WebElement findManagerPage = driver.findElement(By.xpath("/html/body/app-root/app-homepage-manager/div/div/div/p"));
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("Manager anasayfasina gelindi. Manager bilgileri: " + findManagerPage.getText());
    }

    
    
    @And("Manager girisine tikla")
    public void managerGirisineTikla() {
        loginPage.clickManagerButton();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("Manager girisine tiklandi.");
    }



    @And("Send armapuan kutusuna tikla")
    public void sendArmapuanKutusunaTikla() {
        sendArmaPuanPage.sendArmaPuan();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("Send ArmaPuan kutusuna tiklandi.");
    }
    @When("Employee secimi yap")
    public void employeeSecimiYap() {
        sendArmaPuanPage.selectEmployee();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("Employee secildi.");
    }
    @Then("Employee secimi sonrası next butonuna bas")
    public void nextButonunaBas() {
        sendArmaPuanPage.sendPointNext();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("Next butonuna basildi.");
    }
    @When("Send puan employee aramasi yap")
    public void sendPuanEmployeeAramasiYap() {
        sendArmaPuanPage.sendPuanEmployeeSearch();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("Employee aramasi yapildi.");
    }
    @Then("Send puan employee aramasini kontrol et")
    public void sendPuanEmployeeAramasiniKontrolEt() {
        WebElement findsendPuanEmployeeName = driver.findElement(By.xpath("/html/body/app-root/app-select-employee/div/table/tbody/tr[1]/td[2]/p"));
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("Aranan product: " + findsendPuanEmployeeName.getText() + " bulundu" );
    }
    @When("Yanlış send puan employee aramasi yap")
    public void yanlisSendPuanEmployeeAramasiYap() {
        sendArmaPuanPage.wrongSendPuanEmployeeSearch();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("Yanlis employee aramasi yapildi.");
    }
    @Then("Okay tusuna bas")
    public void okayTusunaBastiginda() {
        sendArmaPuanPage.puanOkay();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("Okay tusuna basildi.");
    }
    @And("Puan secimi yap")
    public void puanSecimiYap() {
        sendArmaPuanPage.puan();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("Puan secimi yapildi.");
    }
    @When("Puan secimi sonrası next butonuna bas")
    public void puanNextButonunaBas() {
        sendArmaPuanPage.puanNextButton();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("Next tusuna basildi.");
    }
    @Then("Alert box no tusuna bas")
    public void alertBoxNoTusunaBas() {
        sendArmaPuanPage.noButton();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("No tusuna basildi.");
    }
    @When("Alert box yes tusuna bas")
    public void alertBoxYesTusunaBas() {
        sendArmaPuanPage.yesButton();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("Yes tusuna basildi.");
    }
    @Then("Bilgi ekranı görülecek")
    public void bilgiEkraniGorulecek() {
        sendArmaPuanPage.employeeBilgiEkrani();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("Bilgi ekranina dönüldü.");
    }
    @When("Employee bilg kutusuna tikla")
    public void employeeBilgKutusunaTikla() {
        sendArmaPuanPage.clickEmployeeBilgiKutusu();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("Çalışan bilgi ekranına tiklandi.");
    }
    @Then("Select employee sayfasina don")
    public void selectEmployeeSayfasinaDon() {
        sendArmaPuanPage.setSelectEmployeeEkrani();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("Select Employee ekranina dönüldü.");
    }



    @And("Employee girisine tikla")
    public void employeeGirisineTikla() {
        loginPage.clickEmployeeButton();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("Employee girisine tiklandi.");
    }



    @And("Spend ArmaPuan kutusuna tikla")
    public void spendArmaPuanKutusunaTikla() {
        spendArmaPuanPage.spendArmaPuan();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("Spend ArmaPuan kutusuna tiklandi.");
    }
    @When("Spend puan product aramasi yap")
    public void spendPuanProductAramasiYap() {
        spendArmaPuanPage.spendArmaPuanSearch();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("Spend ArmaPuan product aramasi yapildi.");
    }
    @Then("Spend puan product aramasini kontrol et")
    public void spendPuanProductAramasiniKontrolEt() {
        WebElement findspendPuanEmployeeName = driver.findElement(By.xpath("/html/body/app-root/app-spend-point/div/table/tbody/tr/td[1]"));
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("Aranan product: " + findspendPuanEmployeeName.getText() + " bulundu" );
    }



    @And("Contact us logosuna tikla")
    public void contactUsLogosunaTikla() {
        contactUsPage.clickContactUsLogo();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("Contact us sayfasina gelindi.");
    }
    @When("Email kutusu bosken")
    public void emailKutusuBosken() {
        contactUsPage.emptyContactEmail();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("Email bölümü boş.");
    }
    @Then("Email bos birakilamaz hatasini yakala")
    public void emailBosBirakilamazHatasiniYakala() {
        contactUsPage.emptyEmailAlert();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    @When("Subject kutusu bosken")
    public void subjectKutusuBosken() {
        contactUsPage.emptyContactSubject();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("Subject bölümü boş.");
    }
    @Then("Subject bos birakilamaz hatasini yakala")
    public void subjectBosBirakilamazHatasiniYakala() {
        contactUsPage.emptySubjectAlert();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    @When("Request kutusu bosken")
    public void requestKutusuBosken() {
        contactUsPage.emptyContactRequest();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("Request bölümü boş.");
    }
    @Then("Request bos birakilamaz hatasini yakala")
    public void requestBosBirakilamazHatasiniYakala() {
        contactUsPage.emptyRequestAlert();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    @And("Sample request yaz")
    public void sampleRequestYaz() {
        contactUsPage.writeSampleRequest();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("Request yazildi.");
    }
    @When("Reset butonuna basildiginda")
    public void resetButonunaBasildiginda() {
        contactUsPage.clickResetButton();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("Reset butonuna basildi.");
    }
    @Then("Butun kutucuklar bos olacak")
    public void butunKutucuklarBosOlacak() {
        contactUsPage.emailBosMu();
        contactUsPage.subjectBosMu();
        contactUsPage.requestBosMu();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }


    @When("Request employee ismini search et")
    public void requestEmployeeIsminiSearchEt() {
        inquiryRequestPage.searchRequestEmployeeName();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("Employee maili tabloda arandi.");
    }
    @Then("Requestteki ve tablodaki emailleri karsilastir")
    public void requesttekiVeTablodakiEmailleriKarsilastir() {
        inquiryRequestPage.sameEmail();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("employee maili kontrol edildi.");
    }
}
