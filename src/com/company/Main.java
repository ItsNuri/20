package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Programmer programmer1 = new Programmer("Nurzhan",25,"MSI");
        Programmer programmer2 = new Programmer("Aizhan",34,"HP");

        Driver driver1 = new Driver("Kanat",23,"Weight");
        Driver driver2 = new Driver("Bekzhan",18,"Black");

        Sportsman sportsman1 = new Sportsman("Valentina",32,"Read the Book");
        Sportsman sportsman2 = new Sportsman("Sara",18,"lisson musik");

        Seaman seaman1 = new Seaman("Nargiza",18,"Table tennis to play");
        Seaman seaman2 = new Seaman("Albina",29,"Play in Fortopiano");

//        Programmer programmer1 = new Programmer();
//        Programmer programmer2 = new Programmer();
//
//        Driver driver1 = new Driver();
//        Driver driver2 = new Driver();
//
//        Sportsman sportsman1 = new Sportsman();
//        Sportsman sportsman2 = new Sportsman();
//
//        Seaman seaman1 = new Seaman();
//        Seaman seaman2 = new Seaman();

        Pool pool = new Pool();
        Person[] people = {programmer1,programmer2,driver1,driver2,sportsman1,sportsman2,seaman1,seaman2};
        pool.setPeople(people);
        System.out.println(pool);



    }
}
