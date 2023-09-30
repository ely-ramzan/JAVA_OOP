public class AutomaticCar {
    private String model;
    private int year;
    private double speed;
    private int gear;
    private double odoMeter = 0;
    private int avg_gear;

    public AutomaticCar(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return this.model;
    }

    public int getYear() {
        return this.year;
    }

    public void setSpeed(double speed) {
        if (speed < 0) {
            System.out.println("Speed should not be negative ...!");
        } else {
            this.speed = speed;
            setGear();
        }
    }

    public double getSpeed() {
        return this.speed;
    }

    public void setOdoMeter(double distance) {
        this.odoMeter = distance;
    }

    public double getOdoMeter() {
        return this.odoMeter;
    }

    public void setAvgGear(int avgGear) {
        this.avg_gear = avgGear;
    }

    public int getAvgGear() {
        return this.avg_gear;
    }

    private void setGear() {
        if (speed == 0) {
            gear = 0;
        } else if (speed > 0 && speed < 101) {
            gear = 1;
        } else if (speed > 100 && speed < 201) {
            gear = 2;
        } else if (speed > 200 && speed < 301) {
            gear = 3;
        } else if (speed > 300 && speed < 401) {
            gear = 4;
        } else if (speed > 400 && speed < 501) {
            gear = 5;
        } else {
            System.out.println("SPEED NOT IN LIMIT...!");
        }
    }

    public int getGear() {
        return this.gear;
    }
}
