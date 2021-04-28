public class Main {
    public static void main(String[] args) {
        Thread numberGenerator1 = new Thread(new NumberGenerator("Ducati"),"numberGenerator1");
        Thread numberGenerator2 = new Thread(new NumberGenerator("Yamaha"),"numberGenerator2");

        System.out.println("Start\n");
        numberGenerator1.setPriority(Thread.MIN_PRIORITY);
        numberGenerator2.setPriority(Thread.MAX_PRIORITY);
        numberGenerator1.start();
        numberGenerator2.start();
    }
}
