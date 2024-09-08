class Vehicle {
    public void start() {
        System.out.println("Vehicle is starting");
    }

    public void move() {
        System.out.println("Vehicle is moving");
    }
}

class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting");
    }

    @Override
    public void move() {
        System.out.println("Car is moving");
    }
}

class Bike extends Vehicle {
    @Override
    public void start() {
        System.out.println("Bike is starting");
    }

    @Override
    public void move() {
        System.out.println("Bike is moving");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle(); 
        Vehicle myCar = new Car();         
        Vehicle myBike = new Bike();       

        
        myVehicle.start();  
        myVehicle.move();   

        myCar.start();      
        myCar.move();       

        myBike.start();     
        myBike.move();      
    }
}
