public class EvenThread implements Runnable{
    @Override
    public void run() {
        System.out.println("Số chẵn");
        try {
            for (int i = 0; i <= 10; i++) {
                if (i % 2 == 0){
                    System.out.println(i);
                    Thread.sleep(15);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
