package Abstraction_or_Packages_or_ExceptionHandling.Packages;

// Single Java file for all classes in one place

abstract class Vehicle {
    public abstract String getModelName();
    public abstract String getRegistrationNumber();
    public abstract String getOwnerName();
}

// Subpackage: com.automobile.twowheeler
class Hero extends Vehicle {
    private String modelName;
    private String registrationNumber;
    private String ownerName;
    private int speed;

    public Hero(String modelName, String registrationNumber, String ownerName, int speed) {
        this.modelName = modelName;
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.speed = speed;
    }

    @Override
    public String getModelName() {
        return modelName;
    }

    @Override
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    @Override
    public String getOwnerName() {
        return ownerName;
    }

    public int getSpeed() {
        return speed;
    }

    public void radio() {
        System.out.println("Radio is ON - Playing music in Hero vehicle.");
    }
}

// Subpackage: com.automobile.fourwheeler
class Honda extends Vehicle {
    private String modelName;
    private String registrationNumber;
    private String ownerName;
    private int speed;

    public Honda(String modelName, String registrationNumber, String ownerName, int speed) {
        this.modelName = modelName;
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.speed = speed;
    }

    @Override
    public String getModelName() {
        return modelName;
    }

    @Override
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    @Override
    public String getOwnerName() {
        return ownerName;
    }

    public int getSpeed() {
        return speed;
    }

    public void cdplayer() {
        System.out.println("CD Player is playing a track in Honda vehicle.");
    }
}

// Test class
public class M3 {
    public static void main(String[] args) {
        Hero heroBike = new Hero("Hero Splendor", "TN01AB1234", "Ravi", 80);
        Honda hondaCar = new Honda("Honda City", "TN10XZ5678", "Anjali", 120);

        System.out.println("--- Hero Bike Details ---");
        System.out.println("Model Name: " + heroBike.getModelName());
        System.out.println("Registration Number: " + heroBike.getRegistrationNumber());
        System.out.println("Owner Name: " + heroBike.getOwnerName());
        System.out.println("Speed: " + heroBike.getSpeed() + " km/h");
        heroBike.radio();

        System.out.println("\n--- Honda Car Details ---");
        System.out.println("Model Name: " + hondaCar.getModelName());
        System.out.println("Registration Number: " + hondaCar.getRegistrationNumber());
        System.out.println("Owner Name: " + hondaCar.getOwnerName());
        System.out.println("Speed: " + hondaCar.getSpeed() + " km/h");
        hondaCar.cdplayer();
    }
}

