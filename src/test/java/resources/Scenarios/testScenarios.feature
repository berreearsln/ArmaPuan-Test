Feature: armaPuan Test

  #1. EKRAN SENARYOLARI : CREATE EMPLOYEE
  Scenario: Employee kayitta aynı ID kullanılırsa hata verecek
    Given ArmaPuan sitesine git
    And Admin girisine tikla
    When Ayni employee ID'yi gir
    Then Ayni employee ID hatasini yakala

  Scenario: Employee kayıtta sorun yoksa add butonuna bas
    Given ArmaPuan sitesine git
    And Admin girisine tikla
    And Employee kutusuna tikla
    When Employee bilgilerini gir
    Then Employee add butonuna bas

  Scenario: Employee name aramada karakter hassasiyeti yok
    Given ArmaPuan sitesine git
    And Admin girisine tikla
    And Employee kutusuna tikla
    When Employee aramasi yap
    Then Employee aramasini kontrol et


  #2. EKRAN SENARYOLARI : CREATE MANAGER
  Scenario: Manager kayıtta aynı ID kullanılırsa hata verecek
    Given ArmaPuan sitesine git
    And Admin girisine tikla
    And Manager kutusuna tikla
    When Ayni manager ID'yi gir
    Then Ayni manager ID hatasini yakala

  Scenario: Manager kayıtta sorun yoksa add butonuna bas
    Given ArmaPuan sitesine git
    And Admin girisine tikla
    And Manager kutusuna tikla
    When Manager bilgilerini gir
    Then Manager add butonuna bas

  Scenario: Manager name aramada karakter hassasiyeti yok
    Given ArmaPuan sitesine git
    And Admin girisine tikla
    And Manager kutusuna tikla
    When Manager aramasi yap
    Then Manager aramasini kontrol et


  #3. EKRAN SENARYOLARI : CREATE PRODUCT
  Scenario: Product kayıtta aynı ID kullanılırsa hata verecek
    Given ArmaPuan sitesine git
    And Admin girisine tikla
    And Product kutusuna tikla
    When Ayni product ID'yi gir
    Then Ayni product ID hatasini yakala

  Scenario: Product kayıtta sorun yoksa add butonuna bas
    Given ArmaPuan sitesine git
    And Admin girisine tikla
    And Product kutusuna tikla
    When Product bilgilerini gir
    Then Product add butonuna bas

  Scenario: Product name aramada karakter hassasiyeti yok
    Given ArmaPuan sitesine git
    And Admin girisine tikla
    And Product kutusuna tikla
    When Product aramasi yap
    Then Product aramasini kontrol et


  #4. EKRAN SENARYOLARI : INQUIRY REQUESTS
  Scenario: Answer kutusu boşsa send butonu aktive olmayacak
    Given ArmaPuan sitesine git
    And Admin girisine tikla
    And Inquiry logosuna tikla
    And Answer kutusunu sec
    When Answer yaz
    Then Send butonuno bas


  #5. EKRAN SENARYOLARI : INQUIRY REQUESTS DEATAİLS
  Scenario: Formdaki email ve destek talebindeki email ayni mi
    Given ArmaPuan sitesine git
    And Admin girisine tikla
    And Inquiry logosuna tikla
    When Request employee ismini search et
    Then Requestteki ve tablodaki emailleri karsilastir

  #6. EKRAN SENARYOLARI : ANASAYFA
  Scenario: Logoya tıklayınca employee anasayfasına dönme
    Given ArmaPuan sitesine git
    And Employee girisine tikla
    And Spend ArmaPuan kutusuna tikla
    When Employee sayfasında ArmaPuan logosuna tikladiginda
    Then Employee anasayfasına dön

  Scenario: Select employee ekranında logoya tıklayınca manager anasayfasına dönme
    Given ArmaPuan sitesine git
    And Manager girisine tikla
    And Send armapuan kutusuna tikla
    When Select employee sayfasında ArmaPuan logosuna tikladiginda
    Then Manager anasayfasına dön

  Scenario: Select ArmaPuan ekranında logoya tıklayınca manager anasayfasına dönme
    Given ArmaPuan sitesine git
    And Manager girisine tikla
    And Send armapuan kutusuna tikla
    And Employee secimi yap
    And Employee secimi sonrası next butonuna bas
    When Select ArmaPuan sayfasında logoya tikladiginda
    Then Manager anasayfasına dön


  #7. EKRAN SENARYOLARI : SELECT EMPLOYEE
  Scenario: Employee secimi yapılmadan next butonu aktive olmayacak
    Given ArmaPuan sitesine git
    And Manager girisine tikla
    And Send armapuan kutusuna tikla
    When Employee secimi yap
    Then Employee secimi sonrası next butonuna bas

  Scenario: Employee name aramasi yaparken karakter hassasiyeti yok
    Given ArmaPuan sitesine git
    And Manager girisine tikla
    And Send armapuan kutusuna tikla
    When Send puan employee aramasi yap
    Then Send puan employee aramasini kontrol et

  Scenario: Uyarı kutucugu ciktiginda okay tusuna bas
    Given ArmaPuan sitesine git
    And Manager girisine tikla
    And Send armapuan kutusuna tikla
    When Yanlış send puan employee aramasi yap
    Then Okay tusuna bas


  #8. EKRAN SENARYOLARI : SEND ARMAPUAN
  Scenario: Puan secimi yapıldıktan sonra next butonuna tıklanacak
    Given ArmaPuan sitesine git
    And Manager girisine tikla
    And Send armapuan kutusuna tikla
    When Employee secimi yap
    Then Employee secimi sonrası next butonuna bas

  Scenario: Uyarı kutucugu çıktığında no butonuna basıldığında kapanacak
    Given ArmaPuan sitesine git
    And Manager girisine tikla
    And Send armapuan kutusuna tikla
    And Employee secimi yap
    And Employee secimi sonrası next butonuna bas
    And Puan secimi yap
    When Puan secimi sonrası next butonuna bas
    Then Alert box no tusuna bas

  Scenario: Uyarı kutucuğu ciktiğinda yes butonuna basıldiginda bilgi ekranı gelecek
    Given ArmaPuan sitesine git
    And Manager girisine tikla
    And Send armapuan kutusuna tikla
    And Employee secimi yap
    And Employee secimi sonrası next butonuna bas
    And Puan secimi yap
    And Puan secimi sonrası next butonuna bas
    When Alert box yes tusuna bas
    Then Bilgi ekranı görülecek

  Scenario: Employee bilgileri yazan kutuya tiklandiginda select employee ekranına döönecek
    Given ArmaPuan sitesine git
    And Manager girisine tikla
    And Send armapuan kutusuna tikla
    And Employee secimi yap
    And Employee secimi sonrası next butonuna bas
    When Employee bilg kutusuna tikla
    Then Select employee sayfasina don


  #9. EKRAN SENARYOLARI : SPEND ARMAPUAN
  Scenario: Product arama kutucuğunda karakter hassasiyeti yok
    Given ArmaPuan sitesine git
    And Employee girisine tikla
    And Spend ArmaPuan kutusuna tikla
    When Spend puan product aramasi yap
    Then Spend puan product aramasini kontrol et


  #10. EKRAN SENARYOLARI : CONTACT US
  Scenario: Email bos birakilamaz
    Given ArmaPuan sitesine git
    And Employee girisine tikla
    And Contact us logosuna tikla
    When Email kutusu bosken
    Then Email bos birakilamaz hatasini yakala

  Scenario: Subject bos birakilamaz
    Given ArmaPuan sitesine git
    And Employee girisine tikla
    And Contact us logosuna tikla
    When Subject kutusu bosken
    Then Subject bos birakilamaz hatasini yakala

  Scenario: Subject bos birakilamaz
    Given ArmaPuan sitesine git
    And Employee girisine tikla
    And Contact us logosuna tikla
    When Request kutusu bosken
    Then Request bos birakilamaz hatasini yakala

  Scenario: Reset butonuna basınc abütün kutucuklar boş olacak
    Given ArmaPuan sitesine git
    And Employee girisine tikla
    And Contact us logosuna tikla
    And Sample request yaz
    When Reset butonuna basildiginda
    Then Butun kutucuklar bos olacak
