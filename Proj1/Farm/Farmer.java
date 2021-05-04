package Proj.Farm;

import Proj.Robot.Robot;
import Proj.Robot.RobotInterFace;

import java.util.Scanner;

public abstract  class Farmer extends Robot {
    private double maxWorkHours;
    private double maxWorkDistance;//int km
    private RobotInterFace myInterface;


    public Farmer(RobotInterFace cRobot) {
        super(cRobot);
        myInterface=this;

    }

    public Farmer() {
        super();
    }

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

    @Override
    public void CRRbot(Scanner scanner,RobotInterFace r) {
        super.CRRbot(scanner,this);
        System.out.println("enter max work Hours");
        this.setMaxWorkHours(scanner.nextDouble());
        System.out.println("Enter MaxWork Distance");
        this.setMaxWorkDistance(scanner.nextDouble());
    }


}
