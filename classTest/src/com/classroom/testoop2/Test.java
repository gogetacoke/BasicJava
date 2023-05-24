package com.classroom.testoop2;

public class Test {
    public static void main(String[] args) {
        Vechicle audi = new Car(5);
        audi.setSpeed(10);
        audi.speedChange(5,20);
        audi.show();
        System.out.println("-----------------------------");
        Vechicle pickUp = new Truck(50);
        pickUp.setSpeed(5);
        pickUp.speedChange(10,0);
        pickUp.show();
    }
}
