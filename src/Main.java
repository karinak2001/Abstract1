public class Main {
    public static void main(String[] args) {

        Bus bus1 = new Bus();
        Truck truck1 = new Truck();
        Ship ship1 = new Ship();

        System.out.println(bus1.goToBase());
        System.out.println(truck1.goToBase());
        System.out.println(ship1.goToBase());
        ship1.accelerate(25);

        System.out.println(ship1.getSpeed());
    }
}