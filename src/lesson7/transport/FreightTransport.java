package lesson7.transport;

public class FreightTransport extends GroundTransport {
    int loadCapacity;

    public FreightTransport(int loadCapacity, double power, int maxSpeed, int weight,
                              String brand,int wheelQuantity, int consumption) {
        super (power, maxSpeed, weight, brand, wheelQuantity, consumption);
        this.loadCapacity = loadCapacity;
    }

    public void loading(){
        System.out.print(" Enter loading size ");
        int size = scanner.nextInt();
        if (size > loadCapacity){
            System.out.println(" You need bigger truck");
        }
        else {
            System.out.println(" Successfully loaded ");
        }
    }

    @Override
    public void perevod() {
        powerKv = Math.ceil(power * 0.74);
    }

    @Override
    public String toString() {
        return "Freight car {"
                + "Load capacity = '" + loadCapacity + '\''
                + ", power = " + power
                + ", max speed = " + maxSpeed
                + ", weight = " + weight
                + ", brand = " + brand
                + ", wheel quantity = " + wheelQuantity
                + ", consumption = " + consumption + " l/100 km "
                + ", power in Kv = " + powerKv
                + '}';
    }
}
