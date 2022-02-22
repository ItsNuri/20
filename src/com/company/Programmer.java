package com.company;

public class Programmer extends Person implements SwimAble, CanDrive {

    private String nameOfComputer;

    public Programmer() {
    }

    public Programmer(String name, int age,String nameOfComputer) {
        super(name, age);
        this.nameOfComputer = nameOfComputer;
    }

    @Override
    void breathe() {
        System.out.println("Programmer is breathe slowly");
    }

    @Override
    public void swim() {
        System.out.println("Programmer can swimm");
    }

    @Override
    public void drive() {
        System.out.println("Programmer can driver");
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", name of Computer: "+nameOfComputer+
                '}';
    }
}
