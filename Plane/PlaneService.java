package Plane;
import Plane.Plane;

import java.util.Scanner;

public class PlaneService {
    public Plane CreateNewPlane() {
        Plane plane = new Plane();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Plane Model");
        String model = s.next();
        System.out.println("Enter Plane Country");
        String country = s.next();
        boolean isDatatrue = false;
        while (!isDatatrue) {
            System.out.println("Enter Plane punlishing year from 1903 to 2020");
            int year = s.nextInt();
            if (year <= 2020 && year >= 1903) {
                isDatatrue = true;
                plane.setYear(year);
            }

        }
        isDatatrue = false;
        while (!isDatatrue) {
            System.out.println("Enter Plane hours in air from 0 to 10000");
            int hours = s.nextInt();
            if (hours <= 10000 && hours >= 0) {
                isDatatrue = true;
                plane.setHours(hours);
            }
        }
        System.out.println("Enter Plane is Plane military or not y/n");
        boolean isMilitary;
        char x = s.next().charAt(0);
        if (x == 'y' || x == 'Y') {
            isMilitary = true;
        } else isMilitary = false;

        isDatatrue = false;
        while (!isDatatrue) {
            System.out.println("Enter Plane's Weight from 1000 KG to 160000 KG");
            int weight = s.nextInt();
            if (weight <= 160000 && weight >= 1000) {
                isDatatrue = true;
                plane.setWeight(weight);
            }
        }
        isDatatrue = false;
        while (!isDatatrue) {
            System.out.println("Enter Plane's MAXIMAL Speed");
            int topSpeed = s.nextInt();
            if (topSpeed > 0) {
                isDatatrue = true;
                plane.setSpeed(topSpeed);
            }
        }
        isDatatrue = false;
        while (!isDatatrue) {
            System.out.println("Enter Plane's number of seats");
            int seatsNum = s.nextInt();
            if (seatsNum > 0) {
                isDatatrue = true;
                plane.setSeats(seatsNum);
            }
        }
        isDatatrue = false;
        while (!isDatatrue) {
            System.out.println("Enter Plane's Cost");
            double cost = s.nextDouble();
            if (cost > 0) {
                isDatatrue = true;
                plane.setCost(cost);
            }
        }


        plane.setModel(model);
        plane.setCountry(country);
        plane.setMilitary(isMilitary);

        return plane;
    }

    public void printpriForMil(Plane plane) {
        if (plane.isMilitary()) System.out.println("Cost:" + plane.getCost() + ";topSpeed:" + plane.getSpeed());
        else System.out.println("Model" + plane.getModel() + ";Country" + plane.getCountry());
    }

    public Plane retNewer(Plane plane1, Plane plane2) {
        if (plane1.getYear() >= plane2.getYear()) return plane1;
        return plane2;
    }

    public void prntSmlstseatcnt(Plane plane1, Plane plane2, Plane plane3) {
        Plane min;
        if (plane1.getSeats() <= plane2.getSeats()) min = plane1;
        else min = plane2;
        if (plane3.getSeats() < min.getSeats()) min = plane3;
        System.out.println("Country of Smallest Seats plane Was:" + min.getCountry());
    }

    public void printNotMilPlns(Plane[] planes) {
        for (int i = 0; i < planes.length; i++) {
            if (!planes[i].isMilitary()) planes[i].printPlaneData();
        }
    }

    public void printMilNdAir100(Plane[] planes) {
        for (int i = 0; i < planes.length; i++) {
            if (planes[i].isMilitary() && planes[i].getHours() >= 100) planes[i].printPlaneData();
        }
    }

    public Plane minWeightPlane(Plane[] planes) {
        Plane min = planes[0];
        for (int i = 1; i < planes.length; i++) {
            if (planes[i].getWeight() <= min.getWeight()) min = planes[i];
        }
        return min;
    }

    public Plane minCostMil(Plane[] planes) {
        Plane min=planes[0];
        for (int i = 0; i < planes.length; i++) {
            if (planes[i].isMilitary()) {
                min = planes[i];
                break;
            }
        }
        for (int i = 0; i < planes.length; i++) {
            if (planes[i].isMilitary() && planes[i].getCost() < min.getCost())
                min = planes[i];


        }
        return min;
    }
    public void sortAscByYear(Plane[] planes){
        boolean isActive=true;
        Plane temp;
        int forsCount=0;
        while (isActive){
            isActive=false;
            for (int i = 0; i < planes.length-forsCount-1; i++) {
                if (planes[i].getYear()>planes[i+1].getYear()){
                    temp=planes[i];
                    planes[i]=planes[i+1];
                    planes[i+1]=temp;
                    isActive=true;
                }
            }
            forsCount++;
        }
        System.out.print("Planes Sorted By Ascenning Order:{ ");
        for (int i = 0; i < planes.length; i++) {
            planes[i].printPlaneData();
        }
        System.out.print("}\n");
    }
}