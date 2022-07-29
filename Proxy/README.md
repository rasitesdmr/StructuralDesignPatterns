# Proxy ?

* Proxy , başka bir nesne için bir yedek veya yer tutucu sağlamanıza olanak tanıyan yapısal
  bir tasarım modelidir. Bir proxy, orijinal nesneye erişimi kontrol ederek, istek orijinal nesneye
  ulaşmadan önce veya sonra bir şeyler gerçekleştirmenize izin verir.

## Üç farklı durumda Proxy D.P. kullanılır ?

* Remote(Uzak) Proxy : Remote(uzak) bir nesne kullanılacağı durumlarda kullanılabilir.
  Uzaktaki nesneye local bir temsilci sağlar ve gerekli kontrolleri yapmamıza olanak tanır.
* Virtual Proxy (Sanal) : Üretimi yahut kullanımı maliyetli nesnelerin oluşturulması veya kullanılması için
  tercih edilir. Buna örnek olarak genelde herkesin dillendirdiği resim yükleme işlevini verebiliriz.
  Yüksek boyutlu bir resmin boyutundan dolayı geç yüklenmesi durumunda verilen -yükleniyor- mesajı ve ardından
  yükleme işlemi bittiği anda resmin gösterilmesinde kullanılabilir.
* Protection Proxy (Koruma) : Yetkilendirme yahut login durumlarında kullanılabilir.

## Proxy Deseni Bu Üç Duruma Göre Haraket Edilecektir ?

* Client : İstemcidir.
* Subject : İstemcinin tek bir tip ile çalışmasını sağlayacak olan Interface yahut abstract class’ımızdır.
  Real Subject ve Proxy nesnelerimizin türediği yapıdır.
* Real Subject : O anki işin asıl çalışmasını gerçekleştirecek olan gerçek nesnemizdir.
* Proxy : Vekil sınıfımızdır. İçerisinde Real Subject referansını taşıyarak istemcinin isteklerine cevap verecektir.
  Doğal olarak istemci gerçek nesneye dolaylı yoldan Proxy üzerinden erişebilecektir.