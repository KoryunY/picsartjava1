package Proj.Farm.Spray;

import Proj.Farm.Seed.Seeding;

import java.util.List;
import java.util.Scanner;

public class SprayerService extends Sprayer{
    public Sprayer CreateSprayer(){
        Sprayer s=new Sprayer();
        Scanner scanner=new Scanner(System.in);
        CreateRobot(scanner,s);
        CreateFarm(scanner,s);
        System.out.println("Enter Your Sprayer Robot Sprayers Count");
        s.setSprayersCount(scanner.nextInt());
        System.out.println("Max Water Capacity in Litres");
        s.setMaxWaterCapacity(scanner.nextDouble());
        return s;
    }
    public String SprayerToTxt(Sprayer spray) {
        String sprayTxt;
        sprayTxt=FarmerToTxt(spray)+","+spray.getSprayersCount()+","+spray.getMaxWaterCapacity()+"\n";
        return sprayTxt;
    }
    public Sprayer SprayerFromTxt(String line){
        String[] split=line.split(",");
        Sprayer sprayer=new Sprayer();
        int i=0;
        i=FarmerFromTxt(sprayer,split,i);
        sprayer.setSprayersCount(Integer.parseInt(split[i++]));
        sprayer.setMaxWaterCapacity(Double.parseDouble(split[i++]));
        return sprayer;
    }
    public void PrintSprayerCount2MaxCapacity100(List<Sprayer> sprayers){
        for (int i = 0; i < sprayers.size(); i++) {
            if(sprayers.get(i).getSprayersCount()>=2 && sprayers.get(i).getMaxWaterCapacity()>=100)
                sprayers.get(i).PrintSprayerData();
        }
    }
}
