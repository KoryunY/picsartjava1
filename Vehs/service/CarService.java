package CARS.Main.service;

import CARS.Main.model.Car;

import java.util.Scanner;

public class CarService {
    public Car CreateNewCar(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Manufacturer");
        String manufacturer =s.next();

        System.out.println("Enter Model Name");
        String modelName=s.next();

        System.out.println("Is Car New or used?y/n");
        boolean factoryNew=s.next()=="y"?true:false;

        System.out.println("Enter Car COlor");
        String carColor=s.next();

        System.out.println("When Car released");
        int rYear=s.nextInt();

        System.out.println("Car price?");
        int price=s.nextInt();

        Car car=new Car();
        car.setColor(carColor);
        car.setIsfactoryNew(factoryNew);
        car.setPriceInUsd(price);
        car.setManufacturer(manufacturer);
        car.setModelName(modelName);
        car.setReleaseYear(rYear);

        return car;
    }
    public Car expensiveCar(Car[] cars){
        Car max=cars[0];
        for(int i=1;i<cars.length;i++){
            if(cars[i].getPriceInUsd()>max.getPriceInUsd())max=cars[i];
        }
        return max;
    }
    public void printCarsArrayModelName(Car[] cars){
        System.out.print("CarsArray:{");
        for (Car car:cars) {
            System.out.print(car.getModelName()+";");
        }
        System.out.print("}");
        System.out.println();
    }
    public Car[] orderByYearDescending(Car[] cars){
        boolean isActive=true;
        Car temp;
        int forsCount=0;
        while(isActive){
            isActive=false;
            for (int i = 0; i <cars.length-1-forsCount; i++) {
                if(cars[i].getReleaseYear()<cars[i+1].getReleaseYear()){
                temp=cars[i];
                cars[i]=cars[i+1];
                cars[i+1]=temp;
                isActive=true;
                }
            }
            forsCount++;
        }
        return  cars;
    }
}
