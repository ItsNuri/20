package com.company;

public class Driver extends Person implements CanDrive {

    private String autoOfCar;

    public Driver() {
    }

    public Driver(String name, int age, String autoOfCar) {
        super(name, age);
        this.autoOfCar = autoOfCar;
    }

    public void method() {
        System.out.println("Driver can good drive");
    }

    @Override
    void breathe() {
        System.out.println("Driver is breathe quit");
    }

    @Override
    public void drive() {
        System.out.println("Driver can drive");
    }

    @Override
    public String toString() {
        return "Driver{" +
                "autoOfCar='" + autoOfCar + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
