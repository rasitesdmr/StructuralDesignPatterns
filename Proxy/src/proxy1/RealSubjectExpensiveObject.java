package proxy1;

public class RealSubjectExpensiveObject implements SubjectExpensiveObject {

    public RealSubjectExpensiveObject() {
        heavyInitialConfiguration();
    }

    @Override
    public void process() {
        System.out.println("İşleme tamamlandı");
    }

    public void heavyInitialConfiguration() {
        System.out.println("İlk yapılandırma Yükleniyor");
    }
}
