package lesson7.transport;

public abstract class AirTransport extends Transport{
    int wingspan;
    int minDistance;
    public AirTransport(double power, int maxSpeed, int weight, String brand, int wingspan, int minDistance){
        super (power, maxSpeed, weight, brand);
        this.wingspan = wingspan;
        this.minDistance = minDistance;
    }
    public AirTransport(){

    }

    public abstract void perevod();
}
