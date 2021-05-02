package Proj;

public abstract class Military extends Robot {
    private int ArmorLevel;//0-5 (0 if isArmored=false;)
    private boolean Armor;

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

}
