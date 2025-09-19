class Vehicle {
    protected String brand = "Ford";
    private int speed;

    public void speedUp() {
        speed += 10;
    }

    public int getSpeed() {
        return speed;
    }

    public void honk() {
        System.out.println("Tuut, tuut!");
    }
}

class Car extends Vehicle {
    private String modelName = "Mustang";

    @Override
    public void speedUp() {
        super.speedUp();
        System.out.println("Car speed increased by 22 units.");
    }

    @Override
    public void honk() {
        super.honk(); // Call the parent class method
        System.out.println("Car honk: Beep beep!");
    }
}

class Motorcycle extends Vehicle {
    private String modelName = "Harley-Davidson";

    @Override
    public void speedUp() {
        super.speedUp();
        System.out.println("Motorcycle speed increased by 12 units");
    }

    @Override
    public void honk() {
        super.honk(); // Call the parent class method
        System.out.println("Motorcycle honk: Vroom vroom!");
    }
}

// Main class to run the program
public class VehicleDemo {
    public static void main(String[] args) {
        Car myCar = new Car();
        Motorcycle myBike = new Motorcycle();
        System.out.println("Car initial speed: " + myCar.getSpeed());
        System.out.println("Motorcycle initial speed: " + myBike.getSpeed());
        myCar.speedUp();
        myBike.speedUp();

        System.out.println("\nCar speed after speeding up: " + myCar.getSpeed());
        System.out.println("Motorcycle speed after speeding up: " + myBike.getSpeed());
        System.out.println("\nCar honking:");
        myCar.honk();
        System.out.println("Motorcycle honking:");
        myBike.honk();
    }
}