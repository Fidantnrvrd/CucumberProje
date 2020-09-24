@ebayarama
  Feature: Ebayda Arama
    Scenario Outline: TC06_kullanici ebayda urun arar
      Given kullanici "http://ebay.com" sayfasina gider
      And kullanici arama kutusuna "<urunler>" yazar
      Then kullanici ebaydaki sonuc sayisini ekrana yazar


      Examples: Test Verileri
      |urunler|
      |araba  |
      |bebek arabasi|
      |bisiklet     |


