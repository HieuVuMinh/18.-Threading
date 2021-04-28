import java.util.Random;
import java.util.Scanner;

public class Car implements Runnable{
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        // Khởi tạo điểm bắt đầu
        int runDistance = 0;
        // Khởi tạo thời gian bắt đầu cuộc đua
        long startTime = System.currentTimeMillis();

        int distance = 100;
        int step = 5;

        while (runDistance < distance){
            try {
                // Khởi tạo tốc độ random từ 0 - 20
                int speed = (new Random()).nextInt(20);
                // Tính toán khoảng cách sẽ đi được
                runDistance += speed;

                String log = "|";
                int percentTravel = (runDistance * 100) / distance;

                for (int i = 0; i < distance; i += step) {
                    if (percentTravel >= i + step){
                        log += "=";
                    } else if (percentTravel >= i && percentTravel < i + step){
                        log += "o";
                    }else {
                        log += "-";
                    }
                }
                log += "|";
                System.out.println("Car " + name + ": " + log + " " + Math.min(distance, runDistance) + "Km");
                Thread.sleep(1000);
            }catch (Exception e){
                System.out.println("Car " + this.name + " is broken...");
                break;
            }
        }
        long enTime = System.currentTimeMillis();
        System.out.println("Car " + this.name + " finish in " + (enTime - startTime) / 100 + "s");
    }
}
