package Proj.Military;
import Proj.Farm.Farmer;
import Proj.Robot.Robot;
import Proj.Robot.RobotInterFace;

import java.util.Scanner;

public abstract class Military extends Robot {
    private boolean Armor;
    private int ArmorLevel=0;//0-5 (0 if isArmored=false;)
    private boolean camouflagePaint;
    private String camouflagePaintName=null;
    private String armyType;


    public boolean isArmor() {
        return Armor;
    }

    public void setArmor(boolean armor) {
        Armor = armor;
    }

    public int getArmorLevel() {
        return ArmorLevel;
    }

    public void setArmorLevel(int armorLevel) {
        ArmorLevel = armorLevel;
    }

    public boolean isCamouflagePaint() {
        return camouflagePaint;
    }

    public void setCamouflagePaint(boolean camouflagePaint) {
        this.camouflagePaint = camouflagePaint;
    }

    public String getCamouflagePaintName() {
        return camouflagePaintName;
    }

    public void setCamouflagePaintName(String camouflagePaintName) {
        if(this.camouflagePaint)
        this.camouflagePaintName = camouflagePaintName;
        else this.camouflagePaintName="None";
    }

    public String getArmyType() {
        return armyType;
    }

    public void setArmyType(String armyType) {
        this.armyType = armyType;
    }

    public void CreateMil(Scanner scanner,Military military){
        System.out.println("is Armored");
        if (scanner.next().charAt(0)=='y')military.setArmor(true);
        else military.setArmor(false);
        if (military.isArmor()) {
            System.out.println("Armor Level from 1 to 5");
        military.setArmorLevel(scanner.nextInt());
        }
        System.out.println("has camo?");
        if (scanner.next().charAt(0)=='y')military.setCamouflagePaint(true);
        else military.setCamouflagePaint(false);
        if (military.isCamouflagePaint()){
            System.out.println("Enter Camo name");
            military.setCamouflagePaintName(scanner.next());
        }
        System.out.println("Army type");
        military.setArmyType(scanner.next());
    }
    public String MilToTxt(Military military) {
        String militaryTxt;
        militaryTxt = RobotToTxt(military)+military.isArmor()+","+military.getArmorLevel()+","
                +","+military.isCamouflagePaint()+","+military.getCamouflagePaintName()+","+military.getArmyType()+",";
        return militaryTxt;
    }
    public int MilFromTxt(Military military,String[] split,int i){
        i=RobotFromTxt(military,split,i);
        military.setArmor(split[i++].charAt(0)=='y');
        military.setArmorLevel(Integer.parseInt(split[i++]));
        military.setCamouflagePaint(split[i++].charAt(0)=='y');
        military.setCamouflagePaintName(split[i++]);
        military.setArmyType(split[i++]);
        return i;
    }
    public void PrintMilData(Military military){
        PrintRobotData(military);
        System.out.println("Armor "+(Armor?"Yes":"No"));
        if (Armor)System.out.println("Armord Level"+ArmorLevel);
        System.out.println("Has Camo Paint "+(camouflagePaint?"Yes":"No"));
        if(camouflagePaint) System.out.println("Camo Paint name "+camouflagePaintName);
        System.out.println("Army Type "+armyType);
    }
}

