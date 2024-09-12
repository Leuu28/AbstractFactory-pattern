public class VeichleCreator {
    private Car car;
    private Motorcycle motorcycle;

    public VeichleCreator(VeichleFactory veichleFactory){
        car = veichleFactory.createCar();
        motorcycle = veichleFactory.createMotorcycle();
    }

    public void testVeichles(){
        car.drive();
        motorcycle.ride();
    }
}
