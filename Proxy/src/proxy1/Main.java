package proxy1;

public class Main {
    public static void main(String[] args) {
        SubjectExpensiveObject subjectExpensiveObject = new Proxy();
        subjectExpensiveObject.process();
        subjectExpensiveObject.process();
    }
}
