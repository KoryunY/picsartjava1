package Proj.Farm.Seed;

import Proj.Farm.Farmer;
import Proj.Robot.RobotInterFace;

public class Seeding extends Farmer {
    private double seedsCapacity;//in Kilograms
    private int seedTypesCount=1;
    private String[] seedTypes;
    public static RobotInterFace myInterface;



    public double getSeedsCapacity() {
        return seedsCapacity;
    }

    public void setSeedsCapacity(double seedsCapacity) {
        if (seedsCapacity>0)
        this.seedsCapacity = seedsCapacity;
    }

    public int getSeedTypesCount() {
        return seedTypesCount;
    }

    public void setSeedTypesCount(int seedTypesCount) {
        if (seedTypesCount>0)
        this.seedTypesCount = seedTypesCount;
    }

    public String[] getSeedTypes() {
        return seedTypes;
    }

    public void setSeedTypes(String[] seedTypes) {
        this.seedTypes = seedTypes;
    }


    @Override
    public RobotInterFace CRobot() {
        myInterface=this;
        return myInterface;
    }
}
