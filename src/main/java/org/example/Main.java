package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        car.drive();
        bike.drive();
        boat.drive();
        System.out.println("Your car has "+car.wheels+" wheels.");
        System.out.println("Your bike has "+bike.pedals+" pedals.");
        System.out.println("Your boat has "+boat.propellers+" propeller(s), and a "+boat.hull+" hull.");
        car.stop();
        bike.stop();
        boat.stop();
//        System.out.println(car.getMake());
//        System.out.println(car.getModel());
//        System.out.println(car.getYear()+"\n");
//        car.setMake("Subaru");
//        car.setModel("WRX");
//        car.setYear(2015);
//        System.out.println(car.getMake());
//        System.out.println(car.getModel());
//        System.out.println(car.getYear()+"\n");

    }
}

