package com.springdemo;

import com.springdemo.interfaces.IVehicle;

public class Car implements IVehicle {

    @Override
    public void drive() {
        System.out.println("car is running");
    }
}
