package com.company;

import java.util.Arrays;

public class Pool {

    private Person[] people;

    public Pool() {
    }

    public Pool(Person[] people) {
        this.people = people;
    }

    public Person[] getPeople() {
        return people;
    }

    public void setPeople(Person[] people) {
        this.people = people;
    }

    @Override
    public String toString() {
        return "Pool{" +
                "people=" + Arrays.toString(people) +
                '}';
    }
}
