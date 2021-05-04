package Proj.Military.Arm.Defensive;

import Proj.Military.Arm.Armed;
import Proj.Robot.RobotInterFace;

public class Defense extends Armed {
    private String DefenseType; //gg(ground-ground),ag(air-ground) .etc
    private boolean extraArmor;
    private double OverHeatingTime;

    public Defense(RobotInterFace cRobot) {
        super(cRobot);
    }

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


    @Override
    public RobotInterFace CRobot() {
        return null;
    }
}
