package home4;

public class Hm4 {
    public static void main(String[] args)
    {
    car car1=new car();
    car1.manufacturer="Honda";
    car1.releaseYear=1999;
    car1.factoryNew=false;
    car1.modelname="CRV";
    car1.setPriceInUsd(3500);
    car1.color="Green";

    car car2=new car();
    car2.manufacturer="BMW";
    car2.releaseYear=1987;
    car2.factoryNew=false;
    car2.modelname="E30";
    car2.setPriceInUsd(2000);
    car2.color="Black";

    car car3=new car();
    car3.manufacturer="Tesla";
    car3.releaseYear=2021;
    car3.factoryNew=true;
    car3.modelname="Model y";
    car3.setPriceInUsd(60000);
    car3.color="Red";

    car1.printCarData();
    car2.printCarData();
    car3.printCarData();
    }
}
