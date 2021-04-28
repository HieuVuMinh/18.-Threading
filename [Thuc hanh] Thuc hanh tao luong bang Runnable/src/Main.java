public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Main Start\n");

        RunnableDemo runnableDemo1 = new RunnableDemo("Hiếu 1");
        Thread thread1 = new Thread(runnableDemo1);

        RunnableDemo1 runnableDemo2 = new RunnableDemo1("Hiếu 2");
        Thread thread2 = new Thread(runnableDemo2);

        thread1.start();
        thread2.start();

        Thread.sleep(4000);

        thread1.join();
        System.out.println("\nMain close");
    }
}
