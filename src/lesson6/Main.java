package lesson6;

public class Main {
    public static void main(String[] args) {
        Phone s = new Phone(11111, "sad", 520);
        Phone w = new Phone(22222, "www", 250);
        Phone c = new Phone(333333, "eeee", 760);

        System.out.println(s);
        System.out.println(w);
        System.out.println(c);

        s.receiveCall(s.getNumber());
        w.receiveCall(w.getNumber());
        c.receiveCall(c.getNumber());

        s.getNumber(s.getNumber());
        w.getNumber(w.getNumber());
        c.getNumber(c.getNumber());

        String nameS = s.receiveCall(s.getNumber());
        String nameW = w.receiveCall(w.getNumber());
        String nameC = c.receiveCall(c.getNumber());

        s.receiveCall(s.getNumber(), nameS);
        w.receiveCall(w.getNumber(), nameW);
        c.receiveCall(c.getNumber(), nameC);

        s.sendMessage(s.getNumber());
        w.sendMessage(w.getNumber());
        c.sendMessage(c.getNumber());
    }
}
