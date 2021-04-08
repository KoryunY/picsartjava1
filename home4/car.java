package home4;

public class car {
    public String manufacturer;
    public String modelName;
    public boolean factoryNew=true;
    public String color;
    public int releaseYear;
    private int priceInUsd=0;
    public  int getPriceInUsd(){
        return priceInUsd;
    }
    public void setPriceInUsd(int priceInUsd){
        this.priceInUsd=priceInUsd;
    }
    public void printCarData(){
        if(manufacturer!=null)
        System.out.println("Manufacturer:"+manufacturer);
        if(modelName !=null)
            System.out.println("Model:"+ modelName);
        if(factoryNew)
            System.out.println("New or Used?:"+"New");
        else System.out.println("New or Used?:"+"Used");
        if(color!=null)
            System.out.println("Color:"+color);
        if (releaseYear!=0)
            System.out.println("Released In:"+releaseYear);
        if (priceInUsd!=0)
            System.out.println("Price:"+getPriceInUsd());
        System.out.println("......................................");
    }

}
