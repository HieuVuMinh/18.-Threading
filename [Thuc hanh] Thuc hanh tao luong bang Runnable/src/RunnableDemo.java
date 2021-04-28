public class RunnableDemo implements Runnable{
    private final String threadName;

    public RunnableDemo(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread: " + threadName + ", " + i);
                Thread.sleep(500);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Thread exiting.");
    }
}
