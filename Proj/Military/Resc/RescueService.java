package Proj.Military.Resc;

import Proj.Farm.Seed.Seeding;

import java.util.Scanner;

public class RescueService extends Rescue{
    public Rescue CreateRescue(){
        Rescue r=new Rescue();
        Scanner scanner = new Scanner(System.in);
        CreateRobot(scanner);
        return r;
    }
    public String RescueToTxt(Rescue rescue) {
        return MilToTxt(rescue)+rescue.getAllTime_SavedLivesCount()
                +","+rescue.getCarryWeight()+","+rescue.getMedicalHelpLevel()+"\n";

    }
    public Rescue RescueFromTxt(String line) {
        String[] split = line.split(",");
        int i=0;
        Rescue rescue = new Rescue();
        i=MilFromTxt(rescue,split,i);
        rescue.setAllTime_SavedLivesCount(Integer.parseInt(split[i++]));
        rescue.setCarryWeight(Double.parseDouble(split[i++]));
        rescue.setMedicalHelpLevel(Integer.parseInt(split[i++]));
        return rescue;
    }
}
