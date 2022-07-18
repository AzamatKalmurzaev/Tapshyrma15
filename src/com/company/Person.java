package com.company;

public class Person {
    private String name;
    private String designation;


    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }


    public void learn(){
        System.out.println("Learn");
    }
    public void walk (){
        System.out.println("walk");
    }
    public void eat(){
        System.out.println("eat");
    }
    @Override
    public String toString(){
        return name + designation;
    }


}
