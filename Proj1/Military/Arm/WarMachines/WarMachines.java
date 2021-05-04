package Proj.Military.Arm.WarMachines;

import Proj.Military.Arm.Armed;
import Proj.Robot.RobotInterFace;

public class WarMachines extends Armed {
    private int KillsCount;
    private String CombatDistance;//close mid far
    private boolean extraGunSlot;
    private double DeployInBattlefield_AverageTime;
    private double BattleResistance_AverageTime;

    public WarMachines(RobotInterFace cRobot) {
        super(cRobot);
    }

    public int getKillsCount() {
        return KillsCount;
    }

    public void setKillsCount(int killsCount) {
        KillsCount = killsCount;
    }

    public String getCombatDistance() {
        return CombatDistance;
    }

    public void setCombatDistance(String combatDistance) {
        CombatDistance = combatDistance;
    }

    public boolean isExtraGunSlot() {
        return extraGunSlot;
    }

    public void setExtraGunSlot(boolean extraGunSlot) {
        this.extraGunSlot = extraGunSlot;
    }

    public double getDeployInBattlefield_AverageTime() {
        return DeployInBattlefield_AverageTime;
    }

    public void setDeployInBattlefield_AverageTime(double deployInBattlefield_AverageTime) {
        DeployInBattlefield_AverageTime = deployInBattlefield_AverageTime;
    }

    public double getBattleResistance_AverageTime() {
        return BattleResistance_AverageTime;
    }

    public void setBattleResistance_AverageTime(double battleResistance_AverageTime) {
        BattleResistance_AverageTime = battleResistance_AverageTime;
    }

    public void printData() {
        System.out.println("*****************************");
        System.out.println("*****"+this.getModelName()+"*************");
        System.out.println("*******"+getArmorLevel()+"LVL"+"************");
        System.out.println("*********"+getYear()+"********");
        System.out.println("*********000**000***********");
        System.out.println("************||***************");
        System.out.println("*****/??/~~~~~~~~~///**********");
        System.out.println("********|---------|***********");
        System.out.println("******/0/~~~~~~~~~/000/******");
        System.out.println("*****************************");

    }

    @Override
    public RobotInterFace CRobot() {
        return null;
    }
}
