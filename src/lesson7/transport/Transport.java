package lesson7.transport;

import java.util.Scanner;

public abstract class Transport {
    Scanner scanner = new Scanner(System.in);

    double powerKv;
    double power;
    int maxSpeed;
    int weight;
    String brand;

    public Transport(double power, int maxSpeed, int weight, String brand){
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.brand = brand;
    }

    public Transport(){

    }
    public abstract void perevod();
}
