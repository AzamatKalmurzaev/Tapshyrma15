package com.company;

public class Main {
    public static void main(String[] args) {

        Singer singer = new Singer("Mikle Jakson", "Pop king","GroupA");
        Dancer dancer = new Dancer("Shakira","Zvezda shou","Popsa");
        Programmer programmer = new Programmer("Ilon Mask","ElectroCar","Tesla");

        System.out.println(singer);
        singer.singing();
        singer.playGuitar();
        singer.learn();

        System.out.println(dancer);
        dancer.dancing();

        System.out.println(programmer);
        programmer.coding();



    }
    }
