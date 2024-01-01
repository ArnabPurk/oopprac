package iit.oop.driverclass;

import iit.oop.inheritence.MountainBike;

public class DriverClass {
    public static void main(String[] args) {
        MountainBike bike= new MountainBike(3,200,0);
        System.out.println(bike.toString());
    }
}
