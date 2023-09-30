import java.util.Random;

public class LuckyRacer {
    public static void main(String[] args) {
        AutomaticCar car1 = new AutomaticCar("gli", 2020);
        AutomaticCar car2 = new AutomaticCar("xli", 2016);
        AutomaticCar car3 = new AutomaticCar("sonata", 2023);
        AutomaticCar car4 = new AutomaticCar("civic", 2020);
        AutomaticCar car5 = new AutomaticCar("proton", 2021);

        Random randomNum = new Random();

        int noOfRounds = 10;
        int i = 1;
        String str = "-";

        while (noOfRounds > 0) {

            car1.setSpeed(randomNum.nextInt(500) + 1);
            car2.setSpeed(randomNum.nextInt(500) + 1);
            car3.setSpeed(randomNum.nextInt(500) + 1);
            car4.setSpeed(randomNum.nextInt(500) + 1);
            car5.setSpeed(randomNum.nextInt(500) + 1);

            car1.setOdoMeter(car1.getOdoMeter() + car1.getSpeed());
            car2.setOdoMeter(car2.getOdoMeter() + car2.getSpeed());
            car3.setOdoMeter(car3.getOdoMeter() + car3.getSpeed());
            car4.setOdoMeter(car4.getOdoMeter() + car4.getSpeed());
            car5.setOdoMeter(car5.getOdoMeter() + car5.getSpeed());

            car1.setAvgGear(car1.getAvgGear() + car1.getGear());
            car2.setAvgGear(car2.getAvgGear() + car2.getGear());
            car3.setAvgGear(car3.getAvgGear() + car3.getGear());
            car4.setAvgGear(car4.getAvgGear() + car4.getGear());
            car5.setAvgGear(car5.getAvgGear() + car5.getGear());

            System.out.println("After " + i + " hours:");
            System.out.printf("Car 1 %s: %.2f km passed\n", str.repeat((int) (car1.getOdoMeter() / 100)), car1.getOdoMeter());
            System.out.printf("Car 2 %s: %.2f km passed\n", str.repeat((int) (car2.getOdoMeter() / 100)), car2.getOdoMeter());
            System.out.printf("Car 3 %s: %.2f km passed\n", str.repeat((int) (car3.getOdoMeter() / 100)), car3.getOdoMeter());
            System.out.printf("Car 4 %s: %.2f km passed\n", str.repeat((int) (car4.getOdoMeter() / 100)), car4.getOdoMeter());
            System.out.printf("Car 5 %s: %.2f km passed\n", str.repeat((int) (car5.getOdoMeter() / 100)), car5.getOdoMeter());

            noOfRounds--;
            i++;
        }

        double max_distance = car1.getOdoMeter();

        if (car2.getOdoMeter() > max_distance) {
            max_distance = car2.getOdoMeter();
        }
        if (car3.getOdoMeter() > max_distance) {
            max_distance = car3.getOdoMeter();
        }
        if (car4.getOdoMeter() > max_distance) {
            max_distance = car4.getOdoMeter();
        }
        if (car5.getOdoMeter() > max_distance) {
            max_distance = car5.getOdoMeter();
        }

        if (car1.getOdoMeter() == max_distance) {
            System.out.println(car1.getModel() + " is the winner");
            System.out.println("Mostly used gear during the journey was: " + (car1.getAvgGear() / 10));
        } else if (car2.getOdoMeter() == max_distance) {
            System.out.println(car2.getModel() + " is the winner");
            System.out.println("Mostly used gear during the journey was: " + (car2.getAvgGear() / 10));
        } else if (car3.getOdoMeter() == max_distance) {
            System.out.println(car3.getModel() + " is the winner");
            System.out.println("Mostly used gear during the journey was: " + (car3.getAvgGear() / 10));
        } else if (car4.getOdoMeter() == max_distance) {
            System.out.println(car4.getModel() + " is the winner");
            System.out.println("Mostly used gear during the journey was: " + (car4.getAvgGear() / 10));
        } else if (car5.getOdoMeter() == max_distance) {
            System.out.println(car5.getModel() + " is the winner");
            System.out.println("Mostly used gear during the journey was: " + (car5.getAvgGear() / 10));
        }

    }
}
