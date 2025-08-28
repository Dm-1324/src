class Vehicle{
    public void displayDetails(){
        System.out.println("This is just a vehicle.");
    }
}

class Car extends Vehicle{
    public void displayDetails(){
        System.out.println("This is a car.");
    }
}

class Bike extends Vehicle{
    public void displayDetails(){
        System.out.println("This is a bike.");
    }
}


public class Ques25 {
    public static void main(String[] args) {
        Vehicle myVehicle;
        myVehicle = new Vehicle();
        myVehicle.displayDetails();
        myVehicle = new Car();
        myVehicle.displayDetails();
        myVehicle = new Bike();
        myVehicle.displayDetails();
    }
}
