
package Main;
// 1. ABSTRACTION & ENCAPSULATION
abstract class Delivery {
    // Encapsulation: Private variables (data hiding)
    private String trackingId;
    private double weight; // in kg

    public Delivery(String trackingId, double weight) {
        this.trackingId = trackingId;
        this.weight = weight;
    }

    // Getters and Setters (Encapsulation keessatti murni alaa akka argatuuf)
    public String getTrackingId() {
        return trackingId;
    }

    public double getWeight() {
        return weight;
    }

    // Abstract method (Subclasses akka guutan dirqisiisa)
    public abstract double calculateCost();

    public void displayInfo() {
        System.out.println("Tracking ID: " + trackingId + " | Weight: " + weight + " kg");
    }
}

// 2. INHERITANCE (ExpressDelivery dhufe Delivery irraa dhaale)
class ExpressDelivery extends Delivery {
    private double expressFee;

    public ExpressDelivery(String trackingId, double weight, double expressFee) {
        super(trackingId, weight);
        this.expressFee = expressFee;
    }

    // 3. POLYMORPHISM (Method Overriding)
    @Override
    public double calculateCost() {
        return (getWeight() * 50) + expressFee; // Gatii addaa
    }
}

// INHERITANCE (StandardDelivery dhufe Delivery irraa dhaale)
class StandardDelivery extends Delivery {
    public StandardDelivery(String trackingId, double weight) {
        super(trackingId, weight);
    }

    // POLYMORPHISM (Method Overriding)
    @Override
    public double calculateCost() {
        return getWeight() * 25; // Gatii idilee
    }
}

// MAIN CLASS (OBJECT CREATION)
public class java  {
    public static void main(String[] args) {
        System.out.println("--- OOP Delivery System Demo ---");

        // 4. OBJECT CREATION
        Delivery express = new ExpressDelivery("EXP101", 3.5, 100.0);
        Delivery standard = new StandardDelivery("STD202", 5.0);

        // Polymorphism in action: calculateCost() kutaalee lamaanuf bifa addaan hojjeta
        express.displayInfo();
        System.out.println("Express Delivery Cost: " + express.calculateCost() + " ETB\n");

        standard.displayInfo();
        System.out.println("Standard Delivery Cost: " + standard.calculateCost() + " ETB");
    }
}

  
 