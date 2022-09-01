package lesson7.transport;

public class PassengerTransport extends GroundTransport {
    int distance;

    int toplivoYshlo;
    String bodyType;
    int passengerQuantity;
    public PassengerTransport(String bodyType,int passengerQuantity , double power, int maxSpeed, int weight,
                              String brand,int wheelQuantity, int consumption) {
        super (power, maxSpeed, weight, brand, wheelQuantity, consumption);
        this.passengerQuantity = passengerQuantity;
        this.bodyType = bodyType;
    }


    private void cons(){
        toplivoYshlo = (consumption * distance) / 100;
        System.out.println(" Amount of fuel used " + toplivoYshlo);
    }

    public void task(){
        System.out.print("Enter time (in hours) ");
        int time = scanner.nextInt();
        distance = time * maxSpeed;
        toplivoYshlo = (consumption * distance) / 100;
        System.out.println("For time " + time + "h, " + "vehicle " + brand +  " moving at maximum speed " +
                maxSpeed + " km/h " + " travel " + distance + " km and consume "  + toplivoYshlo +
                " liters of fuel");
    }

    @Override
    public void perevod() {
        powerKv = Math.ceil(power * 0.74);
    }

    @Override
    public String toString() {
        return "Passenger car {"
                + "Body type = '" + bodyType + '\''
                + ", Passenger quantity = " + passengerQuantity
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
