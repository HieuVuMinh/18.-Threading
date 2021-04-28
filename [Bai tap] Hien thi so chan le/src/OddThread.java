public class OddThread implements Runnable {

    @Override
    public void run() {
        System.out.println("Số lẻ: ");
        try {
            for (int i = 0; i <= 10; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                    Thread.sleep(10);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
