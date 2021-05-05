package Proj.Military.Resc;

import Proj.Military.Military;
import Proj.Robot.RobotInterFace;

public class Rescue extends Military {
    private int AllTime_SavedLivesCount;
    private double carryWeight;
    private int MedicalHelpLevel;//from 1-5


    public int getAllTime_SavedLivesCount() {
        return AllTime_SavedLivesCount;
    }

    public void setAllTime_SavedLivesCount(int allTime_SavedLivesCount) {
        AllTime_SavedLivesCount = allTime_SavedLivesCount;
    }

    public double getCarryWeight() {
        return carryWeight;
    }

    public void setCarryWeight(double carryWeight) {
        this.carryWeight = carryWeight;
    }

    public int getMedicalHelpLevel() {
        return MedicalHelpLevel;
    }

    public void setMedicalHelpLevel(int medicalHelpLevel) {
        MedicalHelpLevel = medicalHelpLevel;
    }

    public void PrintRescueData(){
        PrintMilData(this);
        System.out.println("All time lives Saved?"+AllTime_SavedLivesCount);
        System.out.println("Carry Weight"+carryWeight);
        System.out.println("Medical Helping level(1-5) "+MedicalHelpLevel);

    }
}
