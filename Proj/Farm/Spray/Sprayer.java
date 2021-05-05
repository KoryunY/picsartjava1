package Proj.Farm.Spray;

import Proj.Farm.Farmer;
import Proj.Robot.RobotInterFace;

public class Sprayer extends Farmer {
    private int sprayersCount=1;
    private double maxWaterCapacity; //in Litres


    public int getSprayersCount() {
        return sprayersCount;
    }

    public void setSprayersCount(int sprayersCount) {
        if (sprayersCount>0)
        this.sprayersCount = sprayersCount;
    }

    public double getMaxWaterCapacity() {
        return maxWaterCapacity;
    }

    public void setMaxWaterCapacity(double maxWaterCapacity) {
        if (maxWaterCapacity>0)
        this.maxWaterCapacity = maxWaterCapacity;
    }

    public void PrintSprayerData(){
        PrintFarmerData(this);
        System.out.println("Sprayers Count "+sprayersCount);
        System.out.println("Max Whater capacity"+maxWaterCapacity);

    }

}
