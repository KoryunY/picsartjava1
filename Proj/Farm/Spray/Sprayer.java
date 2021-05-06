package Proj.Farm.Spray;

import Proj.Farm.Farmer;
import Proj.Robot.Robot;

import java.util.Scanner;

public class Sprayer extends Farmer {
    private int sprayersCount=1;
    private double maxWaterCapacity; //in Litres


    public int getSprayersCount() {
        return sprayersCount;
    }

    public void setSprayersCount(int sprayersCount) {
        if (sprayersCount>1)
        this.sprayersCount = sprayersCount;
    }

    public double getMaxWaterCapacity() {
        return maxWaterCapacity;
    }

    public void setMaxWaterCapacity(double maxWaterCapacity) {
        if (maxWaterCapacity>0)
        this.maxWaterCapacity = maxWaterCapacity;
    }

    @Override
    public void PrintRobotData() {
        super.PrintRobotData();
        System.out.println("Sprayers Count:"+sprayersCount);
        System.out.println("Max Water capacity"+maxWaterCapacity+"-litres");
        System.out.println("__________________________________________________");
    }

    @Override
    public void CreateRobot(Scanner scanner) {
        super.CreateRobot(scanner);
        System.out.println("Enter Your Sprayer Robot Sprayers Count");
        this.setSprayersCount(scanner.nextInt());
        System.out.println("Max Water Capacity in Litres");
        this.setMaxWaterCapacity(scanner.nextDouble());
    }
}
