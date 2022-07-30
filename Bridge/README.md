# Bridge ?

<img src = "https://github.com/rasitesdmr/StructuralDesignPatterns/blob/master/image/bridge.png" />

* Birbirleriyle yakından ilişkili sınıfların birbirinden bağımsız olarak geliştirilebilen soyutlama
  ve uygulama olmak üzere iki gruba ayırmamızı sağlar.
* Soyutlamalar yaparak daha esnek yapılar oluşmasını sağlar 

<img src = "https://github.com/rasitesdmr/StructuralDesignPatterns/blob/master/image/problem-en.png" />

* Yukarıdaki resimde şekillerimiz ve renklerimiz var bir sıkıntı yok gibi ama diyelimki üçgen eklemek istiyorum 
kırmızı üçgen , mavi üçgen vb şekiiler eklediğimizde iş karmaşıklaşmaya başlıyor . Kalabalık bir sınıf yapısı oluyor.

* Böyle bir hiyerarşi oluşturursak sadece şekil ekleyip istediğimiz rengi seçebiliriz .

* Şimdi gelelim yapmış olduğum örneğe 
* Burada Shape sınıfına ve ondan türeyen (Square , Triangle) sınıflara bakalım .
* Varsayılan Constructor üyeleri Color inteface'ini parametre olarak alıyorlar.
* Böyelece ben dilediğim şekilde renkler üretebiliyorum
