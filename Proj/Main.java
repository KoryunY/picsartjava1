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
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        FileInputStream fin;
        boolean menuActive = true;
        while (menuActive) {
            System.out.println("Enter Command from here");
            System.out.println("1.Create Robots from 0");
            System.out.println("2.Read and Create Robots From existing data Files");
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
                                WarMachineService wService = new WarMachineService();
                                while (c != 0) {
                                    c--;
                                    WarMachines curr = (WarMachines) wService.CreateWarMachine();
                                    String text = wService.WarToTxt(curr);
                                    Robot.writeToFile(path + "\\" + name + ".txt", text);
                                }
                                break;
                            case 2:
                                DefenseService dService = new DefenseService();
                                while (c != 0) {
                                    c--;
                                    Defense curr = (Defense) dService.CreateDefense();
                                    String text = dService.DefenseToTxt(curr);
                                    Robot.writeToFile(path + "\\" + name + ".txt", text);
                                }
                                break;
                            case 3:
                                RescueService rService = new RescueService();
                                while (c != 0) {
                                    c--;
                                    Rescue curr = (Rescue) rService.CreateRescue();
                                    String text = rService.RescueToTxt(curr);
                                    Robot.writeToFile(path + "\\" + name + ".txt", text);
                                }
                                break;
                            case 4:
                                SprayerService sService = new SprayerService();
                                while (c != 0) {
                                    c--;
                                    Sprayer curr = (Sprayer) sService.CreateSprayer();
                                    String text = sService.SprayerToTxt(curr);
                                    Robot.writeToFile(path + "\\" + name + ".txt", text);
                                }
                                break;
                            case 5:
                                SeedService service = new SeedService();
                                while (c != 0) {
                                    c--;
                                    Seeding curr = (Seeding) service.CreateSeeding();
                                    String text = service.SeedingToTxt(curr);
                                    SeedService.writeToFile(path + "\\" + name, text);
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
                                WarMachineService wService=new WarMachineService();
                                arr=Robot.readFromFIle(path);
                                WarMachines[] warMachines=new WarMachines[arr.length];
                                for (int i = 0; i < arr.length; i++) {
                                    warMachines[i]=wService.WarFromTxt(arr[i]);
                                }
                                break;
                            case 2:
                                DefenseService dService=new DefenseService();
                                arr=Robot.readFromFIle(path);
                                Defense[] defenses=new Defense[arr.length];
                                for (int i = 0; i < arr.length; i++) {
                                    defenses[i]=dService.DefenseFromTxt(arr[i]);
                                }
                                break;
                            case 3:
                                RescueService rService=new RescueService();
                                arr=Robot.readFromFIle(path);
                                Rescue[] rescues=new Rescue[arr.length];
                                for (int i = 0; i < arr.length; i++) {
                                    rescues[i]=rService.RescueFromTxt(arr[i]);
                                }
                                rService.PrintRobotsYear2018andMore(rescues);
                                break;
                            case 4:
                                SprayerService sService=new SprayerService();
                                arr=Robot.readFromFIle(path);
                                Sprayer[] sprayers=new Sprayer[arr.length];
                                for (int i = 0; i < arr.length; i++) {
                                    sprayers[i]=sService.SprayerFromTxt(arr[i]);
                                }
                                break;
                            case 5:
                                SeedService service=new SeedService();
                                arr=Robot.readFromFIle(path);
                                Seeding[] seedings=new Seeding[arr.length];
                                for (int i = 0; i < arr.length; i++) {
                                    seedings[i]=service.SeedingFromTxt(arr[i]);
                                }

                                break;
                        }

                    }
                    break;
                case 3:
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
