package Proj.Farm.Seed;

import Proj.Robot.Robot;
import Proj.Robot.RobotInterFace;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class SeedService extends Seeding {


    public Seeding CreateSeeding() {
        Seeding s = new Seeding();
        Scanner scanner = new Scanner(System.in);
        CreateRobot(scanner, s);
        CreateFarm(scanner, s);
        System.out.println("Enter capacity in Kgs");
        s.setSeedsCapacity(scanner.nextDouble());
        System.out.println("Enter count of seed types:min 1");
        int x = scanner.nextInt();
        s.setSeedTypesCount(x);
        System.out.println("Now Enter all that seed type names");
        String[] types = new String[x];
        for (int i = 0; i < types.length; i++) {
            System.out.println("Enter " + (i+1) + " type");
            types[i] = scanner.next();
        }
        s.setSeedTypes(types);
        return s;
    }

    public String SeedingToTxt(Seeding seed) {
        String seedTxt;
        String[] types=seed.getSeedTypes();
        seedTxt = FarmerToTxt(seed)+seed.getSeedsCapacity()+","+seed.getSeedTypesCount();
        for (String x:
             types) {
            seedTxt+=","+x;
        }
        return seedTxt +"\n";
    }

    public Seeding SeedingFromTxt(String line) {
        String[] split = line.split(",");
        int i=0;
        Seeding seed = new Seeding();
        i=FarmerFromTxt(seed,split,i);
        seed.setSeedsCapacity(Double.parseDouble(split[i++]));
        seed.setSeedTypesCount(Integer.parseInt(split[i++]));
        String[] types=new String[seed.getSeedTypesCount()];
        for (int j = 0; j < seed.getSeedTypesCount(); j++) {
            types[j]=split[i++];
        }
        seed.setSeedTypes(types);
        return seed;
    }

}
