package Proj.Farm;

import Proj.Farm.Seed.Seeding;
import Proj.Robot.Robot;
import Proj.Robot.RobotInterFace;

import java.util.Scanner;

public abstract  class Farmer extends Robot {
    private double maxWorkHours;
    private double maxWorkDistance;//int km


    public double getMaxWorkHours() {
        return maxWorkHours;
    }

    public void setMaxWorkHours(double maxWorkHours) {
        if(maxWorkHours>0)
        this.maxWorkHours = maxWorkHours;

    }

    public double getMaxWorkDistance() {
        return maxWorkDistance;
    }

    public void setMaxWorkDistance(double maxWorkDistance) {
        if (maxWorkDistance>0)
        this.maxWorkDistance = maxWorkDistance;
    }

    public void CreateFarm(Scanner scanner,Farmer f) {
        System.out.println("enter max work Hours");
        f.setMaxWorkHours(scanner.nextDouble());
        System.out.println("Enter MaxWork Distance");
        f.setMaxWorkDistance(scanner.nextDouble());

    }
    public String FarmerToTxt(Farmer farmer) {
        String seedTxt;
        seedTxt = RobotToTxt(farmer)+farmer.getMaxWorkHours()+","+farmer.getMaxWorkDistance()+",";
        return seedTxt;
    }
    public int FarmerFromTxt(Farmer farmer,String[] split,int i){
        i=RobotFromTxt(farmer,split,i);
        farmer.setMaxWorkHours(Double.parseDouble(split[i++]));
        farmer.setMaxWorkDistance(Double.parseDouble(split[i++]));
        return i;
    }
    public void PrintFarmerData(Farmer farmer){
        PrintRobotData(farmer);
        System.out.println("enter max work Hours "+farmer.maxWorkHours);
        System.out.println("Enter MaxWork Distance "+farmer.maxWorkDistance); }
}
