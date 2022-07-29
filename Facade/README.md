# Facade ? 
* Basitçe söylemek gerekirse, bir cephe basit bir arayüzün arkasındaki karmaşık bir alt sistemi kapsar. 
Karmaşıklığın çoğunu gizler ve alt sistemin kullanımını kolaylaştırır.
* Ayrıca, karmaşık alt sistemi doğrudan kullanmamız gerekirse, bunu yine de yapabiliriz; 
her zaman cepheyi kullanmak zorunda değiliz.
* Çok daha basit bir arayüzün yanı sıra, bu tasarım modelini kullanmanın bir faydası daha var. 
Bir istemci uygulamasını karmaşık alt sistemden ayırır. Bu sayede mevcut alt sistemde değişiklik 
yapabiliyoruz ve bir istemciyi etkilemiyoruz.

# Örnek Verlim ? 

<img src=""/>

* Arabanın motorunu çalıştırıp durdurmak istiyoruz .
* Çalıştırmak için ;

```text
airFlowController.takeAir();
fuelInjector.on();
fuelInjector.inject();
starter.start();
coolingController.setTemperatureUpperLimit(DEFAULT_COOLING_TEMP);
coolingController.run();
catalyticConverter.on();
```
* Durdurmak için ;

```text
fuelInjector.off();
catalyticConverter.off();
coolingController.cool(MAX_ALLOWED_TEMP);
coolingController.stop();
airFlowController.off();
```
* Görüldüğü gibi karışık bir yöntem .
* Bunun yerine CarEngineFacade sınıfı oluştururuz . Bunun içine startEngine() ve stopEngine() metotlarıyla basit
bir şekilde uygulayabiliriz .