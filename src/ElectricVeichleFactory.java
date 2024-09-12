public class ElectricVeichleFactory implements VeichleFactory {
    @Override
    public Car createCar() {
        return new ElectricCar();
    }

    @Override
    public Motorcycle createMotorcycle() {
        return new ElectricMotorcycle();
    }
}
