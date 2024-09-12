public class GasVeichleFactory implements VeichleFactory{
    @Override
    public Car createCar() {
        return new GasCar();
    }

    @Override
    public Motorcycle createMotorcycle() {
        return new GasMotorcycle();
    }
}
