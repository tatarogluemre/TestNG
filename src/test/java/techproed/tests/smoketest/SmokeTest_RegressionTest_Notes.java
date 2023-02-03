package techproed.tests.smoketest;

public class SmokeTest_RegressionTest_Notes {
    /*
    SMOKE TEST
Smoke Test nedir? : Uygulamanin stabil durumda oldugunu, ve onemli özelliklerin calisir oldugunu test edilir
Login
Checkin
Checkout
Add to card
Make payment
Sign out
……
Ne sıklıkla yapılır?
Her sabah 8 am civarı
Ne kadar surer?
15-20 dakika
Smoke Test I nasıl yaparsın?
Smoke test suite klasorumuz var. Bu klasordeki test leri hergun calistiririz.
Aslinda jenkins her sabah 8 am de smoke testleri calistirir ve raporları takıma email atar. Testerlar bu raporu inceler ve fail varsa takıma email atar.
Virtual Machine(VM-Sanal Bilgisayar) test caselerin calismasi icin kullanilabilir.
Smoke test suite de kac test case iniz var
18 tane
Tum smoke test caseleriniz automate edilmismidir? Manual de varmidir?
Tum onemli test casesler automate edilmiştir.
Hangi testlerin smoke test e eklenecegine Kim karar verir?
Test Lead, Sr. Automation Testers. En kidemli tester.

REGRESSION TEST
Regression Test Nedir? : Tum ana, major, onemli fonksiyonların test edildiği testlerdir
Regression kapsamlı bir testdir:
Smoke test+(muster profili ile yapilsin)
Diger müşteri hizmetleri, admin, tech support
Farkli odeme sitemleri(PayPal, amex, visa, Mastercard, WU, BTC,…)
Ne sıklıkla yapılır?
Production bug fix lerden sonra
Major(ana) releaselerden once
Biz 6 ayda bir major release yapariz ve bu releaselerden once regression test yapılır
Ne kadar surer?
6-7 saat surer
Bazi regression test casele automate edilmemiş ise o zaman manual test gerekir. Bu durum test suresi uzar
Regression suite de kac test case iniz var
400 den fazla test case var
Tum regression test caseleriniz automate edilmismidir? Manual de varmidir?
Takim olarak hedefimiz tum regression test caselerinin automate edilmesidir. Fakat, bu çok mumkun olmuyor.
Genelde yuzde 80 den fazla oranda automate ediyoruz
Hangi testlerin regregression test e eklenecegine Kim karar verir?
Test Lead. Sr. Automation Testers. QA.  En kidemli tester.
Otomate edilemeyen bir durum betirmisiniz?
Dogrulama gerekdiren storylerde automate edemiyoruz. Cunki doğrulama telefondaki mobil uygulara geliyor
Asiri guvenlikli durumlar.
Bazi teknik user storyler sadece developerlarla alakalı olabiliyor.
Testerlarin onların kullandigi environmentlara accesleri olmayabiliyor.
Dolayisiyla bu grubu durumlarda biz automate edemiyoruz
     */
}
