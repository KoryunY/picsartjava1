package Proj;
import Proj.Farm.Seed.SeedService;
import Proj.Farm.Seed.Seeding;
import Proj.Military.Arm.Armed;
import Proj.Military.Arm.WarMachines.WarMachines;
import Proj.Robot.Robot;
import Proj.Military.Military;
import Proj.Farm.Farmer;
import Proj.Robot.RobotInterFace;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.SortedMap;

public class Main {

    public static void main(String[] args) throws IOException {
        FileInputStream fin;
        boolean menuActive = true;
        while (menuActive) {
            System.out.println("Enter Command from here");
            System.out.println("1.Create Seeding Farm Robot");
            System.out.println("2.Read Seeding From File");
              System.out.println("20.Exit");
            Scanner x = new Scanner(System.in);
            int cmd = x.nextInt();
            switch (cmd) {
                case 1:

                    System.out.println("how many?");
                    int c=x.nextInt();
                    System.out.println("meke location tu chgitem orinak ");
                    String path=x.next();
                    System.out.println("Yhyn hima location unenq u avelcnelov etanq axper jan :D");
                    String name="seeding.txt";
                    File file =new File(path+"\\"+name);
                    file.createNewFile();
                    SeedService service=new SeedService();
                    while(c!=0){
                        c--;
                        String text=service.SeedingToTxt((Seeding) service.CRobot());
                        SeedService.writeToFile(path+"\\"+name,text);
                    }


                    break;
                case 2:
                    SeedService service1=new SeedService();
                    String[] arr=Robot.readFromFIle("C:\\Users\\Koryun\\IdeaProjects\\homework2\\src\\seeding.txt");
                    Seeding Kartoshka=service1.CreateFromFile(arr[1]);
                    System.out.println("Kartoshkit anuny"+Kartoshka.getModelName());
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
