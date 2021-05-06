package Proj.Military.Arm;

import Proj.Military.Military;

import java.util.Scanner;

public abstract class Armed extends Military  {
    private int GunsCount=1;// min 1
    private int ammoTypesCount=1;
    private double[] CalibresInMm;
    private int ammo;
    private double GunsOverLoadingTime;
    private double GunsRotationSpeed=1;
    private int MaxRange;

    public int getAmmoTypesCount() {
        return ammoTypesCount;
    }

    public void setAmmoTypesCount(int ammoTypesCount) {
        if (ammoTypesCount>1)
        this.ammoTypesCount = ammoTypesCount;
    }

    public double getGunsOverLoadingTime() {
        return GunsOverLoadingTime;
    }

    public void setGunsOverLoadingTime(double gunsOverLoadingTime) {
        if (gunsOverLoadingTime>0)
        GunsOverLoadingTime = gunsOverLoadingTime;
    }

    public int getGunsCount() {
        return GunsCount;
    }

    public void setGunsCount(int gunsCount) {
        if (gunsCount>1)GunsCount = gunsCount;
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
        if (ammo>=0)
        this.ammo = ammo;
    }

    public double getGunsRotationSpeed() {
        return GunsRotationSpeed;
    }

    public void setGunsRotationSpeed(double gunsRotationSpeed) {
        if (gunsRotationSpeed>1 && gunsRotationSpeed<100)
        GunsRotationSpeed = gunsRotationSpeed;
    }

    public int getMaxRange() {
        return MaxRange;
    }

    public void setMaxRange(int maxRange) {
        if (maxRange>0)
        MaxRange = maxRange;
    }

    public void CreateArmed(Scanner scanner, Armed armed){
        System.out.println("How many Guns your Armed Robot have?");
        armed.setGunsCount(scanner.nextInt());
        System.out.println("How many different calibre types ammo ur Robot have?");
        armed.setAmmoTypesCount(scanner.nextInt());
        System.out.println("Set All diff calibres ammo types (7,62 ,5,56,0,09 .etc)");
        double[] calibres=new double[armed.getAmmoTypesCount()];
        for (int i = 0; i <armed.getAmmoTypesCount(); i++) {
            System.out.println("Enter " + (i+1) + " type");
            calibres[i]=scanner.nextDouble();
        }
        armed.setCalibresInMm(calibres);
        System.out.println("How many patrons your Robot Have?)");
        armed.setAmmo(scanner.nextInt());
        System.out.println("Guns OverLoading Time?");
        armed.setGunsOverLoadingTime(scanner.nextInt());
        System.out.println("Guns Rotation max speed (lap/second)");
        armed.setGunsRotationSpeed(scanner.nextDouble());
        System.out.println("Set operational Range in metres");
        armed.setMaxRange(scanner.nextInt());

    }
    public String ArmedToTxt(Armed armed) {
        String armedTxt;
        double[] calibres=armed.getCalibresInMm();
        armedTxt = MilToTxt(armed)+armed.getGunsCount()+","+armed.getAmmoTypesCount();
        for (int i = 0; i < armed.getAmmoTypesCount(); i++) {
            armedTxt+=","+armed.getCalibresInMm()[i];
        }
        return armedTxt+","+armed.getAmmo()+","+armed.getGunsOverLoadingTime()
                +","+armed.getGunsRotationSpeed()+","+armed.getMaxRange()+",";
    }
    public int ArmedFromTxt(Armed armed,String[] split,int i){
        i=MilFromTxt(armed,split,i);
        armed.setGunsCount(Integer.parseInt(split[i++]));
        armed.setAmmoTypesCount(Integer.parseInt(split[i++]));
        double[] calibres=new double[armed.getAmmoTypesCount()];
        for (int j = 0; j < armed.getAmmoTypesCount(); j++) {
            calibres[j]=Double.parseDouble(split[i++]);
        }
        armed.setCalibresInMm(calibres);
        armed.setAmmo(Integer.parseInt(split[i++]));
        armed.setGunsOverLoadingTime(Double.parseDouble(split[i++]));
        armed.setGunsRotationSpeed(Double.parseDouble(split[i++]));
        armed.setMaxRange(Integer.parseInt(split[i++]));
        return i;
    }

    @Override
    public void PrintRobotData() {
        super.PrintRobotData();
        System.out.println("GunsCount "+GunsCount);
        System.out.print("Set All diff calibres ammo types");
        for (int i = 0; i <CalibresInMm.length ; i++) {
            System.out.print(CalibresInMm[i]);
        }
        System.out.println();
        System.out.println("All Ammo in the bag:)"+ammo);
        System.out.println("Overload time:"+GunsOverLoadingTime+"min");
        System.out.println("Guns Rotation max speed:"+GunsRotationSpeed+"lap/second");
        System.out.println("Robot operational Range:"+MaxRange+"metres");
    }
}
