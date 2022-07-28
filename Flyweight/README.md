# Flyweight Design Pattern ? 

* Flyweight, dilimize “sinek siklet” olarak çevrilebilir
* “Sinek siklet”ten kasıt, ufak-tefek olan nesnelerdir.
* Flyweight pattern , nesne üretiminden kaynaklı bellek kullanımını minimize etmemizi sağlayan bir tasarım kalıbıdır .
* Eğer bellek tüketimi , çok fazla nesnenin bir arada ele alınmasından kaynaklı ortaya çıkıyorsa burada flyweight 
tasarım kalıbını kullanırız.
* Peki flyweight tasarım kalıbı bu bellek kullanımı minimize etme işlemini nasıl yapıyor ?
* Flyweight tasarım kalıbı havuz mantığıyla çok kullanılan nesnelerin yaratma işlemini azaltmayı sağlar.
* Flyweight tasarım kalıbının yapısına değinecek olursak , bu patternde FlyweightFactory dediğimiz bir classımız vardır.
* Bu class içerisinde Flyweight classının kalıtımını alan classların yani tekrar tekrar üreteceğimiz
classların listesini tutar ve bir metot ile clienta bu listeye erişim verir. 
* Client bu metot üzerinden bir nesne üretmek istediği zaman, metot önce bu nesne elindeki listede yani nesne 
havuzunda var mı diye bakar. Var ise bu listeden verir. Yok ise de önce bu listeye ekler sonra da eklediğini verir.


## Flyweight Nesnesinin Durumları ?
* İçsel ya da asıl durum
* Dışsal ya da ikincil durum 

* İçsel durum, sinek siklet nesnenin temsil ettiği asıl durum iken dışsal durum,
içinde bulunduğu bağlam tarafından belirlenen durumdur.
* Uygulamarda içsel durumu aynı ama dışsal durum farklı çok sayıda nesneye ihtiyaç duyulur.

## Örnek Verelim ?
* Oyun yazılımında bir askerin giyisisi içsel durum iken koordinatları yani bulunduğu yer dışsal durumdur.
