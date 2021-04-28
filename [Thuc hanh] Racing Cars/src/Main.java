public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Ducati");
        Car car2 = new Car("BWM");
        Car car3 = new Car("yamaha");

        Thread thread1 = new Thread(car1);
        Thread thread2 = new Thread(car2);
        Thread thread3 = new Thread(car3);

        System.out.println("Distace: 100km");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
