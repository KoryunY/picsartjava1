package Proj.Military.Arm.WarMachines;

import Proj.Military.Arm.Armed;

public class WarMachines extends Armed {
    @Override
    public void printData() {
        System.out.println("*****************************");
        System.out.println("*****"+this.getrName()+"*************");
        System.out.println("*******"+getArmorLevel()+"LVL"+"************");
        System.out.println("*********"+getYear()+"********");
        System.out.println("*********000**000***********");
        System.out.println("************||***************");
        System.out.println("*****/??/~~~~~~~~~///**********");
        System.out.println("********|---------|***********");
        System.out.println("******/0/~~~~~~~~~/000/******");
        System.out.println("*****************************");

    }
}
