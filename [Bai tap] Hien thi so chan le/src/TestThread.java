public class TestThread {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main kiểm tra số chẵn lẻ: ");

        Thread thread1 = new Thread(new OddThread());
        Thread thread2 = new Thread(new EvenThread());

        thread1.start();
        thread1.join();
        thread2.start();
        System.out.println("Main kiểm tra số chẵn lẻ kết thúc");
    }
}
