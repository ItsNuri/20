package com.company;

public class Seaman extends Person implements SwimAble {

    private String hobbyofSeaman;

    public Seaman() {
    }

    public Seaman(String name, int age, String hobbyofSeaman) {
        super(name, age);
        this.hobbyofSeaman = hobbyofSeaman;
    }

    public void seamanMethod() {
        System.out.println("Swimmen");
    }

    @Override
    public void swim() {
        System.out.println("Seaman can swim");
    }

    @Override
    void breathe() {
        System.out.println("Sportman is breathe");
    }

    @Override
    public String toString() {
        return "Seaman{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobbyofSeaman='" + hobbyofSeaman + '\'' +
                '}';
    }
}
