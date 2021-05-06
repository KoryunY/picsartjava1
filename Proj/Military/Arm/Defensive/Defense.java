package Proj.Military.Arm.Defensive;

import Proj.Military.Arm.Armed;

public class Defense extends Armed {
    private String DefenseType; //gg(ground-ground),ag(air-ground) ga,aa
    private boolean extraArmor;
    private double OverHeatingTime;


    public String getDefenseType() {
        return DefenseType;
    }

    public void setDefenseType(String defenseType) {
        if(defenseType=="gg"||defenseType=="ag"||defenseType=="ga"||defenseType=="aa")
        DefenseType = defenseType;
    }

    public boolean isExtraArmor() {
        return extraArmor;
    }

    public void setExtraArmor(boolean extraArmor) {
        this.extraArmor = extraArmor;
    }

    public double getOverHeatingTime() {
        return OverHeatingTime;
    }

    public void setOverHeatingTime(double overHeatingTime) {
        if (overHeatingTime>0)
        OverHeatingTime = overHeatingTime;
    }


    @Override
    public void PrintRobotData() {
        super.PrintRobotData();
        System.out.println("Def type:"+DefenseType);
        System.out.println("Has extra Armor Slot? yes or no(y/n):"+(extraArmor?"yes":"No"));
        System.out.println("Overheating Time:"+OverHeatingTime);
        System.out.println("_________________________________________________");
    }
}
