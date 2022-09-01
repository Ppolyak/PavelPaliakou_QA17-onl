package lesson7.transport;

public class CivilTransport extends AirTransport{
    int passengerQuantity;
    boolean businessClass;

    public CivilTransport(int passengerQuantity, boolean businessClass,double power, int maxSpeed, int weight,
                          String brand, int wingspan, int minDistance) {
        super(power, maxSpeed, weight, brand, wingspan, minDistance);
        this.passengerQuantity = passengerQuantity;
        this.businessClass = businessClass;
    }


    @Override
    public void perevod() {
        powerKv = Math.ceil(power * 0.74);
    }

    public void capacity(){
        System.out.print(" Enter passenger quantity : ");
        int kolvo = scanner.nextInt();
        if (kolvo > passengerQuantity){
            System.out.println("Quantity doesn't fit");
        }
        else {
            System.out.println("Quantity fit ");
        }
    }

    @Override
    public String toString() {
        return "Civil plane {"
                + "Passenger Quantity = '" + passengerQuantity + '\''
                + ", business class = " + businessClass
                + ", power = " + power
                + ", max speed = " + maxSpeed
                + ", weight = " + weight
                + ", brand = " + brand
                + ", wingspan = " + wingspan
                + ", min distance = " + minDistance + " km "
                + ", power in Kv = " + powerKv
                + '}';
    }
}
