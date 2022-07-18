package com.company;

public class Singer extends Person{

    private String bandName;



    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;

    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }
    public void singing(){
        System.out.println("Pevetc");
    }
    public void playGuitar(){
        System.out.println("Play guitar professional");
    }
    @Override
    public void learn(){
        System.out.println("Mikle Jakson learning");

    }

}
