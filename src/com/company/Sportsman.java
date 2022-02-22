package com.company;

public class Sportsman extends Person implements SwimAble, CanDrive {

    private String hobbyOfSportman;

    public Sportsman() {
    }

    public Sportsman(String name, int age,String hobbyOfSportman) {
        super(name, age);
        this.hobbyOfSportman = hobbyOfSportman;
    }

    public void sportsmanMethodWhatToDo() {
        System.out.println("Sportsman do run");
    }

    @Override
    void breathe() {

    }

    @Override
    public void drive() {
        System.out.println("Sportsman can drive");
    }

    @Override
    public void swim() {
        System.out.println("Sportsman can swim");
    }


    @Override
    public String toString() {
        return "Sportsman{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobbyOfSportman='" + hobbyOfSportman + '\'' +
                '}';
    }
}
