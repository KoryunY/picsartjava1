package Proj.Farm.Seed;

import Proj.Farm.Farmer;

public class Seeding extends Farmer {
    private double seedsCapacity;//in Kilograms
    private int seedTypesCount=1;
    private String[] seedTypes;


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
        if (seedTypesCount>1)
        this.seedTypesCount = seedTypesCount;
    }

    public String[] getSeedTypes() {
        return seedTypes;
    }

    public void setSeedTypes(String[] seedTypes) {
        this.seedTypes = seedTypes;
    }


    @Override
    public void PrintRobotData() {
        super.PrintRobotData();
        System.out.println("Capacity:"+seedsCapacity+"kgs");
        System.out.print("All that seed type names:");
        for (String x:
                seedTypes) {
            System.out.print(x + ":");
        }
        System.out.println();
        System.out.println("__________________________________");
    }
}
