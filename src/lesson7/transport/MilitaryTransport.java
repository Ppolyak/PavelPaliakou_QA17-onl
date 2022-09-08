package lesson7.transport;

public class MilitaryTransport extends AirTransport{
    boolean ejectionSystem;
    int rocketQuantity;

    public MilitaryTransport(boolean ejectionSystem, int rocketQuantity, double power, int maxSpeed, int weight,
                             String brand, int wingspan, int minDistance) {
        super(power, maxSpeed, weight, brand, wingspan, minDistance);
        this.ejectionSystem = ejectionSystem;
        this.rocketQuantity = rocketQuantity;
    }

    public void shoot(int rocketQuantity){
        if (rocketQuantity != 0){
            System.out.println(" Rocket gone ");
        }
        else {
            System.out.println(" There are no rockets");
        }
    }

    @Override
    public void perevod() {
        powerKv = Math.ceil(power * 0.74);
    }

    @Override
    public String toString() {
        return "Military plane {"
                + "Passenger Quantity = '" + rocketQuantity + '\''
                + ", business class = " + ejectionSystem
                + ", power = " + power
                + ", max speed = " + maxSpeed
                + ", weight = " + weight
                + ", brand = " + brand
                + ", wingspan = " + wingspan
                + ", min distance = " + minDistance + " km "
                + ", power in Kv = " + powerKv
                + '}';
    }

    public void ejection() {
        if (!ejectionSystem){
            System.out.println(" No ejection system ");
        }
        else {
            System.out.println(" The ejection was successful ");
        }
    }
}
