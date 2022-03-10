public class Q4 {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle truck = new Truck();

        car.Engine();
        truck.Engine();
    }
}

abstract class Vehicle {
    void Engine() {
    };
}

class Car extends Vehicle {
    @Override
    void Engine() {
        // TODO Auto-generated method stub
        System.out.println("Car has good engine!");
    }
}

class Truck extends Vehicle {
    @Override
    void Engine() {
        // TODO Auto-generated method stub
        System.out.println("Truck has bad engine!");
        
    }
}