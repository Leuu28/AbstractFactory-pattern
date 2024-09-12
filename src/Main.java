public class Main {
    public static void main(String[] args) {
        String fuelType = "gas";
        VeichleFactory factory;

        if (fuelType.equals("gas")){
            factory = new GasVeichleFactory();
        }else {
            factory = new ElectricVeichleFactory();
        }

        VeichleCreator creator = new VeichleCreator(factory);
        creator.testVeichles();
    }
}