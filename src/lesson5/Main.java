package lesson5;

public class Main {

    public static void main(String[] args) {
        Computer dell = new Computer(true,true,true,20);
        Computer lenovo = new Computer(true,false,true,0);

        dell.computerDescription();
        lenovo.computerDescription();
        dell.switchOn();
        lenovo.switchOn();
        if (lenovo.isRam()){
            lenovo.switchOn();
        } else {
            lenovo.setRam(true);
            lenovo.switchOn();
        }
        lenovo.computerDescription();
        dell.switchOff();
        dell.computerDescription();
        lenovo.switchOff();
        lenovo.computerDescription();
    }
}
