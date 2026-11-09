public class VehicleTest 
{
    public static void main(String[] args) 
    {
        Car car1 = new Car("Toyota", "Camry", 2024);
        Car car2 = new Car("Honda", "Civic", 2022);
        Truck truck1 = new Truck("Ford", "F-150", 2023);
        Truck truck2 = new Truck("Chevrolet", "Silverado", 2021);
        car1.displayInfo();
        car1.displayType();
        car2.displayInfo();
        car2.displayType();
        truck1.displayInfo();
        truck1.displayType();
        truck2.displayInfo();
        truck2.displayType();
        System.out.println("Model for car 1: " + car1.getModel());
        truck2.setYear(2025);
        truck2.displayInfo();
        truck2.displayType();
    }
}
