package proxy1;

public class Proxy implements SubjectExpensiveObject{
    SubjectExpensiveObject subjectExpensiveObject;

    @Override
    public void process() {
        if (subjectExpensiveObject == null){
            subjectExpensiveObject = new RealSubjectExpensiveObject();
        }
        subjectExpensiveObject.process();
    }
}
