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

* Leaf : Tekil objemizi temsil eder.
* Composite : Componentlerin bir araya gelerek oluşturuğu sınıftır.
* Component : Hem composite hem de component classının türeyeceği interface’dir. 
İstenilirse abstract class olarak da tanımlanabilir.

* Bir fotoğraf albümü oluşturduğumuzu düşünün. Bu fotoğraf albümünün özelliği her fotoğraf 
albümünde olduğu gibi bir fotoğrafın ismine tıklandığında o fotoğrafı göstermesi ve 
albüm ismine tıklandığında da o albümdeki fotoğrafların hepsini göstermesi. Buradan anlayacağınız 
üzere bu senaryodaki leaf’imiz tekil bir fotoğraf. Composite’imiz ise fotoğraf albümüdür. Senaryoyu biraz daha 
kalıplaştırırsak , bu senaryoda composite tasarım kalıbı kullanmak istediğimizde kurgu aşağıdaki gibi olacaktır.

* Leaf : Tekil Fotoğraf
* Composite : Fotoğraf albümü
* Operation :   Fotoğrafın açılması ve görüntülenmesi (open-view)