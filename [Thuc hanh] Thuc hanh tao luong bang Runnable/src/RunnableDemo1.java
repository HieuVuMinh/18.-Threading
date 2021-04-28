public class RunnableDemo1 implements Runnable{
    private final String name;

    public RunnableDemo1(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread: " + name + ", " + i);
                Thread.sleep(500);
            }
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
