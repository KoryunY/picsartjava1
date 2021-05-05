package Proj;

import Proj.Farm.Seed.SeedService;
import Proj.Farm.Seed.Seeding;
import Proj.Farm.Spray.Sprayer;
import Proj.Farm.Spray.SprayerService;
import Proj.Military.Arm.Defensive.Defense;
import Proj.Military.Arm.Defensive.DefenseService;
import Proj.Military.Arm.WarMachines.WarMachineService;
import Proj.Military.Arm.WarMachines.WarMachines;
import Proj.Military.Resc.Rescue;
import Proj.Military.Resc.RescueService;
import Proj.Robot.Robot;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        List<WarMachines> warRobots=new ArrayList<>();
        List<Defense> defRobots=new ArrayList<>();
        List<Rescue> rescueRobots=new ArrayList<>();
        List<Seeding> seedingRobots=new ArrayList<>();
        List<Sprayer> sprayerRobots=new ArrayList<>();
        SeedService service = new SeedService();
        SprayerService sService=new SprayerService();
        RescueService rService = new RescueService();
        DefenseService dService=new DefenseService();
        WarMachineService wService = new WarMachineService();


        FileInputStream fin;
        boolean menuActive = true;
        while (menuActive) {
            System.out.println("Enter Command from here");
            System.out.println("1.Create Robots from 0");
            System.out.println("2.Read and Create Robots From existing data Files");
            System.out.println("3.Print Specific Robots");
            System.out.println("4.Defense Type of Minimal time Overheating Robot WhichHasExtraArmor");
            System.out.println("5.Print Sprayer Robots which SprayersCount>2 MaxCapacity>100");
            System.out.println("6.Print All SeedTypes for Seeder which has Max Capacity");
            System.out.println("7.Sort War Machines by Kills Count");
            System.out.println("20.Exit");
            Scanner x = new Scanner(System.in);
            int cmd = x.nextInt();
            switch (cmd) {
                case 1:
                    boolean cr0Active=true;
                    while (cr0Active) {
                        System.out.println("---------------------");
                        System.out.println("Any Digit Input out of range to Return previous Menu");
                        System.out.println("---------------------");
                        System.out.println("Chose Robo type");
                        System.out.println("Military Robots");
                        System.out.println("1.WarMachines");
                        System.out.println("2.Defensive Machine");
                        System.out.println("Military unArmed Roobot");
                        System.out.println("3.Rescue Robot");
                        System.out.println("Farming Robots");
                        System.out.println("4.Sprayer Robot");
                        System.out.println("5.Seed Planter Robot");
                        System.out.println("---------------------");
                        int cmd1 = x.nextInt();
                        if (cmd1<1  || cmd1>6)break;
                        System.out.println("Number of Machines u want to create??");
                        int c = x.nextInt();
                        System.out.println("Now Tell me Where to save? ");
                        String path = x.next();
                        System.out.println("File Name?");
                        String name = x.next();
                        System.out.println("NoW Magic begins :D");
                        File file = new File(path + "\\" + name + ".txt");
                        file.createNewFile();
                        switch (cmd1) {
                            case 1:
                                while (c != 0) {
                                    c--;
                                    WarMachines curr = (WarMachines) wService.CreateWarMachine();
                                    String text = wService.WarToTxt(curr);
                                    Robot.writeToFile(path + "\\" + name + ".txt", text);
                                    warRobots.add(curr);
                                }
                                break;
                            case 2:
                                while (c != 0) {
                                    c--;
                                    Defense curr = (Defense) dService.CreateDefense();
                                    String text = dService.DefenseToTxt(curr);
                                    Robot.writeToFile(path + "\\" + name + ".txt", text);
                                    defRobots.add(curr);
                                }
                                break;
                            case 3:
                                while (c != 0) {
                                    c--;
                                    Rescue curr = (Rescue) rService.CreateRescue();
                                    String text = rService.RescueToTxt(curr);
                                    Robot.writeToFile(path + "\\" + name + ".txt", text);
                                    rescueRobots.add(curr);

                                }
                                break;
                            case 4:
                                while (c != 0) {
                                    c--;
                                    Sprayer curr = (Sprayer) sService.CreateSprayer();
                                    String text = sService.SprayerToTxt(curr);
                                    Robot.writeToFile(path + "\\" + name + ".txt", text);
                                    sprayerRobots.add(curr);

                                }
                                break;
                            case 5:
                                while (c != 0) {
                                    c--;
                                    Seeding curr = (Seeding) service.CreateSeeding();
                                    String text = service.SeedingToTxt(curr);
                                    SeedService.writeToFile(path + "\\" + name, text);
                                    seedingRobots.add(curr);
                                }
                                break;
                            case 0:
                                cr0Active=false;
                                break;
                        }
                    }
                    break;
                case 2:
                    boolean cr1Active=true;
                    while (cr1Active) {
                        System.out.println("---------------------");
                        System.out.println("Any Digit Input out of range to Return previous Menu");
                        System.out.println("---------------------");
                        System.out.println("Chose Robo type");
                        System.out.println("Military Robots");
                        System.out.println("1.WarMachines");
                        System.out.println("2.Defensive Machine");
                        System.out.println("Military unArmed Roobot");
                        System.out.println("3.Rescue Robot");
                        System.out.println("Farming Robots");
                        System.out.println("4.Sprayer Robot");
                        System.out.println("5.Seed Planter Robot");
                        System.out.println("---------------------");
                        int cmd1 = x.nextInt();
                        if (cmd1<1  || cmd1>6)break;
                        System.out.println("Give me you data path");
                        String path = x.next();
                        String[] arr;
                        switch (cmd1){
                            case 1:
                                arr=Robot.readFromFIle(path);
                                WarMachines[] warMachines=new WarMachines[arr.length];
                                for (int i = 0; i < arr.length; i++) {
                                    warMachines[i]=wService.WarFromTxt(arr[i]);
                                    warRobots.add(warMachines[i]);
                                }
                                break;
                            case 2:
                                arr=Robot.readFromFIle(path);
                                Defense[] defenses=new Defense[arr.length];
                                for (int i = 0; i < arr.length; i++) {
                                    defenses[i]=dService.DefenseFromTxt(arr[i]);
                                    defRobots.add(defenses[i]);
                                }
                                break;
                            case 3:
                                arr=Robot.readFromFIle(path);
                                Rescue[] rescues=new Rescue[arr.length];
                                for (int i = 0; i < arr.length; i++) {
                                    rescues[i]=rService.RescueFromTxt(arr[i]);
                                    rescueRobots.add(rescues[i]);
                                }
                                break;
                            case 4:
                                arr=Robot.readFromFIle(path);
                                Sprayer[] sprayers=new Sprayer[arr.length];
                                for (int i = 0; i < arr.length; i++) {
                                    sprayers[i]=sService.SprayerFromTxt(arr[i]);
                                    sprayerRobots.add(sprayers[i]);
                                }
                                break;
                            case 5:
                                arr=Robot.readFromFIle(path);
                                Seeding[] seedings=new Seeding[arr.length];
                                for (int i = 0; i < arr.length; i++) {
                                    seedings[i]=service.SeedingFromTxt(arr[i]);
                                    seedingRobots.add(seedings[i]);
                                }

                                break;
                        }

                    }
                    break;
                case 3:
                    System.out.println("---------------------");
                    System.out.println("Chose Robo type");
                    System.out.println("Military Robots");
                    System.out.println("1.WarMachines");
                    System.out.println("2.Defensive Machine");
                    System.out.println("Military unArmed Roobot");
                    System.out.println("3.Rescue Robot");
                    System.out.println("Farming Robots");
                    System.out.println("4.Sprayer Robot");
                    System.out.println("5.Seed Planter Robot");
                    System.out.println("---------------------");
                    int cmd1=x.nextInt();
                    if (cmd1<1  || cmd1>6)break;
                    int c=0;
                        switch (cmd1){
                            case 1:
                                while (c<warRobots.size()){
                                    warRobots.get(c++).PrintWarMachineData();
                                }
                                break;
                            case 2:
                                while (c<defRobots.size()){
                                    defRobots.get(c++).PrintDefData();
                                }
                                break;
                            case 3:
                                while (c<rescueRobots.size()){
                                    rescueRobots.get(c++).PrintRescueData();
                                }
                                break;
                            case 4:
                                while (c<sprayerRobots.size()){
                                    sprayerRobots.get(c++).PrintSprayerData();
                                }
                                break;
                            case 5:
                                while (c<seedingRobots.size()){
                                    seedingRobots.get(c++).SeedingPrintData();
                                }
                                break;
                    }

                    break;
                case 4:
                    System.out.println(dService.RetDefTypeofMinOverheatTimeWhichHasExtraArmor(defRobots));
                    break;
                case 5:
                    sService.PrintSprayerCount2MaxCapacity100(sprayerRobots);
                    break;
                case 6:
                    service.PrintSeedTypesSeederCapacityMax(seedingRobots);
                    break;
                case 7:
                    Collections.sort(warRobots, new Comparator<>() {
                        @Override
                        public int compare(WarMachines o1, WarMachines o2) {
                            return o1.getKillsCount()-o2.getKillsCount();
                        }
                    });
                    break;
                case 20:
                    menuActive = false;
                    break;
                default:
                    System.out.println("Invalid Command Number");

            }
        }
    }
}
