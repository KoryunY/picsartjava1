package Proj.Farm.Seed;

import Proj.Robot.RobotInterFace;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class SeedService extends Seeding{



    @Override
    public RobotInterFace CRobot() {
        super.CRobot();
        Seeding s=new Seeding();
        Scanner scanner=new Scanner(System.in);
        CRRbot(scanner,s);
        return s;
    }

    @Override
    public void CRRbot(Scanner scanner,RobotInterFace r) {
        super.CRRbot(scanner,this);
        System.out.println("Enter capacity in Kgs");
        this.setSeedsCapacity(scanner.nextDouble());
        System.out.println("Enter count of seed types:min 1");
        int x=scanner.nextInt();
        this.setSeedTypesCount(x);
        System.out.println("Now Enter all that seed type names");
        String[] types=new String[x];
        for (int i = 0; i <types.length ; i++) {
            System.out.println("Enter "+i+" type");
            types[i]=scanner.next();
        }
        this.setSeedTypes(types);


    }

    public String SeedingToTxt(Seeding seed) {
    String seedTxt;
    seedTxt=seed.getModelName()+","+seed.getYear()+","+seed.getWeight()+","+seed.getControlType()+","+seed.getSeedTypes()+"\n";
        return seedTxt;
    }
    public Seeding CreateFromFile(String line){
        String[] split=line.split(",");
        Seeding seed=new Seeding();
        seed.setModelName(split[0]);
        return seed;
    }

}
