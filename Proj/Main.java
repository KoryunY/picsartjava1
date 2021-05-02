package Proj;
import Proj.Farm.Seed.Seeding;
import Proj.Military.Arm.Armed;
import Proj.Military.Arm.WarMachines.WarMachines;
import Proj.Robot.Robot;
import Proj.Military.Military;
import Proj.Farm.Farmer;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FileInputStream fin;
        boolean menuActive = true;
        while (menuActive) {
            System.out.println("Enter Command from here");
            System.out.println("1.Create Seeding Farm Robot");
              System.out.println("20.Exit");
            Scanner x = new Scanner(System.in);
            int cmd = x.nextInt();
            switch (cmd) {
                case 1:
                    System.out.println("how many?");
                    int c=x.nextInt();


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
