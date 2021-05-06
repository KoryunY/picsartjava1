package Proj.Military.Arm.WarMachines;

import Proj.Military.Arm.Armed;

public class WarMachines extends Armed {
    private int KillsCount;
    private char CombatDistance;//close mid far
    private boolean extraGunSlot;
    private double DeployInBattlefield_AverageTime;
    private double BattleResistance_AverageTime;

    public int getKillsCount() {
        return KillsCount;
    }

    public void setKillsCount(int killsCount) {
        if (killsCount>=0)KillsCount = killsCount;
    }

    public char getCombatDistance() {
        return CombatDistance;
    }

    public void setCombatDistance(char combatDistance) {
        if (combatDistance=='c'||combatDistance=='C'||combatDistance=='m'||combatDistance=='M'||combatDistance=='f'||combatDistance=='F')
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
        if (deployInBattlefield_AverageTime>0)
        DeployInBattlefield_AverageTime = deployInBattlefield_AverageTime;
    }

    public double getBattleResistance_AverageTime() {
        return BattleResistance_AverageTime;
    }

    public void setBattleResistance_AverageTime(double battleResistance_AverageTime) {
        if (battleResistance_AverageTime>0)
        BattleResistance_AverageTime = battleResistance_AverageTime;
    }


    @Override
    public void PrintRobotData() {
        super.PrintRobotData();
        System.out.println("Set All time Kills Count "+KillsCount);
        String Cd="none";
        if (CombatDistance=='c'||CombatDistance=='C')Cd="Close";
        else if (CombatDistance=='m'||CombatDistance=='M')Cd="Mid";
        else if(CombatDistance=='f'||CombatDistance=='F')Cd="Far";
        System.out.println("Combat Range (close-mid-far)"+Cd+"-range");
        System.out.println("Has an Extra gun slot?)"+(isExtraGunSlot()?"Yes":"No"));
        System.out.println("Battlefield deployment average time "+DeployInBattlefield_AverageTime);
        System.out.println("How long Robbo can stand?"+BattleResistance_AverageTime);
        System.out.println("-------------------------------------------------------");
    }
}
