# Composite ? 
* Nesneleri ağaç yapılar halinde oluşturmanıza ve ardından bu yapılarla tek tek nesnelermiş gibi çalışmanıza
olanak tanıyan yapısal bir tasarım modelidir.

## Deseni Şu Şekilde Ayırabiliriz ? 
* component : kompozisyondaki tüm nesneler için temel arayüzdür. Alt kompozitleri yönetmek için yaygın
yöntemlere sahip bir arayüz veya soyut bir sınıf olmalıdır.
* leaf : temel bileşenin varsayılan davranışını uygular. Diğer nesnelere bir referans içermez.
* composite : yaprak elementlere sahiptir. Temel bileşen yöntemlerini uygular ve alt 
öğeyle ilgili işlemleri tanımlar.
* client : temel bileşen nesnesini kullanarak kompozisyon öğelerine erişimi vardır.

* Şuan biraz kafa karışıklığı olmuş olabilir . Hadi gelin örnekler yardımıyla anlatalım .

## Örnek ? 

