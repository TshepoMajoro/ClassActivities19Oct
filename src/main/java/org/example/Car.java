package org.example;

public class Car extends Vehicle{
    int wheels = 4;
    int doors = 5;

//    @Override
//    void go(){
//        System.out.println("Car is driving!!");
//    }
//
//    @Override
//    void stop(){
//        System.out.println("Car has stopped!!");
//    }
@Override
void drive(){
    System.out.println("Car is driving!");
}

    @Override
    void stop(){
        System.out.println("Car has stopped!");
    }
}
