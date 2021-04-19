package Plane;
import Plane.Plane;
import Plane.PlaneService;

import java.util.Scanner;

public class AirportTest {
    public static void main(String[] args) {
        PlaneService service = new PlaneService();
        Plane plane1 = service.CreateNewPlane();
        Plane plane2 = service.CreateNewPlane();
        Plane plane3 = service.CreateNewPlane();
        Plane[] Planes={plane1,plane2,plane3};
        boolean menuActive = true;
        while (menuActive) {
            System.out.println("Enter Command from here");
            System.out.println("1.Print cost and topSpeed if the plane is military otherwise print model and country");
            System.out.println("2.Return the plane which one is newer");
            System.out.println("3.Print country of the plane with smallest seats count");
            System.out.println("4.Print all not military planes.");
            System.out.println("5.Print all military planes which were in air more than 100 hours.");
            System.out.println("6.Return the plane with minimal weight");
            System.out.println("7.Return the plane with minimal cost from all military plane");
            System.out.println("8.Print planes in ascending form order by year");
            System.out.println("9.Exit");
            Scanner x = new Scanner(System.in);
            int cmd = x.nextInt();
            switch (cmd) {
                case 1:
                    service.printpriForMil(plane1);
                    break;
                case 2:
                    System.out.println(service.retNewer(plane1,plane2).getModel());
                    break;
                case 3:
                    service.prntSmlstseatcnt(plane1,plane2,plane3);
                    break;
                case 4:
                    service.printNotMilPlns(Planes);
                    break;
                case 5:
                    service.printMilNdAir100(Planes);
                    break;
                case 6:
                    System.out.println(service.minWeightPlane(Planes).getModel());
                    break;
                case 7:
                    System.out.println(service.minCostMil(Planes).getModel());;
                    break;
                case 8:
                    service.sortAscByYear(Planes);
                    break;
                case 9:
                    menuActive = false;
                    break;
                default:
                    System.out.println("Invalid Command Number");

            }
        }
    }
}
