package lesson7.transport;

public abstract class GroundTransport extends Transport {
    int wheelQuantity;
    int consumption;
    public GroundTransport(double power, int maxSpeed, int weight, String brand,int wheelQuantity, int consumption){
        super (power, maxSpeed, weight, brand);
        this.wheelQuantity = wheelQuantity;
        this.consumption = consumption;
    }

    public GroundTransport(){

    }
}
