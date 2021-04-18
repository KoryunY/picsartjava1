package CARS.Main.Main;
import CARS.Main.model.Car;
import CARS.Main.service.CarService;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        CarService service=new CarService();
     Car car1=service.CreateNewCar();
     Car car2=service.CreateNewCar();
     Car car3=service.CreateNewCar();
    Car[] Cars={car1,car2,car3};
        boolean menuActive=true;
    while(menuActive){
        System.out.println("Enter Command from here");
        System.out.println("1.PrinInfoCar1");
        System.out.println("2.Highest Price");
        System.out.println("3.Sort by descending");
        System.out.println("4.Print array");
        System.out.println("5.Exit");
        Scanner x=new Scanner(System.in);
        int cmd=x.nextInt();
        switch (cmd){
            case 1:
                car1.printCarData();
                break;
            case 2:
                System.out.println("Car with highest price is:"+service.expensiveCar(Cars).getModelName());
                break;
            case 3:
                service.orderByYearDescending(Cars);
                break;
            case 4:
                service.printCarsArrayModelName(Cars);
                break;
            case 5:
                menuActive=false;
                break;
            default:
                System.out.println("Invalid Command Number");

        }

    }
    }
}
