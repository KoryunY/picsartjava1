package Proj.Military.Arm.Defensive;

import Proj.Military.Arm.Armed;
import Proj.Robot.RobotInterFace;

public class Defense extends Armed {
    private String DefenseType; //gg(ground-ground),ag(air-ground) .etc
    private boolean extraArmor;
    private double OverHeatingTime;


    public String getDefenseType() {
        return DefenseType;
    }

    public void setDefenseType(String defenseType) {
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
        OverHeatingTime = overHeatingTime;
    }

    public void PrintDefData(){
        PrintArmedData(this);
        System.out.println("Def type "+DefenseType);
        System.out.println("Has extra Armor Slot? "+(extraArmor?"yes":"No"));
        System.out.println("Overheating Time "+OverHeatingTime);
    }
}
