//Question 2: Transport Class Hierarchy and Polymorphism
//Task: Define a base class Transport with a method move(). Create subclasses Car, Bicycle, and Airplane that override the move() method. Write a program that demonstrates polymorphism by creating a list of transport types and calling the move() method on each.
//Requirements:
//Create an abstract base class Transport with a method move().
//Create concrete subclasses Car, Bicycle, and Airplane that inherit from Transport.
//Each subclass should override the move() method to describe their specific movement.
//Write a program that demonstrates polymorphism by creating a list of transport types and calling the move() method on each.
//Sample Output:
//
//The car is driving.
//The bicycle is pedaling.
//The airplane is flying.
package project;

import java.util.ArrayList;
import java.util.List;

// Abstract class Transport
abstract class Transport {
    // Abstract method move() to be implemented by subclasses
    public abstract void move();
}

// Subclass Car
class Car extends Transport {
    @Override
    public void move() {
        System.out.println("The car is driving.");
    }
}

// Subclass Bicycle
class Bicycle extends Transport {
    @Override
    public void move() {
        System.out.println("The bicycle is pedaling.");
    }
}

// Subclass Airplane
class Airplane extends Transport {
    @Override
    public void move() {
        System.out.println("The airplane is flying.");
    }
}

public class TransportDemo {

	public static void main(String[] args) {
		// Create a list of transport types
        List<Transport> transports = new ArrayList<>();
        transports.add(new Car());
        transports.add(new Bicycle());
        transports.add(new Airplane());

        // Call the move() method on each transport (demonstrates polymorphism)
        for (Transport transport : transports) {
            transport.move();
        }

	}

}
