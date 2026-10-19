package org.example;

public class Boat extends Vehicle{
    int propellers = 1;
    String hull = "Deep-V";
//    @Override
//    void go(){
//        System.out.println("Boat is driving!!");
//    }
//
//    @Override
//    void stop(){
//        System.out.println("Boat has stopped!!");
//    }
    @Override
    void drive(){
        System.out.println("Boat is sailing!");
    }

    @Override
    void stop(){
        System.out.println("Boat has stopped!");
    }
}
