package Proj;
import Proj.Military.Arm.Armed;
import Proj.Military.Arm.WarMachines.WarMachines;
import Proj.Robot.Robot;
import Proj.Military.Military;
import Proj.Farm.Farmer;
public class Main {
    public static void main(String[] args) {
        WarMachines g=new WarMachines();
        g.setArmorLevel(999);
        g.setYear(3000);
        g.setrName("Terminator");

        g.printData();
    }

}
