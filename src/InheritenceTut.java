public class InheritenceTut {
    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.go();
        Bicycle bike = new Bicycle();
        bike.stop();

        System.out.println(bus.windows);
        System.out.println(bike.pedals);
    }
}
