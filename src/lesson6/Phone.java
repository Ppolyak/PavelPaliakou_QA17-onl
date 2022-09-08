package lesson6;

public class Phone {

    private int number;
    private String model;
    private double weight;

    public Phone(int number, String model, double weight){
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone (int number, String model){
        this.number = number;
        this.model = model;
    }

    public Phone(){

    }

    @Override
    public String toString() {
        return "[\"" + number + "\", \"" + model + "\", \"" + weight + "\"]";
    }

    public String receiveCall(int number){
        String name = null;

        switch (number){
            case 11111:
                name = "asd";
                System.out.println(name +  " calling");
                break;
            case 22222:
                name = "asdddsa";
                System.out.println(name +  " calling");
                break;
            case 333333:
                name = "asdddddaaad";
                System.out.println(name +  " calling");
                break;
            default:
                System.out.println("XZ");
        }
        return name;
    }

    public void receiveCall(int number, String name){
        if (name == null){
            System.out.println("Unknown number");
        }
        else {
            System.out.println(name + number);
        }
    }

    public void getNumber(int number){
        System.out.println("Phone number " + number);
    }

    public int sendMessage(int ... Number){
        System.out.println("Message to " + number);
        return number;
    }

    public int getNumber(){
        return number;
    }

    public void setNumber(int number){
        this.number = number;
    }

    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public double getWeight(){
        return weight;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

}
