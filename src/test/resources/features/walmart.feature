@walmart
  Feature: Walmart Urun Arama
    Scenario Outline: TC08_kullanici walmarta urun arama yapar
      Given kullanici "https://walmart.com" sayfasina gider
      And kullanici walmart aramakutusuna "<kelime>" yazar ve arar
      Then kullanici walmart sonuc sayisini ekrana yazdirir


      Examples:Test Verileri
        | kelime   |
        |calculator|
        |watch     |
        |flower    |



