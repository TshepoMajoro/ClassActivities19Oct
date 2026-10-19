package org.example;

public class Bike extends Vehicle{
    int wheels = 2;
    int pedals = 2;

//    @Override
//    void go(){
//        System.out.println("Bike is driving!!");
//    }
//
//    @Override
//    void stop(){
//        System.out.println("Bike has stopped!!");
//    }
@Override
void drive(){
    System.out.println("Bike is riding!");
}

    @Override
    void stop(){
        System.out.println("Bike has stopped!");
    }
}
