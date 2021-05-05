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
        if (seedTypesCount>0)
        this.seedTypesCount = seedTypesCount;
    }

    public String[] getSeedTypes() {
        return seedTypes;
    }

    public void setSeedTypes(String[] seedTypes) {
        this.seedTypes = seedTypes;
    }

    public void SeedingPrintData(){
        PrintFarmerData(this);
        System.out.println("Enter capacity in Kgs"+seedsCapacity);
        System.out.println("Enter count of seed types:min 1"+seedTypesCount);
        System.out.println("Now Enter all that seed type names"+seedTypes[2]);
    }
}
