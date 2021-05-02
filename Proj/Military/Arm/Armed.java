package Proj.Military.Arm;

import Proj.Military.Military;

public abstract class Armed extends Military  {
    private int GunsCount;// min 1
    private double[] CalibresInMm;
    private int ammo;
    private double GunsOverLoadingTime;
    private double GunsRotationSpeed;
    private int MaxRange;

    public int getGunsCount() {
        return GunsCount;
    }

    public void setGunsCount(int gunsCount) {
        if (gunsCount>=1)GunsCount = gunsCount;
    }

    public double[] getCalibresInMm() {
        return CalibresInMm;
    }

    public void setCalibresInMm(double[] calibresInMm) {
        CalibresInMm = calibresInMm;
    }

    public int getAmmo() {
        return ammo;
    }

    public void setAmmo(int ammo) {
        if (ammo>0)
        this.ammo = ammo;
    }

    public double getGunsRotationSpeed() {
        return GunsRotationSpeed;
    }

    public void setGunsRotationSpeed(double gunsRotationSpeed) {
        if (gunsRotationSpeed>0)
        GunsRotationSpeed = gunsRotationSpeed;
    }

    public int getMaxRange() {
        return MaxRange;
    }

    public void setMaxRange(int maxRange) {
        MaxRange = maxRange;
    }
}
