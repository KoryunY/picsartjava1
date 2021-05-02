package Proj;

public class Armed extends Military implements RobotInterFace{
    private int GunsCount;// min 1
    private double[] mm;
    private int ammo;
    private boolean camouflagePaint;



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
