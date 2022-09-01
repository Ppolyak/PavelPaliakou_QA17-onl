package lesson7;

import lesson7.transport.CivilTransport;
import lesson7.transport.FreightTransport;
import lesson7.transport.MilitaryTransport;
import lesson7.transport.PassengerTransport;

public class Main {
    public static void main(String[] args) {
        CivilTransport Airbus = new CivilTransport(3,true, 1000, 900, 1500,
                "AirBus", 25, 3000);
        Airbus.perevod();
        System.out.println(Airbus);
        Airbus.capacity();
        MilitaryTransport Maverik = new MilitaryTransport(false, 6, 1200, 1100,
                3500, "us", 10, 500);
        Maverik.perevod();
        System.out.println(Maverik);
        Maverik.ejection();
        PassengerTransport Bymer = new PassengerTransport("sedan",5,249,250,
                1890, "BMW", 4, 15);
        Bymer.perevod();
        System.out.println(Bymer);
        Bymer.task();

        FreightTransport Maz = new FreightTransport(3500, 300, 90, 6500, "Kamaz",
                8, 25);
        Maz.perevod();
        System.out.println(Maz);
        Maz.loading();

    }
}
