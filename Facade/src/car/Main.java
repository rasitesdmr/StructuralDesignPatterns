package car;

public class Main {
    public static void main(String[] args) {
        CarEngineFacade carEngineFacade = new CarEngineFacade();
        carEngineFacade.startEngine();
        System.out.println("----------------");
        carEngineFacade.stopEngine();
    }
}
