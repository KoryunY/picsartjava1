package Proj.Military.Arm.Defensive;

import Proj.Military.Arm.Armed;

import java.util.Scanner;

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

    @Override
    public void CreateRobot(Scanner scanner) {
        super.CreateRobot(scanner);
        System.out.println("Set Defense type (a-Air,g-Ground),Pls enter aa,gg,ag or ga(for Air-Ground and .etc)");
        this.setDefenseType(scanner.next());
        System.out.println("Is there any extra armor slot?");
        this.setExtraArmor(scanner.next().charAt(0) == 'y');
        System.out.println("All system non-stop work Overheating Time");
        this.setOverHeatingTime(scanner.nextDouble());
    }
}
