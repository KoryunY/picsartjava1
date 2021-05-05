package Proj.Military.Arm.WarMachines;

import Proj.Military.Arm.Defensive.Defense;

import java.util.Scanner;

public class WarMachineService extends WarMachines{
    public WarMachines CreateWarMachine(){
        WarMachines w=new WarMachines();
        Scanner scanner = new Scanner(System.in);
        CreateRobot(scanner, w);
        CreateMil(scanner, w);
        CreateArmed(scanner,w);
        System.out.println("Set All time Kills Count");
        w.setKillsCount(scanner.nextInt());
        System.out.println("Combat Range (close-mid-far)");
        w.setCombatDistance(scanner.next());
        System.out.println("Has an Extra gun slot?");
        w.setExtraGunSlot(scanner.next().charAt(0)=='y');
        System.out.println("Battlefield deployment average time");
        w.setDeployInBattlefield_AverageTime(scanner.nextDouble());
        System.out.println("How long Robbo can stand?");
        w.setBattleResistance_AverageTime(scanner.nextDouble());
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
        warMachine.setCombatDistance(split[i++]);
        warMachine.setExtraGunSlot(split[i++].charAt(0)=='y');
        warMachine.setDeployInBattlefield_AverageTime(Double.parseDouble(split[i++]));
        warMachine.setBattleResistance_AverageTime(Double.parseDouble(split[i++]));
        return warMachine;
    }

}
