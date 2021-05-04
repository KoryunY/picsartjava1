package Proj.Military;
import Proj.Robot.Robot;
import Proj.Robot.RobotInterFace;

public abstract class Military extends Robot {
    private int ArmorLevel;//0-5 (0 if isArmored=false;)
    private boolean Armor;
    private boolean camouflagePaint;
    private String camouflagePaintName;
    private String armyType;

    public Military(RobotInterFace cRobot) {
        super(cRobot);
    }

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
}
