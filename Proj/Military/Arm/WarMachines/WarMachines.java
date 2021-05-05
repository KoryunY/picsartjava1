package Proj.Military.Arm.WarMachines;

import Proj.Military.Arm.Armed;
import Proj.Robot.RobotInterFace;

public class WarMachines extends Armed {
    private int KillsCount;
    private String CombatDistance;//close mid far
    private boolean extraGunSlot;
    private double DeployInBattlefield_AverageTime;
    private double BattleResistance_AverageTime;

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

    public void PrintWarMachineData(){
        PrintArmedData(this);
        System.out.println("Set All time Kills Count "+KillsCount);
        System.out.println("Combat Range (close-mid-far)"+CombatDistance);
        System.out.println("Has an Extra gun slot?"+(isExtraGunSlot()?"Yes":"No"));
        System.out.println("Battlefield deployment average time "+DeployInBattlefield_AverageTime);
        System.out.println("How long Robbo can stand?"+BattleResistance_AverageTime);
    }
}
