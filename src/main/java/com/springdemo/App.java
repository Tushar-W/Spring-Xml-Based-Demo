package com.springdemo;

import com.springdemo.interfaces.IVehicle;

public class App{

    public static void main(String[] args){
        IVehicle vehicle = new Car();
        vehicle.drive();
    }
}
