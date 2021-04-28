public class NumberGenerator implements Runnable {
    private String name;

    public NumberGenerator(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread name: " + name + " has ID: " + i);
                Thread.sleep(500);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
