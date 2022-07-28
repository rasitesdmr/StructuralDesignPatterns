public class MovableAdapterImpl implements MovableAdapter {

    private Movable movable;

    public MovableAdapterImpl(Movable movable) {
        this.movable = movable;
    }

    private double hiziKmphYeDonustur(double mph) {
        return mph * 1.60934;

    }

    @Override
    public double getSpeed() {
        double mph = movable.getSpeed();
        return hiziKmphYeDonustur(mph);
    }

}
