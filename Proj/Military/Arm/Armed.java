package Proj.Military.Arm;

import Proj.Military.Military;
import Proj.RobotInterFace;

public abstract class Armed extends Military implements RobotInterFace {
    private int GunsCount;// min 1
    private double[] mm;
    private int ammo;
    private boolean camouflagePaint;




}
