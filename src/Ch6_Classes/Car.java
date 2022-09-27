package Ch6_Classes;

public class Car {
    private int yearModel;
    private String make;
    private int speed;

    public Car(int yearModel, String make){
        this.yearModel = yearModel;
        this.make = make;
        this.speed = 0;
    }

    public int getSpeed() {
        return speed;
    }

    public int getYearModel() {
        return yearModel;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setYearModel(int yearModel) {
        this.yearModel = yearModel;
    }
    public void accelerate(){
        speed+=5;
    }
    public void brake(){
        speed-=5;
    }

    public static void main(String[] args) {
        Car test = new Car(1998, "Toyota");
        for (int i = 1; i <= 5; i++) {
            test.accelerate();

        }
        System.out.println(test.getSpeed());
        for (int i = 1; i <= 5; i++) {
            test.brake();
        }
        System.out.println(test.getSpeed());
    }
}
