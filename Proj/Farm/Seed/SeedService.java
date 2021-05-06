package Proj.Farm.Seed;

import java.util.List;
import java.util.Scanner;

public class SeedService extends Seeding {


    public Seeding CreateSeeding() {
        Seeding s = new Seeding();
        Scanner scanner = new Scanner(System.in);
        CreateRobot(scanner);
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
    public void PrintSeedTypesSeederCapacityMax(List<Seeding> seedings){
        Seeding max=seedings.get(0);
        for (int i = 1; i <seedings.size() ; i++) {
            if (seedings.get(i).getSeedsCapacity()>max.getSeedsCapacity())max=seedings.get(i);
        }
        String[] types=max.getSeedTypes();
        System.out.print("{");
        for (String x:
             types) {
            System.out.println(x+",");
        }
        System.out.print("}\n");
    }
}
