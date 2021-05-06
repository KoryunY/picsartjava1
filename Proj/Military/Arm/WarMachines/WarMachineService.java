package Proj.Military.Arm.WarMachines;

import Proj.Military.Arm.Defensive.Defense;

import java.util.*;

public class WarMachineService extends WarMachines {
    public WarMachines CreateWarMachine(){
        WarMachines w=new WarMachines();
        Scanner scanner = new Scanner(System.in);
        w.CreateRobot(scanner);
        return w;
    }
    public String WarToTxt(WarMachines warMachines) {
        return ArmedToTxt(warMachines)+ warMachines.getKillsCount() +","+warMachines.getCombatDistance()+
                ","+(warMachines.isExtraGunSlot()?"yes":"No")+","
                +warMachines.getDeployInBattlefield_AverageTime()+","+warMachines.getBattleResistance_AverageTime()+"\n";

    }
    public WarMachines WarFromTxt(String line) {
        String[] split = line.split(",");
        int i=0;
        WarMachines warMachine = new WarMachines();
        i=ArmedFromTxt(warMachine,split,i);
        warMachine.setKillsCount(Integer.parseInt(split[i++]));
        warMachine.setCombatDistance(split[i++].charAt(0));
        warMachine.setExtraGunSlot(split[i++].charAt(0)=='y');
        warMachine.setDeployInBattlefield_AverageTime(Double.parseDouble(split[i++]));
        warMachine.setBattleResistance_AverageTime(Double.parseDouble(split[i]));
        return warMachine;
    }


}
