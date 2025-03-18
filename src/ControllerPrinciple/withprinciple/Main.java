package ControllerPrinciple.withprinciple;

class Car {
    private String model;
    private boolean isRented;

    public Car(String model) {
        this.model = model;
        this.isRented = false;
    }

    public String getModel() {
        return model;
    }

    public boolean isRented() {
        return isRented;
    }

    public void rentCar() {
        isRented = true;
    }

    public void returnCar() {
        isRented = false;
    }
}

// Customer.java
class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}


// RentalController.java (Controller class)
class RentalController {
    public void rentCar(Customer customer, Car car) {
        if (!car.isRented()) {
            car.rentCar();
            System.out.println(customer.getName() + " rented " + car.getModel());
        } else {
            System.out.println(car.getModel() + " is already rented.");
        }
    }

    public void returnCar(Customer customer, Car car) {
        if (car.isRented()) {
            car.returnCar();
            System.out.println(customer.getName() + " returned " + car.getModel());
        } else {
            System.out.println(car.getModel() + " was not rented.");
        }
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota Corolla");
        Customer customer1 = new Customer("John Doe");
        RentalController controller = new RentalController();

        controller.rentCar(customer1, car1);
        controller.returnCar(customer1, car1);
    }
}